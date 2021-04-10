package day09_Ternary;

public class C1_ternary1 {
    public static void main(String[] args) {

    int sayi = 10;

    String sonuc= sayi%2==0?"Cift sayi":"Tek sayi";

        System.out.println(sonuc); // ternary islemi bir sonuc dondurmediginden bir variable olusturup assign etmeliyiz

        // assign etmeden yazdirmak istemek
// aciklama yazmak istersek ternary parantez icine alinmali
        System.out.println((sayi%2==0)?"cift sayi":"Tek sayi");

    }
}
