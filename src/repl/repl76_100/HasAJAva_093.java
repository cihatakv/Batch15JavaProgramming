package repl.repl76_100;

import java.util.Scanner;

public class HasAJAva_093 {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String first4Ch = "";

        if (word.length() >= 4){
            for (int i = 0; i <= 3; i++ ){
                if(word.charAt(0) == 'j'){
                    first4Ch += word.charAt(i) + "";
                    exists = true;
                } else if (word.charAt(1) == 'j'){
                    first4Ch += word.charAt(i+1) + "";
                    exists = true;
                } else
                    exists = false;
            }
        }

        System.out.println(exists);
    }
}
