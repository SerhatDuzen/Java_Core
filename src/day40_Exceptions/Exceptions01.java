package day40_Exceptions;

import java.util.Scanner;

public class Exceptions01 {
    public static void main(String[] args) {
/*
Kullanicidan yasini girmesini isteyin.
Kodunuzu kullanici sifirdan kucuk bir sayi girerse Exception verecek sekilde yazin.
 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz : ");
        int yas = scan.nextInt();
        try {
            if (yas >= 0) {
                System.out.println("Girdiginiz yas : " + yas);
            } else {
                throw new IllegalArgumentException();
            }
            //bu sekilde yazdigimizda Java exc throw eder
            //ama kodumuz da bloke olmus olur
            //bloke olmasini engellemek isterseniz kodu try try catch ile surround yapmaliyiz
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        System.out.println("Kod bloke olmamis!");

    }
}
