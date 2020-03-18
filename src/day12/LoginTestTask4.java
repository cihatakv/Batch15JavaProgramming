package day12;

public class LoginTestTask4 {
    public static void main(String[] args) {
        //String str = "abc";

        String userName = "user123", password= "pass123";

        if (userName.equals("user123") && password.equals("pass123"))
            System.out.println("login successful");
        else if (!userName.equals("user123") && password.equals("pass123"))
            System.out.println("Username is not correct");
        else if (userName.equals("user123") && !password.equals("pass123"))
            System.out.println("Password is not correct");
        else
            System.out.println("Both username and password are not correct");
    }
}
