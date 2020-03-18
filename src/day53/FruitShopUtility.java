package day53;

public class FruitShopUtility {

    public static void main(String[] args) {

        Fruit f1 = new Apple("crispy but tasteless", "hot red", "Gala");
        Fruit f2 = new Orange("sour", "orange", 12);

        displayFruit(f1);
        displayFruit(f2);

        digestBetter(f1);
        Fruit f3 = getMyFavoriteFruit();
        System.out.println("f3 = " + f3);

    }

    public static void displayFruit(Fruit anyFruit) {
        System.out.println("Displaying fruit\n" + anyFruit.toString());
    }

    public static void digestBetter(Fruit anyFruit) {
        for (int i = 0; i < 4; i++) {
            anyFruit.getDigested();
        }
        System.out.println(anyFruit);
    }

    public static Fruit getMyFavoriteFruit() {
        return new Orange("Sour", "orange", 10);
    }

    public static Fruit getFavoriteByType(int type) {
        if (type == 1)
            return new Apple("Sweet", "blue", "ginger");
        else if (type == 2)
            return new Orange("crispy", "green", 100);
        else
            return null;
    }
}
