package com.qvetka.veterinaryclinicapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class VeterinaryClinicAppApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(VeterinaryClinicAppApplication.class, args);

        AnimalDto testAnimal1 = new AnimalDto(1L, "cat", "Puszek", 20, 120);
        AnimalDto testAnimal2 = new AnimalDto(2L, "dog", "Reksio", 25, 140);
        AnimalDto testAnimal3 = new AnimalDto(3L, "dog", "Azor", 25, 170);
        AnimalDto testAnimal4 = new AnimalDto(4L, "guinea pig", "Otto", 8, 70);
        AnimalDto testAnimal5 = new AnimalDto(5L, "hamster", "Jagoda", 5, 60);
        AnimalDto testAnimal6 = new AnimalDto(6L, "cat", "Sheldon", 40, 190);

        AnimalService animalService = context.getBean(AnimalService.class);

        animalService.add(testAnimal1);
        animalService.add(testAnimal2);
        animalService.add(testAnimal3);
        animalService.add(testAnimal4);
        animalService.add(testAnimal5);
        animalService.add(testAnimal6);

        double testPayment1 = animalService.healForDays(1L, 2, "testOwnerId_001");
        System.out.printf("Należność za leczenie zwierzaka o id: %s wynosi: %.2f PLN\n", testAnimal1.getId(), testPayment1);
        animalService.dischargeAnimal(1L);

        double testPayment2 = animalService.healForHours(2L, 2, "testOwnerId_002");
        System.out.printf("Należność za leczenie zwierzaka o id: %s wynosi: %.2f PLN`\n", testAnimal2.getId(), testPayment2);
    }

}
