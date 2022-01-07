package com.qvetka.veterinaryclinicapp;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AnimalService {

    private final AnimalRepository animalRepository;

    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @Transactional
    public void add(AnimalDto newAnimal){
        Animal animal = new Animal(newAnimal.getSpiece(), newAnimal.getName(), newAnimal.getHourPrice(), newAnimal.getDayPrice());
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

    public List<AnimalDto> findAllHealedAnimals(){
        return animalRepository.findAllByDateOfDischargeIsNullOrderByDateOfDischargeDesc()
                .stream()
                .map(animal -> new AnimalDto(
                        animal.getSpiece(),
                        animal.getName(),
                        animal.getHourPrice(),
                        animal.getDayPrice()
                )).collect(Collectors.toList());
    }

    public List<AnimalDto> findAllBySpieceUnderThreatment(String spiece){
        return animalRepository.findAnimalsBySpieceEqualsAndDateOfDischargeIsNull(spiece)
                .stream()
                .map(animal -> new AnimalDto(
                        animal.getSpiece(),
                        animal.getName(),
                        animal.getHourPrice(),
                        animal.getDayPrice()
                )).collect(Collectors.toList());
    }

    public int countHealedAnimals(){
        return animalRepository.countAllByOwnerIdIsNotNull();
    }

    public Optional<Animal> findAnimalByName(String name){
        return Optional.ofNullable(animalRepository.findAnimalByName(name).orElseThrow(AnimalNotFoundException::new));
    }

}
