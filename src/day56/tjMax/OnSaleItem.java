package day56.tjMax;

public class OnSaleItem extends Item {

    private double discount;

    /**
     * public constructor with:
     *
     * @param name
     * @param catalogNumber
     * @param quantity
     * @param price
     */
    public OnSaleItem(String name, int catalogNumber, int quantity, double price, double discount) {
        super(name, catalogNumber, quantity, price - price * discount / 100);
        this.discount = discount;
    }
}
