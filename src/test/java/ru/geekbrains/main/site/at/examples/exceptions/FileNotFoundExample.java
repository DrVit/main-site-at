package ru.geekbrains.main.site.at.examples.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExample {
//    public static void main(String[] args) {
//        File file = new File("/pathname/to/file");
//        try {
//            FileReader reader = new FileReader(file);
//            System.out.println("Dangerous code!");
//        } catch (FileNotFoundException exception) {
//            System.out.println("Exception has been catched!");
//        } catch (IOException exception) {
//
//        } finally {
//            System.out.println("I'm finally and I have been executed!");
//        }
//    }
        public static void main(String[] args) {
            FileReaderExample reader = new FileReaderExample();
            try {
                reader.readFile("/123/");
            } catch (FileNotFoundException exception) {
                exception.printStackTrace();
            }

        }
}
