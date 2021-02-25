package com.gmail.quabidlord.objectserializer;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    MyConstants constants = new MyConstants();
    PathValidator pathValidator = new PathValidator();
    PathRemover pathRemover = new PathRemover();
    String destinationPath = constants.USRDIR + constants.FILESEPARATOR + "serialized.ser";

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
}
