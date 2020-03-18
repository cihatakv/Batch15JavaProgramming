package repl.repl201_225;

public class Repl204 {
    public static boolean isAnagram(String word1, String word2) {
        word1 = word1.toLowerCase().replace(" ", "");
        word2 = word2.toLowerCase().replace(" ", "");

        if (word1.length() != word2.length())
            return false;
        char[] arrWord1 = word1.toCharArray();
        char[] arrWord2 = word2.toCharArray();

        for (int i = 0; i < arrWord1.length - 1; i++) {
            for (int j = 0; j < arrWord1.length - i - 1; j++) {
                if (arrWord1[j] > arrWord1[j + 1]) {
                    char temp = arrWord1[j];
                    arrWord1[j] = arrWord1[j + 1];
                    arrWord1[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arrWord2.length - 1; i++) {
            for (int j = 0; j < arrWord2.length - i - 1; j++) {

                if (arrWord2[j] > arrWord2[j + 1]) {
                    char temp = arrWord2[j];
                    arrWord2[j] = arrWord2[j + 1];
                    arrWord2[j + 1] = temp;
                }
            }
        }

        boolean isEqual = true;

        for (int i = 0; i < arrWord1.length; i++) {
            if (arrWord1[i] != arrWord2[i]) {
                isEqual = false;
                break;
            }
        }

        return isEqual;

    }

    public static boolean isAnagram2(String word1, String word2) {
        word1 = word1.toLowerCase().replace(" ", "");
        word2 = word2.toLowerCase().replace(" ", "");

        boolean isAnagram = true;
        if (word1.length() != word2.length()) {
            isAnagram = false;
        } else {
            for (int x = 0; x < word1.length(); x++) {
                if (!word2.contains("" + word1.charAt(x))) {
                    isAnagram = false;
                }
            }
        }
        return isAnagram;
    }

    public static boolean isAnagram3(String word1, String word2) {

        word1 = word1.toLowerCase().replace(" ", "");
        word2 = word2.toLowerCase().replace(" ", "");
        if (word1.length() != word2.length())
            return false;
        for (int i = 0; i < word1.length(); i++) {
            // word2 = word2.replace(String.valueOf(word1.charAt(i)), "");
            word2 = word2.replace(word1.charAt(i) + "", "");
        }
        return (word2.length() == 0);

    }

    public static void main(String[] args) {

//        System.out.println(isAnagram("listen", "Silent"));
//        System.out.println(isAnagram("earth", "heart"));
//        System.out.println(isAnagram("star", "rats"));
//        System.out.println(isAnagram("hi", "bye"));
//        System.out.println(isAnagram("java", "cava"));

        System.out.println(isAnagram3("listen", "silent"));

    }
}
