package day10_switchcase;

import java.util.Locale;
import java.util.Scanner;

public class C5_SwitchCase3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Bugun gunlerden hangi gun oldugunu yaziniz = ");

        String a = scan.next().toLowerCase();
        switch (a){
            case "pazartesi":

            case "sali":

            case "carsamba":

            case "persembe":

            case "cuma":
                System.out.println("Hafta ici gunu..");
                break;
            case "cumartesi":

            case "pazar":
                System.out.println("Hafta sonu gunu..");
                break;
            default:
                System.out.println("Gecersiz giris...");

                scan.close();

        }
    }
}
