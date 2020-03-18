package day11;

public class StringEqualityPractice {
    public static void main(String[] args) {
        System.out.println("I love ".concat("Java"));

        String myStr = "Java";
        System.out.println(myStr.equals("Java"));
        String yourStr = new String("Java");
        System.out.println("Is my string same as your string?");
        System.out.println(myStr.equals(yourStr));

        System.out.println("New Equals Check");
        if (myStr.equals("Java"))
            System.out.println("Correct Word");
        else if (myStr.equals("Java"))
            System.out.println("Pumpkin!!");
        else
            System.out.println("NOT JAVA NOR PUMPKIN");


    }
}
