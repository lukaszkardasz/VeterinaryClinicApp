package com.qvetka.veterinaryclinicapp;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface AnimalRepository extends CrudRepository<Animal, Long> {

    List<Animal> findAllBySpieceIgnoreCase(String spiece);
    Optional<Animal> findAnimalByName(String name);
    int countAllByOwnerIdIsNotNull();
    List<Animal> findAllByOwnerIdIsNullOrderByDateOfDischargeDesc();


}
