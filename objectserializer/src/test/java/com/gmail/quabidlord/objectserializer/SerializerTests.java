package com.gmail.quabidlord.objectserializer;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.PrintStream;

import org.junit.Test;

public class SerializerTests {
    @Test
    public void shouldReturnPassing() {
        PrintStream printer = new PrintStream(System.out);
        MyConstants constants = new MyConstants();
        Serializer serializer = new Serializer();
        SomeObject someObj = new SomeObject(455, 888);
        PathValidator pathValidator = new PathValidator();
        PathRemover pathRemover = new PathRemover();

        if (pathValidator.pathExists(constants.deleteSerializedPath)) {
            pathRemover.removePath(constants.deleteSerializedPath);
            printer.println("File " + constants.deleteSerializedPath + " deleted.");
        }

        assertFalse(pathValidator.pathExists(constants.destinationPath));
        serializer.serialize(someObj, constants.destinationPath);

        assertTrue(pathValidator.pathExists(constants.destinationPath));
        assertFalse(!pathValidator.pathExists(constants.destinationPath));

        try {
            Thread.sleep(3233);
        } catch (InterruptedException ie) {
            return;
        }

        if (pathValidator.pathExists(constants.deleteSerializedPath)) {
            pathRemover.removePath(constants.deleteSerializedPath);
            printer.println("File " + constants.deleteSerializedPath + " deleted.");
        }

        assertFalse(pathValidator.pathExists(constants.destinationPath));
    }
}
