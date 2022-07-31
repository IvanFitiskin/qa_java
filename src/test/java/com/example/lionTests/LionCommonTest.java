package com.example.lionTests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

@RunWith(MockitoJUnitRunner.class)
public class LionCommonTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensWithoutArgumentIntOne() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        Mockito.when(feline.getKittens()).thenReturn(1);

        assertEquals("Return value should be 1", 1, lion.getKittens());
    }

    @Test
    public void doesHaveManeIsTrue() throws Exception {
        Lion lion = new Lion(feline, "Самец");

        assertTrue("hasMane property value is not corrected", lion.doesHaveMane());
    }

    @Test
    public void doesHaveManeIsFalse() throws Exception {
        Lion lion = new Lion(feline, "Самка");

        assertFalse("hasMane property value is not corrected", lion.doesHaveMane());
    }

    @Test
    public void whenGetFoodIsFelineFoods() throws Exception {
        Lion lion = new Lion(feline, "Самка");
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        assertEquals("List of food is not corrected", List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

}