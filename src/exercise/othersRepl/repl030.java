package exercise.othersRepl;

import java.util.Scanner;

public class repl030 {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE:
        Scanner type=new Scanner(System.in);
        System.out.println("Enter Item1, count and its price:");
        String item1=type.next();
        int price1=type.nextInt();
        double count1=type.nextDouble();
        System.out.println("Enter Item2, count and its price:");
        String item2=type.next();
        int price2=type.nextInt();
        double count2=type.nextDouble();
        System.out.println("Enter Item3, count and its price:");
        String item3=type.next();
        int price3=type.nextInt();
        double count3=type.nextDouble();
        double totalPrice = count1*price1 + count2*price2 + count3*price3;
        String report = "";

        if (count1!=0)




        if(count1==0){
            report="Item2: "+item2+" Price: "+(price2*count2)+", Item3: "+item3+" Price: "+(price3*count3) ;
            totalPrice=count2*price2+count3*price3;}
        else if(count1==0 && count2==0){
            report="Item3: "+item3+" Price: "+(price3*count3);
            totalPrice=count3*price3;}
        else if(count1==0 && count3==0){
            report="Item2: "+item2+" Price: "+(price2*count2);
            totalPrice=count2*price2;}
        else if(count1==0 && count2==0 && count3==0){
            report="";
            totalPrice=0;}
        else if(count2==0){
            report="Item1: "+item1+" Price: "+(price1*count1)+", Item3: "+item3+" Price: "+(price3*count3);
            totalPrice=count1*price1+count3*price3;}
        else if(count2==0 && count3==0){
            report="Item1: "+item1+" Price: "+(price1*count1);
            totalPrice=count1*price1;}
        else if(count3==0){
            report="Item1: "+item1+" Price: "+(price1*count1)+", Item2: "+item2+" Price: "+(price2*count2);
            totalPrice=count1*price1+count2*price2;}
        else if( (count1>0) && (count2>0) && (count3>0)){
            report="Item1: "+item1+" Price: "+(price1*count1)+", Item2: "+item2+" Price: "+(price2*count2)+", Item3: "+item3+" Price: "+(price3*count3);
            //totalPrice= totalPrice;
        }
        else{report="none";}




        System.out.println(report);
        System.out.println("Total price: "+totalPrice);
    }

}
