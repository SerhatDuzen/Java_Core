package day07_iflsestatements;

import java.util.Scanner;

public class C2_IfElse1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Dortgenin enini giriniz = ");
        int e = scan.nextInt();
        System.out.print("Dortgenizi boyunu giriniz = ");
        int b= scan.nextInt();
        if (b == e) {
            System.out.println("Geometrik sekliniz bir karedir");
        }
        else{
            System.out.println("Geometrik sekil kare deildir");
        }

        scan.close();

    }
}
