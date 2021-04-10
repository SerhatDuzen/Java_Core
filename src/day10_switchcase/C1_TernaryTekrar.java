package day10_switchcase;

import java.util.Scanner;

public class C1_TernaryTekrar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen bir sayi giriniz = ");

        int s = scan.nextInt();

        System.out.println((s>99&&s<1000)||(s<-99&&s>-1000) ? "Uc basamakli sayi":"Sayi uc basamakli degildir");
        scan.close();
    }
}
