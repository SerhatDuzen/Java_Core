package day38_exceptions;

import java.util.Scanner;

public class Exceptions01 {
    public static void main(String[] args) {
        //Kullanicidan 2 tamsayi alin ve bolumlerini yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bolunecek tam sayiyi yazin ;");
        int s1= scan.nextInt();
        System.out.println("Lutfen bolecek tam sayiyi girin ; ");
        int s2= scan.nextInt();

//java exceptionsu handle etmek icin try-catch blogu olusturmus

        try {
            System.out.println("Bolme isleminin sonucu : " + s1 / s2);
        } catch (ArithmeticException e){
            System.out.println("Sayiyi 0 a bolemezsin!!");
        }
    }
}
