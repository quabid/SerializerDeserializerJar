package com.gmail.quabidlord.objectserializer;

import java.io.PrintStream;

public class TestsCleaner {
    final static MyConstants constants = new MyConstants();
    final static PathValidator pathValidator =new PathValidator();
    final static PathRemover pathRemover = new PathRemover();
    final static PrintStream printer = new PrintStream(System.out);

    public static void main(String[] args) {
        printer.println("About to delete file " + constants.cleanupSerializedPath + ".");        
        if (pathValidator.pathExists(constants.cleanupSerializedPath)) {
            pathRemover.removePath(constants.cleanupSerializedPath);
            printer.println("File " + constants.cleanupSerializedPath + " deleted.");
        }

        printer.println("");

        printer.println("About to delete file " + constants.cleanupTest1Path + ".");        
        if (pathValidator.pathExists(constants.cleanupTest1Path)) {
            pathRemover.removePath(constants.cleanupTest1Path);
            printer.println("File " + constants.cleanupTest1Path + " deleted.");
        }
    }
}
