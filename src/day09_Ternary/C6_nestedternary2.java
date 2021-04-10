package day09_Ternary;

import java.util.Scanner;

public class C6_nestedternary2 {
    public static void main(String[] args) {

        //Soru2 : Kullanicidan bir harf isteyin kucuk harf ise consola “Kucuk Harf”
        // , buyuk harfse consola “Buyuk Harf” yoksa “girdiginiz karakter harf degil”
        // yazdirin.
        Scanner scan =  new Scanner(System.in);

        System.out.println("Lutfen bir harf giriniz : ");
        char c = scan.next().charAt(0);

        System.out.println(c>='a'&&c<='z'?"Kucuk harf":c>='A'&&c<='Z'?"Buyuk harf":"Lutfen harf giriniz!!!");
        scan.close();

    }
}
