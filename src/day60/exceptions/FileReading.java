package day60.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReading {
    public static void main(String[] args) throws IOException {

        List<String> allLines = Files.readAllLines(Paths.get("C:\\Users\\admin\\IdeaProjects\\JavaPractice\\src\\day60\\note"));

        int sum = 0;
        for (String eachLine : allLines) {
            System.out.println(eachLine.charAt(eachLine.length() - 1));
            sum += Integer.parseInt(eachLine.charAt(eachLine.length() - 1) + "");
        }
        System.out.println("sum = " + sum);

    }
}
