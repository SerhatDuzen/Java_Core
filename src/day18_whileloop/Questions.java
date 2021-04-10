package day18_whileloop;

import java.util.Random;
import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {

        //While Loop
        // Soru 5) Kullanicidan bir rakam alin ve bu rakam icin garpim tablosunu ekrana
        //yazdirin. Kullanicinin hata yapmadigini farz edin.
        // Ornegin kullanici 3 girerse;
        // 3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
        //Soru 6 ) Kullanicidan bir sayi alin ve bu sayiyi tam
        // bolen sayilari ve toplam kac tane olduklarini ekranda yazdirin
        //Soru 7 ) Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin
        //8:30
        //abi extra olarak:
        //8:30
        //Kullanıcı 0 girinceye kadar sayı istemeye devam eden, girilen sayıları toplama ekleyen, 0 girdiğinde
        // döngüyü sonlandırıp toplamı ekrana yazan program:
        //8:31
        //Kullanıcı tarafından girilen bir sayının kaç basamaklı olduğunu bulup ekrana yazdıran programını
        // While döngüsü kullanarak yazınız.
        //8:34
        //zor sorular=>
        //8:35
        //0 ile 100 arasında  seçilen sayıyı tahmin ettiren program,, while icinde sayi isteyecez,
        // onceden belirlenen sayi ile ayni mi ona bakacaz
        rakamaGoreCarpim(7);
        rakamlariToplami(39885);
        //sifirGireneKadarTopla();
        kacBasamakli(8899);
        sayiBul();

    }

    private static void sayiBul() {
        Random r = new Random();
        int sayi = (int)(Math.random());



    }

    private static void kacBasamakli(int i) {
        int totalDigit =0;
        while (i>0){
            i /=10;
            totalDigit++;
        }
        System.out.println(totalDigit);


    }

    private static void sifirGireneKadarTopla() {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        while (true){
            System.out.println("Lutfen sifir disinda bir sayi giriniz:");
            int deger = scan.nextInt();
            if(deger==0){
                break;
            }
            else {
                sum+=deger;
            }
        }
        System.out.println(sum);

    }

    private static void rakamlariToplami(int i) {
        String sayi = i+"";
        int toplam=0;
        while (i!=0){
            toplam+= (i%10);
            i /=10;
        }
        System.out.println(toplam);
    }

    private static void rakamaGoreCarpim(int sayi) {
        int bir = 1;
        while(bir<=10){
            System.out.println(sayi+" X "+bir+" = "+(bir*sayi));
            sayi++;
        }

    }
}
