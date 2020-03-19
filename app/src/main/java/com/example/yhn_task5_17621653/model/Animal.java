package com.example.yhn_task5_17621653.model;

public class Animal {
    private String animalName;
    private int pictureId;

    public Animal(String name, int pictureId) {
        this.animalName = name;
        this.pictureId = pictureId;
    }

    public String getAnimalName() {
        return animalName;
    }

    public int getPictureId() {
        return pictureId;
    }

}

