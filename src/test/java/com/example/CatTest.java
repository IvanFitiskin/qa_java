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
    Feline feline;

    @Test
    public void getSoundWithoutArgumentStaticString() {
        Cat cat = new Cat(feline);

        assertEquals("Return incorrect string value","Мяу", cat.getSound());
    }

    @Test
    public void whenGetFoodIsCatFoods() throws Exception {
        Cat cat = new Cat(feline);

        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        assertEquals("List of food is not corrected", List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }

}
