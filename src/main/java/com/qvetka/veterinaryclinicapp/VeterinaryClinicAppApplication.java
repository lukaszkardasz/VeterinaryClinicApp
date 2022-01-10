package com.qvetka.veterinaryclinicapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class VeterinaryClinicAppApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(VeterinaryClinicAppApplication.class, args);

        AnimalDto testAnimal1 = new AnimalDto( "cat", "Puszek", "male", "ginger", null, null, null, null, 120, 900);
        AnimalDto testAnimal2 = new AnimalDto( "dog", "Reksio", "male", "black&white", null, null, null, null, 100, 600);
        AnimalDto testAnimal3 = new AnimalDto( "dog", "Azor", "male", "grey", null, null, null, null, 110, 1000);



        AnimalService animalService = context.getBean(AnimalService.class);

        animalService.add(testAnimal1);
        animalService.add(testAnimal2);
        animalService.add(testAnimal3);

        double testPayment1 = animalService.healForDays(1L, 2, "testOwnerId_001");
        System.out.printf("Należność za leczenie zwierzaka o id: %s wynosi: %.2f PLN\n", testAnimal1.getId(), testPayment1);
        animalService.dischargeAnimal(1L);

        double testPayment2 = animalService.healForHours(2L, 2, "testOwnerId_002");
        System.out.printf("Należność za leczenie zwierzaka o id: %s wynosi: %.2f PLN`\n", testAnimal2.getId(), testPayment2);

        animalService.deleteById(3L);
        System.out.println("Usuwam zwierzę o id: 3");

        int healedAnimalsCount = animalService.countHealedAnimals();
        System.out.println("Wypisaliśmy: " + healedAnimalsCount + " zwierzę.");

        Optional<Animal> animalByName = animalService.findAnimalByName("Puszek");
        System.out.println("Szukane zwierzę: " + animalByName.isPresent());

        List<AnimalDto> cats = animalService.findAllBySpieceUnderThreatment("cat");
        System.out.println("Lista wszystkich leczonych kotów:");
        cats.forEach(System.out::println);

        List<AnimalDto> threatedAnimals = animalService.findAllHealedAnimals();
        System.out.println("Lista wszystkich leczonych zwierząt:");
        threatedAnimals.forEach(System.out::println);

        UserRepository userRepository = context.getBean(UserRepository.class);
        userRepository.findAll().forEach(System.out::println);
    }
}
