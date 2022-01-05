package com.qvetka.veterinaryclinicapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class VeterinaryClinicAppApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(VeterinaryClinicAppApplication.class, args);

        NewAnimalDto testAnimal1 = new NewAnimalDto(1L, "cat", "Puszek", 20, 120);
        NewAnimalDto testAnimal2 = new NewAnimalDto(2L, "dog", "Reksio", 25, 140);
        NewAnimalDto testAnimal3 = new NewAnimalDto(3L, "dog", "Azor", 25, 170);
        NewAnimalDto testAnimal4 = new NewAnimalDto(4L, "guinea pig", "Otto", 8, 70);
        NewAnimalDto testAnimal5 = new NewAnimalDto(5L, "hamster", "Jagoda", 5, 60);
        NewAnimalDto testAnimal6 = new NewAnimalDto(6L, "cat", "Sheldon", 40, 190);

        AnimalService animalService = context.getBean(AnimalService.class);

        animalService.add(testAnimal1);
        animalService.add(testAnimal2);
        animalService.add(testAnimal3);
        animalService.add(testAnimal4);
        animalService.add(testAnimal5);
        animalService.add(testAnimal6);


    }

}
