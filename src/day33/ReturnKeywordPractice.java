package day33;

public class ReturnKeywordPractice {
    public static int calculateAndReturnAge(int year) {
        int age;

        if (year < 1900 || year > 2020)
            age = 0;
        else
            age = 2019 - year;

        return age;
    }

    public static void main(String[] args) {

        int[] years = {1999, 122, 2019, 1987, 1978, 1964, 3999, 2004};

        for (int eachYear : years) {
            if (eachYear % 1000 != eachYear)
                System.out.println(eachYear + " --> " + calculateAndReturnAge(eachYear));
            else
                System.out.println(eachYear + "  --> " + calculateAndReturnAge(eachYear));
        }


    }
}
