package day34;

public class LoginActivity {
    // create login method with 2 parameters for username and password
    // check if they are "user" and "abc123"
    // if so print login successfull
    // else failed
    public static void loginMethod(String userName, String password) {
        if (userName.equals("user") && password.equals("abc123"))
            System.out.println("Login Successfull");
        else if (userName.equals("user") && !password.equals("abc123"))
            System.out.println("Password incorrect");
        else if (!userName.equals("user") && password.equals("abc123"))
            System.out.println("Username incorrect");
        else
            System.out.println("Both username and password incorrect");
    }

    //    2, login2 :  static method boolean return type
//    it has two String method paramters
//    called username and password
//            (it accept 2 String object as argument when being called)
//    it check whther username and password  "user" and "abc123"
//            if yes
//		return true
//                else
//                return false
    public static boolean loginMethod2(String userName, String password) {
        if (userName.equals("user") && password.equals("abc123"))
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println("loginMethod2 -> " + loginMethod2("user", "abc123"));
        loginMethod("userr", "abc");
        loginMethod("userr", "abc123");
        loginMethod("user", "abc");
        loginMethod("user", "abc123");
    }

}
