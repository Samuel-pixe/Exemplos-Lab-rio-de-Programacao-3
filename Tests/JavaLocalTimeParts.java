package Tests;

import java.time.LocalTime;

public class JavaLocalTimeParts {

    public static void main(String[] args) {

        LocalTime time = LocalTime.now();

        System.out.printf("Hour: %s%n", time.getHour());
        System.out.printf("Minute: %s%n", time.getMinute());
        System.out.printf("Second: %s%n", time.getSecond());
    }
}