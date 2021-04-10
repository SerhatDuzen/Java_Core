package day30_datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class C4_DateTimeFormatter {
    public static void main(String[] args) {

        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("yyyy/MMM/d");
        DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("yy$MM$dd");
        DateTimeFormatter dtf3= DateTimeFormatter.ofPattern("y*M*d");
        DateTimeFormatter dtf4= DateTimeFormatter.ofPattern("y-MMMM-d");
        DateTimeFormatter dtf5= DateTimeFormatter.ofPattern("d / M / y");
        DateTimeFormatter dtf6= DateTimeFormatter.ofPattern("HH:mm:ss");
        //M: month m : minute
        LocalTime time = LocalTime.now();
        LocalDate tarih = LocalDate.now().plusMonths(8);

        System.out.println(dtf.format(tarih)); //2021/Mar/19
        System.out.println(dtf2.format(tarih)); //21/03/19
        System.out.println(dtf3.format(tarih)); //2021*3*19
        System.out.println(dtf4.format(tarih)); //2021-Mart-19
        System.out.println(dtf5.format(tarih));
        System.out.println(dtf6.format(time));

    }
}
