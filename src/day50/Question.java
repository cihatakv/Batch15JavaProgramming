package day50;

public abstract class Question {

    int num1;
    int num2;
    String operator;
    int answer;
    boolean calculated;
    String questionType = "Unknown";

    public Question(String questionType, String operator) {
        this.questionType = questionType;
        this.operator = operator;
    }

    public abstract void calculate();

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    @Override
    public String toString() {
        if (calculated == true)
            return "The question type is " + questionType + " " + num1 + " " + operator + " " + num2 + " = " + answer;
        else
            return "The question type is " + questionType + " " + num1 + " " + operator + " " + num2 + " = ";
    }
}
