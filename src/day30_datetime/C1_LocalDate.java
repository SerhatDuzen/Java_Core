package day30_datetime;

import java.time.LocalDate;

public class C1_LocalDate {
    public static void main(String[] args) {
        //sadece tarih kullanmak istiyorsak localdate classindan bir obje uretiriz
        LocalDate tarih = LocalDate.now();
        System.out.println(tarih);

        System.out.println(tarih.plusWeeks(20));
        System.out.println(tarih.plusDays(500)+" geldi mi");
        System.out.println(tarih.plusYears(3).plusMonths(5).minusMonths(4));

        System.out.println(tarih.minusMonths(15));
        System.out.println(tarih.minusYears(5).minusMonths(1).minusDays(6));

        System.out.println(tarih.getDayOfYear());
        System.out.println(tarih.getMonthValue());
        System.out.println(tarih.getDayOfWeek()+"Haftanin gunu");
        System.out.println(tarih.getMonth());


        System.out.println(tarih.isLeapYear());
//eger suanki tarihi degil de eski bir tarih ile islem yapacaksak localdae.of kullanilir

        LocalDate tarih1 = LocalDate.of(1995,12,15);
        LocalDate tarih2 = LocalDate.of(1995,12,10);
        System.out.println(tarih1.isAfter(tarih2)); // true
        System.out.println(tarih1.isBefore(tarih2)); // false

        LocalDate birth = LocalDate.of(1987,4,6);
        System.out.println(birth.getDayOfWeek());


    }
}
