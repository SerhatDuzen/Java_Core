package day09_Ternary;

import java.util.Scanner;

public class C3_ternary3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki adet sayi giriniz = ");
        int s1 = scan.nextInt();
        int s2 = scan.nextInt();
        System.out.println(s1>s2?s1:s2);
        scan.close();
    }
}
