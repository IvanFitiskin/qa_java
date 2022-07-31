package com.example;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(JUnitParamsRunner.class)
public class FelineTest {

    @Test
    public void eatMeatIsPredatorFoods() throws Exception {
        Feline feline = new Feline();

        assertEquals(
                List.of("Животные", "Птицы", "Рыба"),
                feline.eatMeat()
        );
    }

    @Test
    public void getFamilyWithoutArgumentStaticFelineString() {
        Feline feline = new Feline();

        assertEquals(
                "Кошачьи",
                feline.getFamily()
        );
    }

    @Test
    public void getKittensWithoutArgumentOneResult() {
        Feline feline = new Feline();

        assertEquals( 1, feline.getKittens());
    }

    @Test
    @Parameters({
            "0, 0",
            "1, 1",
            "5, 5",
            "-1, -1"
    })
    public void getKittensWithIntArgumentSameResult(int argumentValue, int expectedValue) {
        Feline feline = new Feline();

        assertEquals( expectedValue, feline.getKittens(argumentValue));
    }

}
