package com.qvetka.veterinaryclinicapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@SpringBootApplication
public class VeterinaryClinicAppApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(VeterinaryClinicAppApplication.class, args);

        EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);
        Employee employee1 = new Employee("Paweł", "Kowal", "doktor weterynarii", "12345", 12000.0);
        Employee employee2 = new Employee("Iza", "Kura", "stażysta", null, 2500.0);
        employeeRepository.save(employee1);
        employeeRepository.save(employee2);


        AnimalDto testAnimal4 = new AnimalDto( "cat", "Pusia", "female", "darkginger", null, null, null, null, 120, 900, null, null);
        AnimalDto testAnimal5 = new AnimalDto( "dog", "Fifek", "male", "black", null, null, null, null, 70, 400, null, null);
        AnimalDto testAnimal6 = new AnimalDto( "dog", "Ziomo", "male", "red", null, null, null, null, 150, 1700, null, null);

        AnimalService animalService = context.getBean(AnimalService.class);

        animalService.add(testAnimal4);
        animalService.add(testAnimal5);
        animalService.add(testAnimal6);

        double testPayment1 = animalService.healForDays(4L, 2, "4");
        System.out.printf("Należność za leczenie zwierzaka o id: %s wynosi: %.2f PLN\n", testAnimal4.getId(), testPayment1);
        animalService.dischargeAnimal(1L);

        double testPayment2 = animalService.healForHours(5L, 2, "5");
        System.out.printf("Należność za leczenie zwierzaka o id: %s wynosi: %.2f PLN`\n", testAnimal5.getId(), testPayment2);

//        animalService.deleteById(2L);
//        System.out.println("Usuwam zwierzę o id: 2");

        int healedAnimalsCount = animalService.countHealedAnimals();
        System.out.println("Wypisaliśmy: " + healedAnimalsCount + " zwierzę.");

        List<AnimalDto> cats = animalService.findAllBySpieceUnderThreatment("cat");
        System.out.println("Lista wszystkich leczonych kotów:");
        cats.forEach(System.out::println);

        List<AnimalDto> threatedAnimals = animalService.findAllHealedAnimals();
        System.out.println("Lista wszystkich leczonych zwierząt:");
        threatedAnimals.forEach(System.out::println);

        UserRepository userRepository = context.getBean(UserRepository.class);
        userRepository.findAll().forEach(System.out::println);

        new Scanner(System.in).nextLine();

    }
}
