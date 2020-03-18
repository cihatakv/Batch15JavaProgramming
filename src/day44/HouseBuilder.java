package day44;

public class HouseBuilder {

    public static void main(String[] args) {

        CyberHouse.showNeighbourhood();

        CyberHouse c1 = new CyberHouse("Vintage", 101);
        c1.showAllInfo();

        CyberHouse c2 = new CyberHouse("Classic", 102);
        c2.showAllInfo();

        //System.out.println(CyberHouse.neighbourhoodName);

        // short s = Short.MAX_VALUE;
    }
}
