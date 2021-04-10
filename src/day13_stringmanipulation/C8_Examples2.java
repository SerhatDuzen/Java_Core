package day13_stringmanipulation;

import java.util.Scanner;

public class C8_Examples2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz = ");
        String isim = scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz = ");
        String soyisim = scan.next();
        System.out.println("Lutfen 16 hanelik kredi karti numaranizi giriniz = ");
        String kartNo = scan.next();

        //System.out.println(isim.toUpperCase().charAt(0));
        char isimIlkHarf = isim.toUpperCase().charAt(0);
        String isimGeriKalan = isim.substring(1).replaceAll("\\w","*");
        String soyisimIlkHarf = soyisim.toUpperCase().substring(0,1);
        String soyisimGeriKalan = soyisim.substring(1).replaceAll("\\w","*");
String kartNoBasi = "**** **** **** ";
String kartNoSonu = kartNo.substring(kartNo.length()-4);

        System.out.println("Isminiz ve Soyisminiz : "+ isimIlkHarf + isimGeriKalan+" "+soyisimIlkHarf+soyisimGeriKalan+
        "\n"+kartNoBasi+kartNoSonu);

    }
}
