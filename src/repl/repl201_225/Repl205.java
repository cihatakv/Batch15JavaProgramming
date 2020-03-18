package repl.repl201_225;

public class Repl205 {
    public static double convertC(String[][] money, String[][] convertionRate) {

        double total = 0;
        for (int i = 0; i < money.length; i++) {
            total += Double.parseDouble(money[i][1]) * Double.parseDouble(convertionRate[i][1]);
        }
        return total;

    }

    public static void main(String[] args) {


        String[][] test_money =
                {
                        {"mark", "5"},                      // "Euro" , "5"
                        {"shekel", "30.5"},                 // "M Peso", "1000"
                };

        String[][] test_convert =
                {
                        {"mark", "1"},                      // "Euro", "1.5"
                        {"shekel", "0.5"},                  // "M Peso", "0.01"
                };

//        double res = Main.convertC(test_money, test_convert);
//        System.out.print(res);

    }

}
