package org.example;

import net.thucydides.core.annotations.Step;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertTrue;

public class DummySteps {

    @Step
    public void assertSmth() throws InterruptedException {
        sleep(500);
        assertTrue(true);
    }

    @Step
    public void assertSmthElse() throws InterruptedException {
        sleep(500);
        assertTrue(true);
    }
}
