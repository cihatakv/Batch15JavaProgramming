package day50;

public class Addition extends Question {


    public Addition(int num1, int num2) {
        super("Addition question", "+");
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void calculate() {
        answer = num1 + num2;
        calculated = true;
    }

    @Override
    public String toString() {
        if (calculated == true)
            return super.toString() + num1 + " " + operator + " " + num2 + " = " + answer;
        else
            return super.toString() + num1 + " " + operator + " " + num2 + " = ";
    }
}
/*
it has one constructor to set
			num1 and num2
			it should also set questionType to "addition"
								operator to  "+"
		it should implement calculate method
		toString method in below format
			return num1 + operator +  num2  =  "" if not calculated yet
			return num1 + operator +  num2  =  answer if already calculated
 */