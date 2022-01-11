package com.qvetka.veterinaryclinicapp;

public class AnimalNotFoundException extends RuntimeException{
    public void printStackTrace(){
        System.out.println("Nie znaleziono zwierzaka...");
    }
}
