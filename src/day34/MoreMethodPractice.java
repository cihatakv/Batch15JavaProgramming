package day34;

public class MoreMethodPractice {
    public static void main(String[] args) {
        System.out.println(monkeyTrouble(true, true));
        System.out.println(monkeyTrouble(true, false));
        System.out.println(monkeyTrouble(false, false));
        System.out.println(monkeyTrouble(false, true));
    }

    /**
     * @param aSmile
     * @param bSmile
     * @return true only if both are smile or not smile, false if only one smile.
     */
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile == bSmile);
    }
}
