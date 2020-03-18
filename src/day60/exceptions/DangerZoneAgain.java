package day60.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class DangerZoneAgain {
    public static void main(String[] args) throws InterruptedException, IOException { //FileNotFoundException


        System.out.println("THE START");
        try {
            //  calling a method that declare to throws checked exception
            readMyFile();
        } catch (FileNotFoundException e) {
            System.out.println("HANDLING HERE !!! JUST MOVING ON !!");
        }
        // Thread class is coming from java.lang package
        // it has a method called sleep and it will let your program pause for x milliseconds
        Thread.sleep(3000);
        System.out.println("The end ");

    }
    // document this method to tell the caller , the file you are about to read might not exists
    // and handle the consequences yourself
    // the exception type already exists for this type of situation is called
    // FileNotFoundException from java.util package

    public static void readMyFile() throws IOException {

        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            System.out.println("Aha !! CAught you in readMyFile !!!");
            List<String> allLines = Files.readAllLines(Paths.get("C:\\Users\\admin\\IdeaProjects\\JavaPractice\\src\\day60\\hero.txt"));
            System.out.println("allLines = " + allLines);
        }
        System.out.println("Reading the file in my computer");
        throw new FileNotFoundException("Kaboom ! file is not here!!! ");


    }

}
