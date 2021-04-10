package day37_overriding;

public class Formen extends Isci {
    public String sorumluOlduguBolum="Bakim";
    public String isim="Emrullah";

    public static void main(String[] args) {
        //inheritancede data turu olarak class ismi kullanimi
        Formen fr1 = new Formen();
        //fr1 objesini kullanarak hangi classlarin variablelarini gorebilirim?

        fr1.sorumluOlduguBolum="Marangozhane";
        fr1.maas=10000;
        System.out.println(fr1.isim+" "+fr1.sorumluOlduguBolum+" "+fr1.maas);
        //variableye deger atama override DEGILDIR
        Isci fr2 = new Formen();
        //data turu isci secildigi icin isci ve pers classlari gozukur
        fr2.bolum="Kaynak Atolyesi";
        //fr2.isim="Yakup";
        System.out.println(fr2.isim+" "+fr2.bolum+" "+fr2.maas);

        // Inheritance'da data turu olarak class ismi kullanimi

        // Bir class'da obje uretirken data turu olarak class'in kendisini
        // veya parent(lar)ini kullanabiliriz.
        // Olusturdugumuz obje ile variable kullanmamiz gerekirse, hangi degeri
        // alacagini anlamak icin once Data turu olan class'a gideriz
        // orada aradigimiz variable varsa kullaniriz, yoksa
        // parent(lar)ina bakariz, yukari dogru giderken ilk buldugumuz degeri kullaniriz

        //CHILD parent i sinrlandiramaz. yani overriding methodu access modifier i
        //overriden method un access modifier indan daha dar olamaz. child esit ya da
        //daha genis

        //overridden methodun return type i primitive veya void ise
        //overriding methodun da return type i ayni olmali

        /*
        eger return type primitive degilse o zaman oveeridingdeki tip is a
        overridden daki tip dir/ string >- obje

         */

        // variable a ulamak icin parent class a method icin constructor a bakariz!!

        //  Derived obj = new Test();

        //variable parenta metodda const a

        // Eger variable'a ulasmak istersek Data Type'a bakiyoruz fakat method'a gidiyorsak constructor'a bakariz.
        // (Override durumlari icin hatirlatma)

    }
}
