package day20;

public class FindDogInASentence {
    public static void main(String[] args) {
        String sentence = "I like dog , Dogs are cute , dogs are friendly";

        // read 3 characters at a time
        // if these 3 happen to be dog, we printout the index

        for (int i = 0; i < sentence.length() - 2; i++){
            if (sentence.substring(i, i + 3).equalsIgnoreCase("dog"))
                System.out.println(i);
        }

    }
}
