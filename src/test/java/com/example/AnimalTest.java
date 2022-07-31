package com.example;

import com.example.animalTests.AnimalGetFamilyTest;
import com.example.animalTests.AnimalGetFoodNormalAnimalKindTest;
import com.example.animalTests.AnimalGetFoodWrongAnimalKindTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AnimalGetFamilyTest.class,
        AnimalGetFoodWrongAnimalKindTest.class,
        AnimalGetFoodNormalAnimalKindTest.class
})

public class AnimalTest {
}
