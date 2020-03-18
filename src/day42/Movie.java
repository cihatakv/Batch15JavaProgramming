package day42;

public class Movie {

    private String name;
    private double length;
    private String type;

    public Movie() { // constructor
        System.out.println("EMPTY MOVIE");
    }

    // write a constructor to set all the fields value
    public Movie(String name, double length, String type) {
        this.name = name;
        this.length = length;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public String getType() {
        return type;
    }

    // toString method so we can directly printout


    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", type='" + type + '\'' +
                '}';
    }
}
