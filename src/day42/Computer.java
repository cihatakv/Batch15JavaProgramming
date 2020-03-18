package day42;

public class Computer {

    private String brand;
    private int ram;
    double price;

    public void runProgram() {
        System.out.println(this.brand + " is running program with the " + this.ram + " ram.");
    }

    public void calculate() {
        System.out.println(this.brand + " is calculating");
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    // ram can not be less than 1 more than 128
    public void setRam(int ram) {
        if (ram > 0 && ram < 129)
            this.ram = ram;
    }

    public int getRam() {
        return this.ram;
    }

    // price can not be less than 20
    public void setPrice(double price) {
        if (price > 19)
            this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    // toString method
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }
}
/*
Computer
	attributes:  make it private
		brand, ram (1-128) , price
	behaviour
		runProgram
			--> print brand is running program with the ram  (size)
		calculate
			-->> print brand is calculating
		add getters and setters to all the fields
 */