package exercise.codingBat;

public class MethodsCodingBat {


    public static boolean nearHundred(int n) {

        return (Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10);

    }

    /*
    Given 2 int values, return true if one is negative and one is positive.
    Except if the parameter "negative" is true, then return true only if both are negative.


posNeg(1, -1, false) → true
posNeg(-1, 1, false) → true
posNeg(-4, -5, true) → true

     */
    public static boolean posNeg(int a, int b, boolean negative) {
        if (negative == false) {
            return (a * b < 0);
        } else if (negative && Math.abs(a - b) > (a + b))
            return (a * b > 0);
        else
            return false;
    }

    public static String missingChar(String str, int n) {
        return str.replace(str.charAt(n) + "", "");
    }

    public static String frontBack(String str) {
        if (str.length() < 2)
            return str;
        String middle = str.substring(1, str.length() - 1);
        return str.charAt(str.length() - 1) + middle + str.charAt(0);
    }

    public static String front3(String str) {
        if (str.length() < 4)
            return str + str + str;
        else
            return str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);
    }

    public static String backAround(String str) {
        return str.charAt(str.length() - 1) + str + str.charAt(str.length() - 1);
    }

    public static boolean loneTeen(int a, int b) {
        return ((a > 12 && a < 20) && !(b > 12 && b < 20) || (b > 12 && b < 20) && !(a > 12 && a < 20));
    }

    /*
    Given a string, if the string "del" appears starting at index 1,
    return a string where that "del" has been deleted.
    Otherwise, return the string unchanged.


delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
     */
    public static String delDel(String str) {
        if (!(str.length() < 4) && str.substring(1, 4).equals("del")) {
            str = str.replace("del", "");
        }
        return str;
    }

    public static int close10(int a, int b) {
        if (Math.abs(a - 10) < Math.abs(b - 10))
            return a;
        else if ((Math.abs(a - 10) == Math.abs(b - 10)))
            return 0;
        else
            return b;
    }

    /*

Given two temperatures, return true if one is less than 0 and the other is greater than 100.
icyHot(120, -1) → true
icyHot(-1, 120) → true
icyHot(2, 120) → false
     */

    /*
    We'll say that a number is "teen" if it is in the range 13..19 inclusive.
    Given 2 int values, return true if one or the other is teen, but not both.
     */

    public static int max1020(int a, int b) {
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        // Knowing a is bigger, just check a first
        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
    }

    public static boolean stringE(String str) {

        int cntE = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e')
                cntE++;
        }

        if (cntE > 0 && cntE < 4)
            return true;
        else
            return false;

    }

    public static String frontTimes(String str, int n) {
        String strA = "";
        if (str.length() > 3) {
            for (int i = 0; i < n; i++) {
                strA += str.substring(0, 3);
            }
        } else
            for (int i = 0; i < n; i++) {
                strA += str.substring(0, str.length());
            }
        return strA;
    }

    /*
    Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
countXX("abcxx") → 1          countXX("xxx") → 2        countXX("xxxx") → 3
     */
    public static int countXX(String str) {
        int cntXx = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).toLowerCase().equals("xx"))
                cntXx++;
        }
        return cntXx;
    }

    public static boolean doubleX(String str) {
        boolean status = false;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x') {
                if (str.substring(i, i + 2).toLowerCase().equals("xx")) {
                    status = true;
                    break;
                } else
                    return false;
            }
        }
        return status;
    }

    public static String stringBits(String str) {
        String temp = "";

        for (int i = 0; i < str.length(); i += 2) {
            temp += str.charAt(i);
        }
        return temp;


    }

    // stringSplosion("Code") → "CCoCodCode"
    //stringSplosion("abc") → "aababc"
    //stringSplosion("ab") → "aab"
    public static String stringSplosion(String str) {
        String strA = "";
        for (int i = 0; i < str.length(); i++) {
            strA += str.substring(0, i + 1);
        }
        return strA;
    }

    public static int last2(String str) {
        String subStr = str.substring(str.length() - 2);
        int cnt = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals(subStr))
                cnt++;
        }
        return cnt;
    }

    public static int arrayCount9(int[] nums) {
        int cnt = 0;
        for (int each : nums) {
            if (each == 9)
                cnt++;
        }
        return cnt;
    }

    public static boolean array123(int[] nums) {

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i] == 2 && nums[i] == 3)
                return true;
        }

        return false;

    }

    // Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
