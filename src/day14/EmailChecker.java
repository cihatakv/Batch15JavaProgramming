package day14;

public class EmailChecker {
    public static void main(String[] args) {
        String email = "cybertek@gmail.com";

        boolean containsAt = email.contains("@");

        boolean containSpace = email.contains(" ");

        if (!containsAt || containSpace)
            System.out.println("Invalid Email");
        else if (email.endsWith("@gmail.com"))
            System.out.println("GMAIL");
        else if (email.endsWith("@yahoo.com"))
            System.out.println("YAHOO");
        else if (email.endsWith("@mail.ru"))
            System.out.println("Russian Email");
        else
            System.out.println("Different Email");


    }
}
