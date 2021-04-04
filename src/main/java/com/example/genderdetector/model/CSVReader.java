package com.example.genderdetector.model;

import com.example.genderdetector.resources.FilePaths;
import lombok.NoArgsConstructor;

import java.io.*;

@NoArgsConstructor
public class CSVReader {


    public int findNameInFile(String name, String filePath) {
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(csvSplitBy);
                if (name.equalsIgnoreCase(values[0])) return 1;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;

    }
}
