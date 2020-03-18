package day44;

public class CyberHouse {
    private static String neighbourhoodName = "Cybertek Ave";
    int houseNum;
    String design;

    public CyberHouse(String design, int houseNum) {
        this.houseNum = houseNum;
        this.design = design;
    }

    public static void showNeighbourhood() {
        System.out.println("neighbourhoodName = " + neighbourhoodName);
        // Can not access anything non-static inside static methods.
        // System.out.println("houseNum = " + houseNum);
    }

    public void showAllInfo() {
        System.out.println(houseNum + " " + design + " " + neighbourhoodName);
    }

}
/*
CyberHouse
	instance fields : houseNum, design
	static field : neighbourhoodName
	add 2 args constructor
		to set the houseNum, design
	instance method
		void showAllInfo()
			just print the houseNum, design neighbourhoodName in one line
	static void method showNeighborhood
		print the neighbourhoodName only
		// try to access houseNum, design and see what happen
 */