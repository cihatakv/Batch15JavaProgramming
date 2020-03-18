package repl.repl101_125;

import java.util.Scanner;

public class ParseHtml_102 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String html = scan.nextLine();
        int start = html.indexOf("id") + 4;
        int end = html.lastIndexOf("\"");
        if (html.contains("<html>")) {
            System.out.println(html.substring(start, end));
        } else
            System.out.println("Invalid input!");

    }
}
/*
Write a program, that will read html variable and
output attribute value of id attribute (tag) into
the console. Input will be provided in a single
line as outlined below. If html variable doesn't
contain <html> attribute, print out into the console
message: "Invalid input!".

input: <!DOCTYPE html><html><head><title>Java</title></head><body><p id="myid"></p></body></html>


 */