package day43;

public class Pet {
    private String name;
    private String type;

    public Pet() {
        this.name = "no-name";
        this.type = "unknown";
    }

    public Pet(String name, String type) {
        this.type = type;
        this.name = name;
    }

    public static void showGeneralPetInfo() {
        System.out.println("PETS ARE FRIEND AND HUMANS");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", bread='" + type + '\'' +
                '}';
    }

    public void speak() {
        switch (this.type) {
            case "cat":
                System.out.println("meow");
                break;
            case "dog":
                System.out.println("woof");
                break;
            case "cow":
                System.out.println("mooo");
                break;
            case "horse":
                System.out.println("neinei");
                break;
            default:
                System.out.println("UNKNOWN PET");
        }
    }
}
