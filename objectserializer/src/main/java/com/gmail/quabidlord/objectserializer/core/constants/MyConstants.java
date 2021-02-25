package com.gmail.quabidlord.objectserializer.core.constants;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.nio.file.FileSystems;

public class MyConstants {
    public final String OS = System.getProperty("os.name").toLowerCase();
    public final String OS_ARCH = System.getProperty("os.arch").toLowerCase();
    public final String OS_VERSION = System.getProperty("os.version").toLowerCase();
    public final String FILESEPARATOR = FileSystems.getDefault().getSeparator();
    public final String LINESEPARATOR = System.getProperty("line.separator");
    public final String USRDIR = System.getProperty("user.dir") + FILESEPARATOR;
    public final String USRHOME = System.getProperty("user.home") + FILESEPARATOR;
    public final String destinationPath = USRDIR + "serialized.ser";
    public final String deleteSerializedPath = USRDIR + "serialized.ser";
    public final String cleanupSerializedPath = USRDIR + "objectserializer" + FILESEPARATOR + "serialized.ser";
    public final String deleteTest1Path = USRDIR + "test1.txt";
    public final String cleanupTest1Path = USRDIR + "objectserializer" + FILESEPARATOR + "test1.txt";
    public final String testFile1 = USRDIR + "test1.txt";
    public final String testFile2 = USRDIR + "test2.txt";
    public final PrintStream printer = new PrintStream(System.out);

    public final void createFile() {
        TestObject obj = new TestObject(testFile1, testFile2);
        try {
            FileOutputStream fos = new FileOutputStream(testFile1);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            // ioe.printStackTrace();
            return;
        }

    }

    class TestObject {
        String[] datum = new String[2];

        public TestObject(String d1, String d2) {
            datum[0] = d1;
            datum[1] = d2;
        }
    }

}
