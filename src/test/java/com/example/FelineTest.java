package com.example;

import com.example.felineTests.FelineCommonTest;
import com.example.felineTests.FelineGetKittensTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        FelineCommonTest.class,
        FelineGetKittensTest.class,
})

public class FelineTest {
}
