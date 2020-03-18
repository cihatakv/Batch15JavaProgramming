package day54.Interface_As_Reference;

public class Utility {
    public static void main(String[] args) {

        Wearable w1 = new Clothes();
        wearMyWearable(w1);

        Wearable w2 = new Makeups();
        wearMyWearable(w2);

        Wearable w3 = new Watch();
        wearMyWearable(w3);

        Wearable w4 = new Perfume();
        wearMyWearable(w4);

        wearMyWearable(new Watch());


        System.out.println("\n ----calling the getMyWearableObject--- \n");
        Wearable result = getMyWearableObject();
        System.out.println("result = " + result);

        System.out.println(result.getClass().getSimpleName());
        wearMyWearable(result);
        System.out.println(result.toString().substring(result.toString().lastIndexOf(".") + 1, result.toString().indexOf('@')));

    }

    public static Wearable getMyWearableObject() {
        return new Clothes();
    }

    public static void wearMyWearable(Wearable any) {
        any.wear();
    }
}
