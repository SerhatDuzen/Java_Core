package day12_stringmanupalation;

import java.util.Scanner;

public class C4_IndexOf {
    public static void main(String[] args) {

        String str = ("Java ogren, is sahibi ol");

        System.out.println(str.charAt(6));

        System.out.println("char arama = "+str.indexOf('g')); //6 - char arama

        System.out.println("String arama = "+str.indexOf("g")); //6 - string arama

        System.out.println("String kelime arama = "+str.indexOf("is")); //12// ilk buldugu karakterin indexi

        System.out.println("birden fazla varsa = "+str.indexOf('i')); // ilk buldugu indexini getirir

        System.out.println("Javadan sonraki a yi bulmak = "+str.indexOf('a',4));
        // baslangic indexi inclusive oldugu icin 3 verilirse 2. a yi bulur

        System.out.println("Olmayan kelime = "+str.indexOf("dert")); //olmayan harfte -1 verir

        Scanner scan =  new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String b = scan.nextLine().toLowerCase();
        int sonuc = b.indexOf("java");
        System.out.println(sonuc==-1 ? "Java icermiyor" : "Java var cumlende");
        scan.close();


    }
}
