package day29_passbyvalueimmutable;

public class C2_PassByValue02 {

    public static void main(String[] args) {
/*Soru2 : Verilen bir fiyat icin %10 , %20, %25 indirim yapan uc method olusturun.
  - Method’da indirim uygulayip fiyati main method’da yazdirin
  - Method’lari arka arkaya cagirip dogru calistiklarini kontrol edin
        */
        double sayi = 100;

        System.out.println(yuzdeOnIndirim(sayi));
        System.out.println(yuzdeYirmiIndirim(sayi));;
        System.out.println(yuzdeYirmiBesIndirim(sayi));

    }

    private static double yuzdeYirmiBesIndirim(double sayi)  {
        sayi*=0.75;
        return sayi;
    }



    private static double yuzdeYirmiIndirim(double sayi) {
        sayi*=0.8;
        return sayi;
    }

    private static double yuzdeOnIndirim(double sayi) {
        sayi*=0.9;
        return sayi;
    }
}
