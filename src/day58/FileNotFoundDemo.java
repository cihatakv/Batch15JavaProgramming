package day58;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileNotFoundDemo {

    public static void main(String[] args) {

        try {
            System.out.println("File exists????");
            Files.readAllLines(Paths.get("C:\\Dell\\files.txt"));
            System.out.println("File exists");
        } catch (IOException e) {
            System.out.println("Exception happened and caught");
            System.out.println("File doesn't exist");
        }

        System.out.println("After try catch");


    }
}
