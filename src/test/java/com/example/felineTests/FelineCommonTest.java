package com.example.felineTests;

import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class FelineCommonTest {

    @Test
    public void eatMeatWithoutArgumentIsFelineFoods() throws Exception {
        Feline feline = Mockito.spy(new Feline());

        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        assertEquals("List of food is not corrected", List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamilyWithoutArgumentStaticFelineString() {
        Feline feline = new Feline();

        assertEquals("Return incorrect string value", "Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensWithoutArgumentIntOne() {
        Feline feline = new Feline();

        assertEquals("Return value should be 1", 1, feline.getKittens());
    }

}
