package day06_ifstatements;

import java.util.Locale;
import java.util.Scanner;

public class C4_IfStatement4 {
    public static void main(String[] args) {
        System.out.println("Gun ismini yaziniz..");

        Scanner scan = new Scanner(System.in);

        String s= scan.nextLine().toLowerCase();// eger stringlerde esitlik soruyorsak == kullanmamaliyiz. equal metodu kullanilir
        if (s.equals("cumartesi") || s.equals("pazar")){
            System.out.println("Haftasonu gunu girdiniz!!!");
        } else if(s.equals("pazartesi")||s.equals("sali")||s.equals("carsamba")||s.equals("persembe")||s.equals("cuma")){
            System.out.println("Haftaici girdiniz!!!");
        } else{
            System.out.println("Hafta gunlerinden birini giriniz!!!");
        }
scan.close();




    }
}
