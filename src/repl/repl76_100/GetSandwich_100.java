package repl.repl76_100;

import java.util.Scanner;

public class GetSandwich_100 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String output = "";

        if (str.contains("bread") && str.substring(str.indexOf("bread") + 1, str.length()).contains("bread")){
            for (int i = 0; i < str.length() - 5; i++) {
                if (str.substring(i, i + 5).equals("bread")) {
                    output = str.substring(i + 5, str.indexOf("bread", i + 6));
                    break;
                }
            }
        } else
            output = "nothing";


        System.out.println(output);
        }

        // Check how many bread in the string with substring
        // if there is 1 print nothing
        // else continiue to read until next bread

    }

