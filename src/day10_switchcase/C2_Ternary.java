package day10_switchcase;

import java.util.Scanner;

public class C2_Ternary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz = ");
        double d = scan.nextDouble();
        System.out.println(d%2==0 ? "Cift sayi": d*d);
        scan.close();
    }
}
