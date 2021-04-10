package day12_stringmanupalation;

import java.util.Scanner;

public class C3_Lenght {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz = ");
        String str1 = scan.next().toUpperCase();
        System.out.println("Girdiginiz kelimenin son harfi : "+str1.charAt(str1.length()-1));

        String str2 = "";
        System.out.println(str2.length()); //0

        String str3 = null;
        System.out.println(str3.length()); //hata RTE verir
        /*
        null hic demek
        normalde stringler "" icine yazilir ama null icin buna gerek yoktur
        null case sensitive dir. dolayisiyla NULL veya Null yazilmaz
        null bir deger degildir, sadece hicligi gosteren bir pointerdir
         */

        String str4;
        System.out.println(str3.equals(str2)); //RTE
//null deger atanan String ile String manipulation methodlari kullanilamaz

        scan.close();





    }
}
