package day19;

public class SumOfAllNumbersWithinTheRange {
    public static void main(String[] args) {
        int sum = 0;

        String numString = "";
        int i;
        for (i = 1; i < 20; i++) {
            numString += i + "+";
            sum += i;
        }
        numString += i + " = ";
        sum += i;
        System.out.print(numString);
        System.out.println(sum);
    }
}
