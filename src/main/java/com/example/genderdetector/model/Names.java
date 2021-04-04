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
        System.out.println(femaleNameCounter);
        System.out.println(maleNameCounter);
        if (maleNameCounter == femaleNameCounter) return "INCONCLUSIVE";
        if (maleNameCounter > femaleNameCounter) return "MALE";
        if (maleNameCounter < femaleNameCounter) return "FEMALE";
        return "";
    }

    public String determineGenderFullVersion() {
        int femaleNameCounter = 0;
        int maleNameCounter = 0;
        CSVReader csvReader = new CSVReader();
        String[] name = fullName.split("\\s+");
        for (int i = 0; i < name.length ; i++) {
            femaleNameCounter += csvReader.findNameInFile(name[i],FilePaths.FEMALE_NAMES.getPath());
            maleNameCounter += csvReader.findNameInFile(name[i],FilePaths.MALE_NAMES.getPath());
        }
        if (maleNameCounter == femaleNameCounter) return "INCONCLUSIVE";
        if (maleNameCounter > femaleNameCounter) return "MALE";
        if (maleNameCounter < femaleNameCounter) return "FEMALE";
        return "";
    }

}
