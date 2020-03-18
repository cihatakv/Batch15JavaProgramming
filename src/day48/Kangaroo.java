package day48;

public class Kangaroo implements Bouncible, BoxerWithBellyPouch {

    String name;
    int jumpDistance;

    public Kangaroo(String name, int jumpDistance) {
        this.name = name;
        this.jumpDistance = jumpDistance;
    }


    @Override
    public void bounce() {
        System.out.println("Kangaroo bounces");
    }

    @Override
    public void kickBox() {
        System.out.println("Kangaroo with name " + name + " is kickboxing");
    }

    @Override
    public void carryChildInThePocket() {
        System.out.println("Kangaroo with name " + name + " carryChildInThePocket");
    }


    @Override
    public String toString() {
        return "Kangaroo{" +
                "name='" + name + '\'' +
                ", jumpDistance=" + jumpDistance +
                '}';
    }

    public void eat() {
        System.out.println("Kangaroo eats");
    }
}
/*
Kangaroo
	instance fields :
		 name as String
		 int jumpDistance
	add constructor to set above two fields
	instance methods :
		implements abstract method from interface
		toString
		eat()
 */