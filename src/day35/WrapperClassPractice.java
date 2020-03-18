package day35;

public class WrapperClassPractice {
    public static void main(String[] args) {
        Float f1 = 3.14f;
        float f2 = 3.14f;

        System.out.println(f1 == f2);
        System.out.println("===============");

        float f6 = Float.parseFloat("3.14f");
        float f7 = Float.valueOf("3.14f");
        System.out.println("f6 = " + f6);
        System.out.println("f7 = " + f7);

        System.out.println("==================");

        String sentence = "I bought 3 tomatoes and the price was 3.14 each";

        // How much is your final checkout

        String[] sentenceArr = sentence.split(" ");
        String priceString = sentenceArr[sentenceArr.length - 2].replace(",", ".");
        Float price = Float.parseFloat(priceString);
        int amount = Integer.parseInt(sentenceArr[2]);

        System.out.println("Total Cost = " + price * amount);

        float[] arr = new float[sentenceArr.length];

        arr[0] = Float.parseFloat(sentenceArr[0]);
        System.out.println("arr = " + arr[0]);


    }
}
