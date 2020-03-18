package day32;

public class WarmUpTask {
    public static void sayTheGoldenSentence() {
        String sentence = "I CAN'T DO IT";
        for (int i = 1; i <= 300; i++) {
            System.out.println(i + ". " + sentence.replace("'T", ""));
        }

    }

    public static void main(String[] args) {
        sayTheGoldenSentence();
    }
}
/*.
Oh did I mention the daily tasks you gotta do everyday ?
remove 'T from I CAN'T DO IT to generate -->> I CAN DO IT
repeat that 300 times daily
and create a method called sayTheGoldenSentence() for success!
 */