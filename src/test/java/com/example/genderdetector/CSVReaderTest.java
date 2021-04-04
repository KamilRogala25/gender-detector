package com.example.genderdetector;

import com.example.genderdetector.model.CSVReader;
import com.example.genderdetector.resources.FilePaths;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class CSVReaderTest {

    private CSVReader csvReader = new CSVReader();

    @Test
    public void testCSVReader(){
        assertEquals(csvReader.findNameInFile("ZYON", FilePaths.MALE_NAMES.getPath()),1); // does CSVReader work
        assertEquals(csvReader.findNameInFile("Zyon", FilePaths.MALE_NAMES.getPath()),1);
        assertEquals(csvReader.findNameInFile("GANKA", FilePaths.FEMALE_NAMES.getPath()),1);
    }

}
