package day07_iflsestatements;

import java.util.Scanner;

public class C5_IfElse4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ucgen durumu belirleme yazilimi\nLutfen 1. kenari giriniz = ");
        double d1 = scan.nextDouble();
        System.out.println("Lutfen 2. kenari giriniz = ");
        double d2 = scan.nextDouble();
        System.out.println("Lutfen 3. kenari giriniz = ");
        double d3 = scan.nextDouble();
        if (d1==d2&&d2==d3){
            System.out.println("Eskenar ucgen");
        }
        else{
            System.out.println("Eskenar ucgen degildir..");
        }
scan.close();
    }
}
