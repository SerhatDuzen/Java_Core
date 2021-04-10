package day15_methodcreation;

import java.util.Scanner;

public class C2_MethodCreation2 {
    public static void main(String[] args) {
        /*Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun.
        Kullanici 2,3 veya 4 degerini girerse,
        kullanicidan bu sayilari girmesini isteyin ve
        sayilarin toplamini yazdirin. Kullanici toplamak
        istedigi sayi adedini 4’den buyuk girerse
    n.“Cok sayi girdiniz, ben toplayamam” yazdiri
*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kac sayi toplamak istediginizi sayi olarak yaziniz = ");
        int islemSayi = scan.nextInt();
        if( islemSayi<2){
            System.out.println("En az iki adet sayi giriniz!!");
        }else if(islemSayi==2){
            ikiSayiTopla();
        }else if(islemSayi==3){
            ucSayiTopla();
        }else if(islemSayi==4){
            dortSayiTopla();
        }else {
            System.out.println("Cok sayi girdiniz, ben toplayamam");
        }
        scan.close();

    }

    private static void dortSayiTopla() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz: ");
        int s1= scan.nextInt();
        System.out.println("Ikinci sayiyi giriniz: ");
        int s2= scan.nextInt();
        System.out.println("Ucuncu sayiyi giriniz: ");
        int s3= scan.nextInt();
        System.out.println("Dorduncu sayiyi giriniz: ");
        int s4= scan.nextInt();
        System.out.println("Islem sonucu = "+(s1+s2+s3+s4));
    }

    private static void ucSayiTopla() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz: ");
        int s1= scan.nextInt();
        System.out.println("Ikinci sayiyi giriniz: ");
        int s2= scan.nextInt();
        System.out.println("Ucuncu sayiyi giriniz: ");
        int s3= scan.nextInt();
        System.out.println("Islem sonucu = "+(s1+s2+s3));
    }

    public static void ikiSayiTopla() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz: ");
        int s1= scan.nextInt();
        System.out.println("Ikinci sayiyi giriniz: ");
        int s2= scan.nextInt();
        System.out.println("Islem sonucu = "+(s1+s2));
    }





}
