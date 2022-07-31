package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Predator predator;

    @Test
    public void getSoundWithoutArgumentStaticString() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);

        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodIsPredatorFoods() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);

        Mockito.when(predator.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        assertEquals(
                "getFood() did not return values for Predator",
                List.of("Животные", "Птицы", "Рыба"),
                cat.getFood()
        );
    }

}
