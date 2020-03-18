package day31;

public class DailyRoutine {
    public static void wakeUp() {
        System.out.println("Open Your Eyes");
        System.out.println("Close Your Eyes");
        System.out.println("Hear your alarm? open it again!");
        System.out.println("----------------");
    }

    public static void drinkCoffee() {
        System.out.println("Put coffee in your coffee machine");
        System.out.println("Press the button Make your coffee");
        System.out.println("----------------");
    }

    public static void prepareKidsForSchool() {
        System.out.println("Kids your kids to wake them up");
        System.out.println("Wake them up for 10 times");
        System.out.println("Prepare their breakfast and lunch");
        System.out.println("Eat with them");
        System.out.println("----------------");
    }

    public static void takeThemToSchool() {
        System.out.println("Take them to school bus");
        System.out.println("Say good bye !!!");
        System.out.println("----------------");
    }

    public static void studyJava() {
        System.out.println("Think about Java waking up");
        System.out.println("Think about Java drinking coffee");
        System.out.println("Think about Java preparing Kids For School");
        System.out.println("Think about Java taking Them to school");
        System.out.println("Essentially sit down and study java, practice practice!!!");
        System.out.println("Review Last Classses");
        System.out.println("----------------");
    }

    public static void sayILoveJava10Times() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("I Love Java");
        }
    }
    public static void goToSleep(){

    }

    public static void main(String[] args) {
        wakeUp();
        drinkCoffee();
        prepareKidsForSchool();
        takeThemToSchool();
        studyJava();
        sayILoveJava10Times();
    }
}
