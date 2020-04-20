package mentoring;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimePractices {
    public static void main(String[] args) {
        System.out.println(getTimeDifference("12:05", "1:05", "H:MM"));
    }

    public static int getTimeDifference(String start, String end, String format) {
        LocalTime startTime = LocalTime.parse(start, DateTimeFormatter.ofPattern(format));
        LocalTime endTime = LocalTime.parse(end, DateTimeFormatter.ofPattern(format));

        System.out.println("startTime.getHour() = " + startTime.getHour());
        System.out.println("endTime.getHour() = " + endTime.getHour());

        return endTime.getHour() - startTime.getHour();

    }

}
