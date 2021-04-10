package day09_Ternary;

import java.util.Scanner;

public class C4_ternary4 {
    public static void main(String[] args) {
       // Soru2 ) Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz : ");
        int i = scan.nextInt();
        System.out.println(i%2==0?"Cift sayi":"Tek sayi");

        System.out.println("Mutlak degeri = "+(i>=0?i:-i));
        scan.close();

    }
}
