package day33;

public class MethodWithReturnPractice2 {
    public static String getDaysOfTheWeekFromNumber(int dayCode) {
        String dayStr;

        switch (dayCode) {
            case 1:
                dayStr = "MONDAY";
                break;
            case 2:
                dayStr = "TUESDAY";
                break;
            case 3:
                dayStr = "WEDNESDAY";
                break;
            case 4:
                dayStr = "THURSDAY";
                break;
            case 5:
                dayStr = "FRIDAY";
                break;
            case 6:
                dayStr = "SATURDAY";
                break;
            case 7:
                dayStr = "SUNDAY";
                break;
            default:
                dayStr = "FUNDAY";
        }

        return dayStr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(getDaysOfTheWeekFromNumber(30));
        System.out.println(getDaysOfTheWeekFromNumber(arr[4]));
    }
}
