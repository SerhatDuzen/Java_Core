package day31_varargsstringbuilder;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ManavProjesi {
    /*
     * Basit bir manav alisveris programi yaziniz.
     *
     * 1. Adim : Ürün listesinden ürün seçtir ve kaç kilo oldugunu sor.
     * 2. Adim : Baska bir ürün almak isteyip istemedigini sor.
     *           Istemiyorsa toplam miktari göster, istiyorsa tekrar ürün seçtir.
     *           Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
     * 3. Adim : Muster her ürün seçtiginde, aldýðý ürünün fiyatini toplam fiyata ekle.
     * 4. Adim : Alisveris bitince toplam ödemesi gereken tutari göster.
     *
     * */







    /* bir multidimensional array'i parametre olarak kabul
    eden bir method yazin
     * bu method array'deki elemanlari arraylist'e aktarsin
     * ve arraylist'i natural order'a gore yazdirin
     *
     * Eg : Input : {{John,Brad,Fox},{Lee,Ali},{Suzan}}
     * 		Output:[Ali, Brad, Fox, John, Lee, Suzan]
     */

    static List<String> urunIsimleri = new ArrayList<>();
    static List<Double> urunFiyatlari = new ArrayList<>();
    static double toplamOdenecekFiyat = 0;
    public static void main(String[] args) {

        urunIsimleri.add("Domates - Urun Kodu : 0");
        urunIsimleri.add("Patlican - Urun Kodu : 1");
        urunIsimleri.add("Karpuz - Urun Kodu : 2");
        urunIsimleri.add("Biber - Urun Kodu : 3");
        urunIsimleri.add("Erik - Urun Kodu : 4");
        urunIsimleri.add("Armut - Urun Kodu : 5");

        urunFiyatlari.add(4.5);
        urunFiyatlari.add(5.40);
        urunFiyatlari.add(1.25);
        urunFiyatlari.add(1.75);
        urunFiyatlari.add(6.56);
        urunFiyatlari.add(3.78);

        urunSec();


    }

    //1. Adim : Ürün listesinden ürün seçtir ve kaç kilo oldugunu sor.
    public static void urunSec() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Asagidaki listeden sectiginiz urunun \n "
                + "Urun kodunu ve kac kilo almak istediginizi giriniz \n" + urunIsimleri);

        int urunKodu = scan.nextInt();
        double kilo = scan.nextDouble();


        double toplamUrunFiyati = urunFiyatlari.get(urunKodu) * kilo;
        toplamOdenecekFiyat += toplamUrunFiyati;

        System.out.println("Aldiginiz " + urunIsimleri.get(urunKodu) + "\n" + toplamUrunFiyati + " TL");
        System.out.println("Alisverise devam etmek ister misiniz? E/H");
        char karar = scan.next().toUpperCase().charAt(0);

        if(karar == 'H') {
            System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz.\n" +
                    "Odemeniz gereken tutar :" + toplamOdenecekFiyat);
        }else if(karar == 'E'){
            urunSec();
        }else {
            System.out.println("Yanlis tusa bastiniz");
        }

    }
}