//
//
//stringMatch("xxcaazz", "xxbaaz") → 3
//stringMatch("abc", "abc") → 2
//stringMatch("abc", "axc") → 0
    public static int stringMatch(String a, String b) {
        int minLength;
        if (a.length() < b.length())
            minLength = a.length();
        else
            minLength = b.length();
        int cnt = 0;
        for (int i = 0; i < minLength - 1; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2)))
                cnt++;
        }

        return cnt;

    }

    // Given a string, return a version where all the "x" have been removed.
    // Except an "x" at the very start or end should not be removed.
    // stringX("xxHxix") → "xHix"
    // stringX("abxxxcd") → "abcd"
    // stringX("xabxxxcdx") → "xabcdx"
    public static String stringX(String str) {
        String temp = str.substring(1, str.length());

        String newStr = "";
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) != 'x')
                newStr = temp.charAt(i) + "";
        }
        return newStr;
    }

    public static boolean has23(int[] nums) {
        for (int i = 0; i < 2; i++)
            return (nums[i] == 2 || nums[i] == 3);
        return false;
    }

    public static boolean arrayFront9(int[] nums) {
        int cnt = 1;
        for (int each : nums) {
            if (cnt < 5) {
                if (each == 9)
                    return true;
            }
            cnt++;
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {4, 3};
        System.out.println("has23([4, 3]) = " + has23(arr));

        System.out.println(stringMatch("xxcaazz", "xxbaaz"));
        System.out.println(stringMatch("abc", "abc"));
        System.out.println(stringMatch("abc", "axc"));
        // System.out.println(stringBits("Heeololeo"));

        //        System.out.println(nearHundred(89));
//        System.out.println("==========");
//        System.out.println(posNeg(1, -1, false));
//        System.out.println("==========");
//        System.out.println(frontBack("cihat"));


        // int[] arr2 = Arrays.sort(arr);

        // System.out.println(max1020(10, 21));
//        System.out.println(frontTimes("ch", 2));
//        System.out.println(countXX("abcxx"));
//        System.out.println("==========");
//        System.out.println(doubleX("axxbb"));

    }

    public String front22(String str) {
        if (str.length() < 3)
            return str + str + str;
        return str.substring(0, 2) + str + str.substring(0, 2);
    }

    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);

    }

    // Given 2 int values, return true if either of them is in the range 10..20 inclusive.
    public boolean in1020(int a, int b) {
        return (a < 21 && a > 9) | (b > 9 && b < 21);
    }

    /*
    Given 2 int values, return true if they are both
    in the range 30..40 inclusive, or
    they are both in the range 40..50 inclusive.
     */
    public boolean in3050(int a, int b) {
        return (((a > 29 && a < 41) && (b > 29 && b < 41)) || ((a > 39 && a < 51) && (b > 39 && b < 51)));
    }

    public int array667(int[] nums) {

        int cnt = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7))
                cnt++;
        }

        return cnt;

    }

    public boolean noTriples(int[] nums) {

        for (int i = 0; i < nums.length - 2; i++) {
            if ((nums[i] == nums[i + 1]) && (nums[i + 1] == nums[i + 2]))
                return true;
        }
        return false;
    }

    /*
    Given an array of ints, return true if one of the
    first 4 elements in the array is a 9.
    The array length may be less than 4.
    arrayFront9([1, 2, 9, 3, 4]) → true
    arrayFront9([1, 2, 3, 4, 9]) → false
    arrayFront9([1, 2, 3, 4, 5]) → false

     */

    public String startWord(String str, String word) {
        if (str.startsWith(word))
            return word;
        else if (str.substring(1, word.length()).equals(word.substring(1)))
            return word;
        if (str.contains(word))
            return str.charAt(0) + "";

        return "";
    }

    public int[] front11(int[] a, int[] b) {
        int[] front = new int[2];
        if (a.length > 0 && b.length > 0) {
            front[0] = a[0];
            front[1] = b[0];
        } else if (a.length == 0) {
            front[0] = b[0];
            front[1] = b[1];
        } else if (b.length == 0) {
            front[0] = a[0];
            front[1] = a[1];
        }
        return front;

    }

}
