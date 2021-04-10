package day29_passbyvalueimmutable;

public class C1_PassByValue01 {

    public static void main(String[] args) {
        //pass By Value ve passByReferance
        /*Soru : Verilen bir fiyat icin %10 indirim yapan bir method olusturun.
  - Method’da indirim uygulanan fiyati yazdirin
  - Method Call sonrasi original fiyati yazdirin ve
  method’da yapilan degisikligin  orginal degeri degistirip degistirmedigini kontrol edin.
         */
        double fiyat = 100;
       indirimUygula(fiyat);
        System.out.println("Metod call sonrasi fiyat : "+fiyat);
    }

    private static void indirimUygula(double fiyat) {
fiyat *=0.9;
        System.out.println("%10 indirimli fiyat : "+ fiyat);
        //method icinde olan method icinde kalir

    }


}
