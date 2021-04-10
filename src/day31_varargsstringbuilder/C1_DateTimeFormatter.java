package day31_varargsstringbuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C1_DateTimeFormatter {
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMMM/yy\nhh:mm");
        System.out.println(dtf.format(ldt));

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("***** yy/MMM/dd *****");
        System.out.println(dtf2.format(ldt));

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("HH:mm");
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("hh:mm");
        System.out.println(dtf3.format(ldt)); // 24 saatli sistemine gore 17 22

        System.out.println(dtf4.format((ldt))); // pm/am sistemine gore 05 22

        /*
        yy: yilin son iki rakami
        yyyy : yilin tamami
        M: ay sirasini verir 3
        MM: ay sirasini verir. 03
        MMM: ay isminin ilk 3 harfi
        MMMM: AY ISIMININ TAMAINI VERR

         */

        LocalDate birthDate = LocalDate.of(1987,4,6);
        LocalDate today = LocalDate.now();
        Period yas = Period.between(birthDate,today);
        System.out.println(yas);
        int age = yas.getYears();
        System.out.println(age);



    }
}
