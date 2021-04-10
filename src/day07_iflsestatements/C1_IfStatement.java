package day07_iflsestatements;

import java.util.Scanner;

public class C1_IfStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir sayi yaziniz : ");
        int i = scan.nextInt();
        if (i>0){
            System.out.println("Girdiginiz sayi pozitif");

        }
        if(i>1000){
            System.out.println("Girdiginiz sayi 1000 den buyuktur");
        }
        if(i<100){
            System.out.println("Girdiginiz sayi 100 den kucuktur");
        }

        scan.close();
    }
}
