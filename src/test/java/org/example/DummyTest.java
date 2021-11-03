package org.example;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.annotations.TestData;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Collection;

@Concurrent(threads = "30")
@RunWith(SerenityParameterizedRunner.class)
public class DummyTest {

    static {
        Serenity.throwExceptionsImmediately();
    }

    @Steps
    DummySteps dummySteps;

    String aString;

    public DummyTest(String aString) {
        this.aString = aString;
    }

    @TestData()
    public static Collection<Object[]> testData() {
        Object[][] x = new Object[100][1];
        for (int i = 0; i < x.length; i++) {
            x[i][0] = Integer.toString(i);
        }
        return Arrays.asList(x);
    }

    @Test
    public void aTest() throws InterruptedException {
        dummySteps.assertSmth();
        dummySteps.assertSmthElse();
    }
}
