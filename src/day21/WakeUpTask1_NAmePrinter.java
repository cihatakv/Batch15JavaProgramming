package day21;

public class WakeUpTask1_NAmePrinter {
    public static void main(String[] args) {
        String myName = "My name is Cihat";
        int i;
        int lastCharIndex = myName.length()-1;
        for (i = 0; i < lastCharIndex; i++)
            System.out.print(myName.substring(i, i+1) + "->");
        System.out.print(myName.charAt(i));
        System.out.println("\n---------------------------");

        for (i = 0; i <= lastCharIndex-1; i+=2){
            System.out.println(myName.substring(i, i+2));
        }

        System.out.println("---------------------------");
        for (i = 0; i <= lastCharIndex-2; i+=3){
            System.out.println(myName.substring(i, i+3));
        }
        System.out.println(myName.substring(i) + "__");
        System.out.println("---------------------------");

    }
}
/*
 2 , print the sentence by 2 character at a time
 		just by incrementing by 1
 3 , print the sentence by 3 character at a time
 4 , print the sentence by 4 character at a time
 */