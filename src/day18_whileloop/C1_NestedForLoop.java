package day18_whileloop;

import java.util.Scanner;

public class C1_NestedForLoop {

    public static void main(String[] args) {

        //carpim tablosu

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz = ");

        int a = scan.nextInt();

        for (int i = 1; i <= a; i++) {
            System.out.println("");
            for (int j = 1; j <= a; j++) {
                System.out.printf((i*j)+ " ");
            }
        }
        scan.close();


    }
}
