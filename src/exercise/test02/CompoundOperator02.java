package exercise.test02;

public class CompoundOperator02 {
    public static void main(String[] args) {
        double offer = 2d;
        double otherOffer = 12;
        offer++;
        ++offer;
        System.out.println("First offer: " + offer);
        otherOffer = offer++ + otherOffer;
        System.out.println("Other Offer: "+ otherOffer);

        System.out.println("Offer: " + offer);
        otherOffer--;
        otherOffer /= 2;
        System.out.println("Last Other Offer: " + otherOffer);
        //System.out.println(offer++);

        System.out.println("TEST " + offer++);



    }
}
