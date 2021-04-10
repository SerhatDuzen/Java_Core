package day10_switchcase;

import java.util.Locale;
import java.util.Scanner;

public class C6_SwitchCase4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("VIP kisaltmasinda hangi harfin aciklamasini istiyorsunuz? = ");
        char a = scan.next().toLowerCase().charAt(0);
//String a = scan.next();
//if(a.length()!=1){
    //char a = a;

        switch (a){
            case 'v':
                System.out.println("Very");
                break;
            case 'i':
                System.out.println("Important");
                break;
            case 'p':
                System.out.println("Person");
                break;
            default:
                System.out.println("Gecersiz karakter girisi!!!");
                scan.close();
        }
    }
}
