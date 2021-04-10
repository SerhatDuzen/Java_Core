package day16_forLoop;

import java.util.Scanner;

public class C6_ForLoop6 {
    public static void main(String[] args) {

       //Soru 8 ) Interview Question Kullanicidan bir String isteyin ve
        // Stringi tersine ceviren bir program yazin.
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir kelime giriniz = ");

        String kelime = scan.next();

        String reverse = "";

        for (int i = kelime.length()-1; i >=0 ; i--) {
            reverse += kelime.charAt(i);

        }
        System.out.println(reverse);
        scan.close();
    }
}
