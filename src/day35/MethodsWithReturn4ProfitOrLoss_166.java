package day35;

public class MethodsWithReturn4ProfitOrLoss_166 {
    public static String c_profits(int buyPrice, int sellPrice) {
        //your code here
        if (buyPrice < sellPrice)
            return "profit";
        else if (buyPrice > sellPrice)
            return "loss";
        else
            return "no loss";
    }

    public static void main(String[] args) {
        System.out.println(c_profits(25, 35));
    }
}