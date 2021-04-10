package day02_scanner;

import java.util.Scanner;

public class C3_Scanner3 {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen isminizi yaziniz = ");
        String isim = scan.next();
        System.out.print("Lutfen soyisminizi yaziniz = ");
        String soyisim = scan.next();
        System.out.println("Isminiz = "+isim+"\nSoyisminiz = "+soyisim);
        scan.close();
    }
}
