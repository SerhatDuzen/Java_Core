package day16_forLoop;

import java.util.Scanner;

public class C3_ForLoop3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz");
int sayi = scan.nextInt();
int sayac = 0;


for (int i = 1; i <sayi  ; i++) {
            sayac+=i;
        }
        System.out.println(sayi+ " 'ya kadar olan sayilarin toplami = "+sayac);
        scan.close();
    }
}
