package day35;

public class StringToIntegerParsing {
    public static void main(String[] args) {
        // I have an employee Id: "FB-457"
        // give me the employee number and store it into a number

        String strNum = "100";
        int num = Integer.parseInt(strNum);
        System.out.println("num = " + num);

        String empID = "FB-457";
        String[] empIDsplit = empID.split("-");
        String idStr = empIDsplit[1];
        int id = Integer.parseInt(idStr);
        System.out.println("id = " + id);

        String twoNumber = "100,600";
        String[] twoNumberArr = twoNumber.split(",");
        int sum = Integer.parseInt(twoNumberArr[0]) + Integer.parseInt(twoNumberArr[1]);
        System.out.println("sum = " + sum);


    }
}
