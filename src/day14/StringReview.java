package day14;

public class StringReview {
    public static void main(String[] args) {
        String st1 = "I like pumpkin";
        System.out.println("Does it contain Pumkin?");
        System.out.println(st1.contains("Pumpkin"));
        boolean gotPumpkin = st1.contains("Pumpkin");

        System.out.println("gotPumpkin = " + gotPumpkin);
        boolean startedWithI = st1.startsWith("I");
        System.out.println("startedWithI = " + startedWithI);



    }
}
