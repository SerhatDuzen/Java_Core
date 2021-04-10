package day35_Inheritance;

public class Personel {
    public String isim;
    public int sayi;

    public Personel() {
        //super();
        //eclipse de java const un ilk satirina super keywordunu ekler
        //eger icinde oldugumuz class bir chi;d class degilse super
        //keywordu silinebilir. bugune kadar olusturdugumuz const larda
        //hic super kw kullanmadik. ancak bizim classlarimiz cild cl
        //olmadigindan sorun olmadi.

        System.out.println("Personle parametresiz const calisti");
    }

    public Personel(String isim, int sayi) { //parametreli bir const
        //super();
        System.out.println("Personle parametreli const calisti");
    }


    /*Eski derslerden
    her class dafault constructora sahiptir
    Default constructoru n paremetresi yokltur
    Biz parametreli veya parametresiz bir const olustirdogumuzda default
    const silinir. Eger biz sadece bir tane parametreli const olustrursak
    java default olani sildigi icin parametresiz const kalmaz.
    Dolayisiula parametreli bir cons olsuturdugumuzda mulaka default const
    yerine de parametresiz bir const olusturmamiz gerekir
     */


}
