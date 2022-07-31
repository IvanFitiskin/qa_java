package com.example.felineTests;

import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class FelineCommonTest {

    @Test
    public void eatMeatWithoutArgumentIsFelineFoods() throws Exception {
        Feline feline = new Feline();

        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamilyWithoutArgumentStaticFelineString() {
        Feline feline = new Feline();

        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensWithoutArgumentIntOne() {
        Feline feline = new Feline();

        assertEquals( 1, feline.getKittens());
    }

}
