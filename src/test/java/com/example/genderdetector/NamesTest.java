package com.example.genderdetector;

import com.example.genderdetector.model.Names;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class NamesTest {

    @Test
    public void testNames() {
        assertEquals(new Names("Janusz Maria Rokita").determineGenderSimpleVersion(), "MALE");
        assertEquals(new Names("Marta Maria Rokita").determineGenderSimpleVersion(), "FEMALE");
        assertEquals(new Names("Inconclusive Maria Rokita").determineGenderSimpleVersion(), "INCONCLUSIVE");
        assertEquals(new Names("Janusz Maria Rokita").determineGenderFullVersion(), "MALE");
        assertEquals(new Names("Marta Maria Rokita").determineGenderFullVersion(), "FEMALE");
        assertEquals(new Names("Inconclusive Maria Rokita").determineGenderFullVersion(), "INCONCLUSIVE");
    }
}
