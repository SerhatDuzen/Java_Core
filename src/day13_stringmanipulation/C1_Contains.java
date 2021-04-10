package day13_stringmanipulation;

import java.util.Scanner;

public class C1_Contains {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        System.out.println("Lutfen bir cumle yaziniz = ");
        String s1 = scan.nextLine().toLowerCase();
        System.out.println("Aramak istediginiz kelimeyi giriniz = ");
        String s2 = scan.nextLine().toLowerCase();
        System.out.println(s1.contains(s2)?"Basarili":"basarisiz");
        */

        System.out.println("Lutfen mail adresinizi yaziniz = ");
        String s3 = scan.next().toLowerCase();
        //System.out.println(s3.contains("@gmail.com")?"Mailiniz kaydedildi":"Lutfen gmail adresinizi giriniz!");

//eger gmail.com en sonda oldugunu kontrol etmek istersek
        int sondami = s3.indexOf("@gmail.com",s3.length()-10);
// eger bunun ile bitiyorsa int sonuc verir
        // bunun ile bitmiyorsa  -1
        if (s3.contains("@gmail.com")&&sondami!=-1){
            System.out.println("Mailiniz kaydedildi");
        }else {
            System.out.println("Lutfen gecerli bir e mail adresi giriniz");
        }

    }
}
