package com.example.genderdetector.model;

import com.example.genderdetector.resources.FilePaths;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Names {

    private String fullName;

    public Names(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String determineGenderSimpleVersion() {
        int femaleNameCounter = 0;
        int maleNameCounter = 0;
        CSVReader csvReader = new CSVReader();
        String[] name = fullName.split("\\s+");
        femaleNameCounter += csvReader.findNameInFile(name[0],FilePaths.FEMALE_NAMES.getPath());
        maleNameCounter += csvReader.findNameInFile(name[0],FilePaths.MALE_NAMES.getPath());
        if (maleNameCounter == femaleNameCounter) return "INCONCLUSIVE";
        if (maleNameCounter > femaleNameCounter) return "MALE";
        return "FEMALE";
    }

    public String determineGenderFullVersion() {
        int femaleNameCounter = 0;
        int maleNameCounter = 0;
        CSVReader csvReader = new CSVReader();
        String[] name = fullName.split("\\s+");
        for (String s : name) {
            femaleNameCounter += csvReader.findNameInFile(s, FilePaths.FEMALE_NAMES.getPath());
            maleNameCounter += csvReader.findNameInFile(s, FilePaths.MALE_NAMES.getPath());
        }
        if (maleNameCounter == femaleNameCounter) return "INCONCLUSIVE";
        if (maleNameCounter > femaleNameCounter) return "MALE";
        return "FEMALE";
    }

}
