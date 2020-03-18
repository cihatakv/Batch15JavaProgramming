package day11;

public class WarmUp1_LightOnOff {
    public static void main(String[] args) {
        String targetOption = "bd";

        switch (targetOption){
            case "bd":
                System.out.println("You have turned on bedroom light");
                break;
            case "lr":
                System.out.println("You have turned on living room light");
                break;
            case "ki":
                System.out.println("You have turned on kitchen light");
                break;
            case "ha":
                System.out.println("You have turned on Hallway light");
                break;
            default:
                System.out.println("No such room");
        }



        /*
        DAY 11
Create class called WarmUp1_LightOnOff
Create a variable  targetOption as String and assign one of below options  for example bd
You have 4 switches in your home to turn on
	  Bd — bedroom
      Lr  — living room
	  ki  — kitchen
      Ha— Hallway
Use switch statement to write a program to print which room light is turned on
For example if Bd was targetOption
	then print  you have turned on bedroom light
         */
    }
}
