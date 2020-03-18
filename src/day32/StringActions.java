package day32;

public class StringActions {
    public static void reversePrintMyOwnName() {
        String myName = "Cihat";
        for (int i = myName.length() - 1; i > 0; i--) {
            System.out.print(myName.charAt(i) + "-");
        }
        System.out.print(myName.charAt(0));
    }

    public static void main(String[] args) {
        reversePrintMyOwnName();
    }
}
