package day30_datetime;

import java.time.LocalDate;

public class Period {
    public static void main(String[] args) {

        LocalDate h1= LocalDate.now();
        LocalDate myBirth = LocalDate.of(1987,4,6);
        java.time.Period age = java.time.Period.between(myBirth,h1);
        System.out.println(age);
        int gun = age.getMonths();
        System.out.println(gun);


    }
}
