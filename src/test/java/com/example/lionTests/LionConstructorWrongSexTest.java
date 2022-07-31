package com.example.lionTests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class LionConstructorWrongSexTest {

    private final String argumentValue;

    public LionConstructorWrongSexTest(String argumentValue) {
        this.argumentValue = argumentValue;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
                // Первая буква в слове "Cамка" указана латиницей
                { "Cамка" },
                { "Терминатор" },
                { "" },
        };
    }

    @Mock
    Feline feline;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test(expected = Exception.class)
    public void lionConstructorWrongSexThrowsException() throws Exception {
        new Lion(feline, argumentValue);
    }

}
