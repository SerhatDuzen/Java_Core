package day40_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {
    public static void main(String[] args) throws FileNotFoundException,IOException {

        FileInputStream fis = new FileInputStream("/Users/serhatduzen/IdeaProjects/winter2021turkish/src/day39_exceptions/File");
        int k = 0;
        //try catch blogu excp ile hadle etmekte kullanilir
        //throws kw ise declaration dir. dolayisiyla twhrow kullanilan bir methodda
        //exception olusursa KOD bloke olur
        while((k=fis.read())!=-1) {
            System.out.print((char)k);
        }
        /*
         * THROWS
         * - Throws keyword “checked exceptions” icin kullanilir.
         * - Throws keyword, exception handle yapilmak istenmiyorsa kullanilir. (Exception olusunca program calismasi durur)
         * - Throws keyword’den sonra, aralarina virgule konularak, birden fazla exception yazilabilir
         * - Throws keyword method body icinde kullanilamaz, kullanilacaksa method isminin oldugu satirda yazilmalidir.
         * - Throws keyword’den sonra birden fazla exception kullanilacaksa ve yazilan
         *  exception’lar arasinda parent child iliskisi varsa , child exception yazilabilir ama tavsiye edilmez.
         *  Cunku parent exception tum durumlari kapsayacaktir. (Hedef farkli durumlar icin aciklama yazip
         *  handle etmek olmadigindan, bir exception’in calismasi yeterlidir)
         */
        //eger birden fazla exc icin throws kw kullanilacaksa kullanacaimiz exlarin
        //arasindaki iliski ve siralama onemli olur
        //eger yazdigimiz exc arasinda parent child ilskisi varsa once child exc
        //yazilmalidir. aksi taktirde child exc erisilemez olur

        //eger yazacklarimiz arasinda parent child iliskisi varsa istersek sadece
        //parent i yazmamiz da yeterli olur.
    }
}
/*
    Throws Throw
    Throw keyword'u 1 exc. firlatmak icin. Throw declare etmiyor
    Throws ise bir veya daha fazla exc.'i declera etmek icindir. "," ile ayrilarak yazilabilir.

    Throw method'un icinde kullanilir.
    Throws keyword ise method signature'inda kullanilir.

     Throw'dan sonra new diyip exc. turunu yazmamis lazim.
     Throws'dan sonra sadece exc. turu yazilmasi yeterlidir.

    */