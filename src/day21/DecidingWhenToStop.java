package day21;

public class DecidingWhenToStop {
    public static void main(String[] args) {
        String msg = "1234567890";
        int charCount = msg.length();
        int n = 2;

        for (int i = 0; i <= charCount - n; i+=2)
            System.out.println(msg.substring(i, i + n));

    }
}
