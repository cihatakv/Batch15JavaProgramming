package repl.repl51_75;

import java.util.Scanner;

class Check{
    String split, quality;
    int peopleAmount;
    double checkAmount;

    Check(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Split:");
        this.split=scan.next();
        System.out.println("Number of people:");
        this.peopleAmount=scan.nextInt();
        System.out.println("Check amount:");
        this.checkAmount=scan.nextDouble();
        System.out.println("Service Quality:");
        this.quality=scan.next();
    }
    public void total(){
        String numberofpeople="";
        double total=checkAmount, totalTip=0, totalPerPerson=0, tipPerPerson=0;
        for(int i=0; i<peopleAmount; i++){
            numberofpeople+="&";
        }
        System.out.println("Number of people entered: "+numberofpeople);
        if(quality.equalsIgnoreCase("Poor")){
            totalTip=checkAmount*0.05;
            total+=totalTip;
        }else if(quality.equalsIgnoreCase("Fair")){
            totalTip=checkAmount*0.1;
            total+=totalTip;
        }else if(quality.equalsIgnoreCase("Good")){
            totalTip=checkAmount*0.15;
            total+=totalTip;
        }else if(quality.equalsIgnoreCase("Great")){
            totalTip=checkAmount*0.2;
            total+=totalTip;
        }else if(quality.equalsIgnoreCase("Excellent")){
            totalTip=checkAmount*0.25;
            total+=totalTip;
        }
        System.out.println("Total to pay: "+total);
        System.out.println("Total tip: "+totalTip);
        if(split.equalsIgnoreCase("Yes")){
            totalPerPerson=total/peopleAmount;
            tipPerPerson=totalTip/peopleAmount;
            System.out.println("Total per person: "+totalPerPerson);
            System.out.println("Tip per person: "+tipPerPerson);
        }
    }


}
public class MykytasRepl_051 {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        Check rec =new Check();
        rec.total();
    }

}


