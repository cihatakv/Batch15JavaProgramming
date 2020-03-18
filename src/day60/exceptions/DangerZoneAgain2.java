package day60.exceptions;

import java.io.FileNotFoundException;

public class DangerZoneAgain2 {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

        readMyFile();
        Thread.sleep(3000);

    }

    public static void readMyFile() throws FileNotFoundException {
        System.out.println("Reading file in my computer");
    }
}
