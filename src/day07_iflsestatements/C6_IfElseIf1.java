package day07_iflsestatements;

import java.util.Scanner;

public class C6_IfElseIf1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("HARF NOTU BULMA PROGRAMI\nLUTFEN NOTUNUZU 100 PUAN UZERINDEN GIRINIZ = ");
        int i = scan.nextInt();

        if (i<0 || i>100) {
            System.out.println("Gecersiz not girisi!!");

        }
        else if (i<50) {
            System.out.println("Kaldiniz\nHarf notunuz => FF");

        } else if (i<60) {
            System.out.println("Gectiniz\nHarf notunuz => C");

        }else if (80>i) {
            System.out.println("Gectiniz\nHarf notunuz => B");

        }else{
            System.out.println("Tebrikler\nHarf notunuz => AA");
        }

scan.close();


    }
}
