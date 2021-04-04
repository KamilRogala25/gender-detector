package com.example.genderdetector.resources;

public enum FilePaths {

    FEMALE_NAMES("src/main/resources/names/FemaleNames.csv"),
    MALE_NAMES("src/main/resources/names/MaleNames.csv");

    String path;

    FilePaths(String path) {
        this.path = path;
    }

    public String getPath(){
        return path;
    }

}
