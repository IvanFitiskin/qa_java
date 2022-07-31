package com.example;

import com.example.lionTests.LionCommonTest;
import com.example.lionTests.LionConstructorWrongSexTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        LionCommonTest.class,
        LionConstructorWrongSexTest.class,
})

public class LionTest {
}
