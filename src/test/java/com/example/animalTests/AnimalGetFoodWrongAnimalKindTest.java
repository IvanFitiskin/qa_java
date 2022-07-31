package com.example.animalTests;

import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class AnimalGetFoodWrongAnimalKindTest {

    private final String argumentValue;

    public AnimalGetFoodWrongAnimalKindTest(String argumentValue) {
        this.argumentValue = argumentValue;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
                // Последняя буква в слове "Травоядноe" указана латиницей
                { "Травоядноe" },
                { "Всеядный" },
        };
    }

    @Test(expected = Exception.class)
    public void getFoodWrongAnimalKindThroughException() throws Exception {
        Animal animal = new Animal();
        animal.getFood(argumentValue);
    }

}
