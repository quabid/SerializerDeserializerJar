package com.gmail.quabidlord.objectserializer;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DeserializerTests {
    Deserializer deserializer = new Deserializer();
    Serializer serializer = new Serializer();
    SomeObject someObject = new SomeObject(878, 999);
    MyConstants constants = new MyConstants();

    @Test
    public void shouldReturnPassing() {
        serializer.serialize(someObject, constants.destinationPath);
        SomeObject so = null;
        so = (SomeObject) deserializer.deserialize(constants.destinationPath);
        constants.printer.println("X: " + so.x + " Y: " + so.y);
        assertTrue(so.x == 878);
        assertTrue(so.y == 999);
    }
}
