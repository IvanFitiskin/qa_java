package com.example;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class AnimalTest {

    @Test
    public void getFamilyIsStringStaticValue() {
        Animal animal = new Animal();

        assertEquals(
                "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи",
                animal.getFamily()
        );
    }

    @Test
    @Parameters(method = "parametersToGetFoodTest")
    public void getFoodStringCorrectStringListOfFoods(
            String argumentValue,
            List<String> expectedValue
    ) throws Exception {
        Animal animal = new Animal();

        assertEquals(expectedValue, animal.getFood(argumentValue));
    }

    @Test(expected = Exception.class)
    @Parameters(method = "parametersToGetFoodThrowsExceptionTest")
    public void getFoodThrowsExceptionWhenInitialisedWithWrongAnimalKind(
            String expected
    ) throws Exception {
        Animal animal = new Animal();
        animal.getFood(expected);
    }

    private Object[] parametersToGetFoodTest() {
        return new Object[] {
                new Object[] { "Травоядное", List.of("Трава", "Различные растения") },
                new Object[] { "Хищник", List.of("Животные", "Птицы", "Рыба") },
        };
    }

    private Object[] parametersToGetFoodThrowsExceptionTest() {
        return new Object[] {
                // Последняя буква в слове "Травоядноe" указана латиницей
                new Object[] { "Травоядноe" },
                new Object[] { "Всеядный" },
        };
    }

}
