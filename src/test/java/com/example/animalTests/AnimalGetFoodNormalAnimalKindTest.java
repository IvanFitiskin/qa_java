package com.example.animalTests;

import com.example.Animal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class AnimalGetFoodNormalAnimalKindTest {

    private final String argumentValue;
    private final List<String> expectedValue;

    public AnimalGetFoodNormalAnimalKindTest(String argumentValue, List<String> expectedValue) {
        this.argumentValue = argumentValue;
        this.expectedValue = expectedValue;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
                { "Травоядное", List.of("Трава", "Различные растения") },
                { "Хищник", List.of("Животные", "Птицы", "Рыба") },
        };
    }

    @Test
    public void getFoodStringExpectedStringListOfFoods() throws Exception {
        Animal animal = new Animal();

        assertEquals(expectedValue, animal.getFood(argumentValue));
    }

}
