package com.example.felineTests;

import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineGetKittensTest {

    private final int argumentValue;
    private final int expectedValue;

    public FelineGetKittensTest(int argumentValue, int expectedValue) {
        this.argumentValue = argumentValue;
        this.expectedValue = expectedValue;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
                { 1, 1 },
                { 5, 5 },
                { 0, 0 },
                { -1, -1 },
        };
    }

    @Test
    public void getKittensIntArgumentSameIntResult() {
        Feline feline = new Feline();

        assertEquals( expectedValue, feline.getKittens(argumentValue));
    }

}
