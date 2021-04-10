package day09_Ternary;

import java.util.Scanner;

public class C5_nestedternary {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Uzun kenari giriniz = ");
        int k1 = scan.nextInt();
        System.out.println("Kisa kenari giriniz = ");
        int k2 = scan.nextInt();
        System.out.println(k1>0&&k2>0?(k1==k2?"Kare":"Kare degildir.."):("Gecersiz kenar uzunlugu"));
        scan.close();




    }
}
