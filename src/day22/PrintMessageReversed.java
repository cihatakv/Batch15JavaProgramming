package day22;

public class PrintMessageReversed {
    public static void main(String[] args) {
        String msg = "I struggle with Java I Like Java I love Java Everything is Awesome!";
        int indexMessage = msg.length() - 1;
        // String reversedMsg = "";
        int aCount = 0;
        for (int i = 0; i <= indexMessage; i++) {
            if (i % 2 == 1)
                continue;
            System.out.print(msg.substring(i, i + 1));
        }
        System.out.println();
        for (int i = 0; i <= indexMessage; i++) {
            if (msg.substring(i, i + 1).equals("a")) {
                break;
            }
            System.out.print(msg.substring(i, i + 1));
        }
        System.out.println();
        for (int i = 0; i <= indexMessage; i++) {
            if (msg.substring(i, i + 1).equalsIgnoreCase("a")) {
                aCount++;
                if (aCount == 3)
                    break;
            }
            System.out.print(msg.substring(i, i + 1));
        }
    }
}
