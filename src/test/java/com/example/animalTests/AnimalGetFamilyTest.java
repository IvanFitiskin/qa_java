package com.example.animalTests;

import com.example.Animal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AnimalGetFamilyTest {

    @Test
    public void getFamilyWithoutArgumentStaticString() {
        Animal animal = new Animal();

        assertEquals(
                "Return incorrect string value",
                "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи",
                animal.getFamily()
        );
    }

}
