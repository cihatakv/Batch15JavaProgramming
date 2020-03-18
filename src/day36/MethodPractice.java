package day36;

public class MethodPractice {
    public static void main(String[] args) {

        System.out.println(checkIfStringHasNumber("sajhdkjashdljkah4hasjkhsdjklfh"));

    }

    // write a static method to accept a String and return Boolean(Yes Uppercase) .
    // it should return true if the String contains at least one number.
    public static Boolean checkIfStringHasNumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                return Boolean.valueOf(true);
        }
        return Boolean.valueOf(false);
    }
}
