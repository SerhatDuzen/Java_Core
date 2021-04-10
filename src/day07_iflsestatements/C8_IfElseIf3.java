package day07_iflsestatements;

import java.util.Scanner;

public class C8_IfElseIf3 {
    public static void main(String[] args) {

        //Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap azdirin.
        // Teklif 80.000’in uzerinde ise “Kabul ediyorum” , 60 – 80.000 arasinda ise  “Konusabiliriz”,
        // 60.000’nin altinda ise “Maalesef Kabul edemem” yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Maas teklifiniz nedir?");
        int a = scan.nextInt();
        if (a > 80000) {
            System.out.println("I accept");
        } else if (a>=60000){
            System.out.println("We can talk");
        } else {
            System.out.println("Unfortunately. I refuse it.");
        }
    }
}
