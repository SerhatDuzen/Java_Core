package day31_varargsstringbuilder;

import java.util.*;

public class q8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
/*Rastgele kullanici adi olusturan JAVA kodu yaziniz.
 *  1. Kullanicidan ismini isteyelim
 *  2. Kullanici adindaki bosluklari silelim.
 *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
 *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi,
 * kullanicinin girdigi isim olsun.
 *  5. Eger bu kullanici adi zaten varsa,
 * sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
 */
        List< String> list = new ArrayList<>();
        list.add("ali");
        list.add("veli");
        list.add("ayse");
        list.add("hasan");
        list.add("fatma");
        System.out.println("Lutfen kullanici isminizi giriniz : ");
        String userName = scan.nextLine().trim().toLowerCase();

if(list.contains(userName)){
    System.out.println("Bu kullanici ismi kullanilmistir.");
    int rnd = new Random().nextInt(100000);
    userName +=rnd;
    System.out.println("Kullanici adiniz "+userName+" olarak belirlenmisir.");
}else {
    System.out.println("Bu kullanici adini kullanabilirsiniz.");
}

        scan.close();
    }
}
