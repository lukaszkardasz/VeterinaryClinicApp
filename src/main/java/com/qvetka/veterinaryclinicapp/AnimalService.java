package com.qvetka.veterinaryclinicapp;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;

@Service
public class AnimalService {

    private final AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @Transactional
    public void add(NewAnimalDto newAnimal){
        Animal animal = new Animal(newAnimal.getId(), newAnimal.getSpiece(), newAnimal.getName(), newAnimal.getHourPrice(), newAnimal.getDayPrice());
        animalRepository.save(animal);
    }

    @Transactional
    public void deleteById(Long animalId){
        animalRepository.deleteById(animalId);
    }
    @Transactional
    public double healForHours(Long animalId, int hours, String ownerId){
        LocalDateTime dateOfDischarge = LocalDateTime.now().plusHours(hours);
        double hourPrice = updateAnimal(animalId, dateOfDischarge, ownerId).getHourPrice();
        return hourPrice * hours;
    }

    @Transactional
    public double healForDays(Long animalId, int days, String ownerId){
        LocalDateTime dateOfDischarge = LocalDateTime.now().plusDays(days);
        double dayPrice = updateAnimal(animalId, dateOfDischarge, ownerId).getDayPrice();
        return dayPrice * days;
    }

    @Transactional
    public void dischargeAnimal(Long animalId){
        updateAnimal(animalId, null, null);
    }

    private Animal updateAnimal(Long animalId, LocalDateTime dateOfDischarge, String ownerId){
        Animal animal = animalRepository.findById(animalId)
                .orElseThrow(AnimalNotFoundException::new);
        animal.setDateOfDischarge(dateOfDischarge);
        animal.setOwnerId(ownerId);
        return animal;
    }

}
