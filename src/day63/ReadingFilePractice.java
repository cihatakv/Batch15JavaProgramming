package day63;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadingFilePractice {
    public static void main(String[] args) throws IOException {


        List<String> allData = Files.readAllLines(Paths.get("C:\\Users\\admin\\IdeaProjects\\JavaPractice\\src\\day63\\employeeData.txt"));

        Map<Integer, String> map = new HashMap<>();
        for (String eachLine : allData) {
            String[] arr = eachLine.split(",");
            map.put(Integer.parseInt(arr[0]), arr[1]);
        }

        System.out.println("map = " + map);
    }
}
