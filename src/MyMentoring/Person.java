package MyMentoring;

public class Person {

    String name;
    int age;
    boolean on;
    int volumeLevel;

    public Person() {
        System.out.println("No Arg Const");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //    public void setVolumeLevel(int volumeLevel) {
//        if (on == false)
//            System.out.println("ERROR: TV is either OFF or invalid Volume level");
//        else {
//            if (volumeLevel > 0 && volumeLevel <= 7)
//                this.volumeLevel = volumeLevel;
//            else
//                System.out.println("ERROR: TV is either OFF or invalid Volume level");
//        }
//    }
    public void setVolumeLevel(int volumeLevel) {
        if (on == true) {
            if (volumeLevel > 0 && volumeLevel < 8)
                this.volumeLevel = volumeLevel;
            else
                System.out.println("ERROR: TV is either OFF or invalid Volume level");
        } else {
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }

    }


    public void goForward() {
        System.out.println("Going forward");
    }

}
