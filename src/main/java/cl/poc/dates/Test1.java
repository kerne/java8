package cl.poc.dates;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Test1 {
    public static void main(String[] args) {


        LocalDateTime localDateTime = LocalDateTime.of(2019, 1, 1, 10, 10);
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(formatter.format(localDateTime));


    }
}
