package day15_methodcreation;

import java.io.StringBufferInputStream;
import java.util.Scanner;

public class For_Loop_Questions {
    public static void main(String[] args) {
        /*
Soru 1 ) Ekrana 10 kez “Java guzeldir” yazdirin
Soru 2 ) 10 ile 30 arasindaki sayilari aralarinda virgule
olarak ayni satirda yazdirin
Soru 3) 100’den baslayarak 50’ye kadar olan sayilari aralarinda
virgule olarak ayni satirda yazdirin
Soru 4) Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak
girilen sayiya kadar 3’un kati olan sayilari yazdirin.
Soru 5) Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak
girilen sayiya kadar 3’un veya 5”in kati olan sayilari yazdirin.
Soru 6) Interview Question Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak
girilen sayiya kadar tum sayilari yazdirin. Ancak;
- Sayi 3’un kati ise sayi yerine “Java” yazdirin.
- Sayi 5’in kati ise sayi yerine “Guzeldir” yazdirin.
- Sayi hem 3’un hem 5’in kati ise sayi yerine “Java Guzeldir” yazdirin.
Soru 7 ) Interview Question Kullanicidan bir String isteyin ve Stringi tersten yazdirin.
Soru 8 ) Interview Question Kullanicidan bir String isteyin ve Stringi
tersine ceviren bir program yazin.
Soru 9 ) Interview Question Kullanicidan bir String isteyin.
Kullanicinin girdigi String’in palindrome olup olmadigini kontrol eden bir program yazin.
Soru 10 ) Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari toplayip,
sonucu yazdiran bir program yaziniz
Soru 11 ) Interview Question Kullanicidan 50’den kucuk bir sayi isteyin ve
girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
*
**
***
****
Soru 13 ) Kullanicidan pozitif bir rakam girmesini isteyin ve
girilen rakama gore carpim tablosu olusturun. Ornek,kullanici 3 girerse,
123
246
369
         */

        //onKezJavaGuzeldirYazdir();
        //onIleOtuzArasiniYazdir();
        //yuzIleElliArasiniYazdir();
        //sayiyaKadarUceBolunenleriBulma(432);
        //sayiyaKadarUcunVeBesinKati();
        //sayiyaKadarJava();
        //stringiTerstenYazdirma("Serhat");
        //palindromKontrol("baab");
        //ikiSayiArasindakiSayilarinToplami(1,5);
        //faktoriyelBulma(5);
        //yildizSekli(15);
        //sayiyaGoreCarpimTablosu(5);
        //asalSayiBul(127);
        //girlenCumleyiUcgenYazdirma("Karga karga gak dedi cik su dala bak dedi");
        //yandanYildizSekli();
//ikiIleYuzArasindakiCiftSayilarinToplami();
//birIleYirmiArasindakiSayilarinCarpimi();

//carpimTablosu();

        //rakamlarininToplaminiBulma(1987888888);
//rakamlarininToplaminiBulmaYontem2(888555444);
       // sayiyaGoreCarpimTablosu(9);

        //
        //
        // stringReverse();

/*
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if(a>b){
            int sayac = 0;
            for (int i = b; i < a; i++) {
                sayac +=i;
            }
            System.out.println(sayac);
        }else if(b>a){
            int sayac= 0;
            for (int i = a; i <b ; i++) {
                sayac +=i;
            }
            System.out.println(sayac);
        }else {
            System.out.println("sayilar esit!!!");
        }
        scan.close();
*/

        Scanner scan=new Scanner(System.in);

        System.out.println("1 tane sayı girin");
String a = "abc";

        int sayi=scan.nextInt();
        int snc =1;
        for (int i = sayi; i >=1 ; i--) {
            snc *=i;
        }
        System.out.println(sayi+" sayisinin faktoriyelinin karsiligi = "+snc);


        scan.close();


    }

    private static void stringReverse() {
        Scanner scan = new Scanner(System.in);

        String kelime = scan.nextLine();

        for (int i = kelime.length()-1; i >=0 ; i--) {
            System.out.print(kelime.charAt(i));
        }
    }

    private static void rakamlarininToplaminiBulmaYontem2(int sayi) {
        int toplam = 0;
        String a = Integer.toString(sayi);
        for (int i = 0; i <a.length() ; i++) {
            toplam += sayi%10;
            sayi /=10;
        }
        System.out.println(toplam);

    }

    private static void rakamlarininToplaminiBulma(int sayi) {

        String s = Integer.toString(sayi);
        int rakamlarToplami =0;
        for (int i = 0; i < s.length() ; i++) {
            rakamlarToplami+= Integer.parseInt(s.substring(i,i+1));
        }
        System.out.println(sayi+" sayisinin rakamlari toplami :"+rakamlarToplami+"'dir.");
    }

    private static void birIleYirmiArasindakiSayilarinCarpimi() {
        int sayac =1;
        for (int i = 1; i <20 ; i++) {
            sayac*=i;
        }
        System.out.println("Bir ile yirmi arasindaki sayilarin carpimi "+sayac+"'dir.");
    }

    private static void ikiIleYuzArasindakiCiftSayilarinToplami() {
        int sayac = 0;
        for (int i = 1; i <100 ; i++) {
            if(i%2==0){
                sayac+=i;
            }
        }
        System.out.println("Iki ile yuz arasindaki sayilarin toplami "+sayac+"'dir.");
    }

    private static void yandanYildizSekli() {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Yandan yildizli sekli kacli yapmak istersin kocum? = ");
        int sayi = scan.nextInt();
        for (int i = 0; i <sayi ; i++) {
            for (int j = 0; j <sayi ; j++) {
                System.out.printf(" ".repeat(i));
            }
            System.out.printf("*".repeat(sayi));
            System.out.println();
            ////yapamadim tekrar bak
        }




    } ///yapamadim

    private static void girlenCumleyiUcgenYazdirma(String cumle) {
        for (int i = 0; i <= cumle.length() ; i++) {
            System.out.print(cumle.substring(0,i));
            System.out.println();
        }
    }

    private static void asalSayiBul(int sayi) {
        int x= sayi;
        for (int i = 2; i < sayi; i++) {
            if(sayi%i==0){
                x += i;
            }
        }
        System.out.println(sayi==x?"ASAL SAYI":"ASAL SAYI DEGIL");

    }

    private static void sayiyaGoreCarpimTablosu(int sayi) {
        for (int i = 1; i <= sayi ; i++) {
            for (int j = 1; j <=sayi ; j++) {
                System.out.print((i*j)+"  ");
            }
            System.out.println();
        }
    }

    private static void yildizSekli(int i) {
        if(i>=0){
            for (int j = 1; j <= i; j++) {
                System.out.println("*".repeat(j));
            }
        }
        else {
            System.out.println("Lutfen gecerli bir deger giriniz!!!!");
        }
    }

    private static void carpimTablosu() {
        //Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
        //*
        //** *** ****
        Scanner scan =  new Scanner(System.in);
        System.out.println("Lutfen pozitif bir rakam giriniz : ");
        int a = scan.nextInt();
        for (int i = 0; i <=a ; i++) {
            System.out.println("*".repeat(i));

        }



        scan.close();
        //Soru 13 ) Kullanicidan pozitif bir rakam girmesini isteyin ve
        //girilen rakama gore carpim tablosu olusturun. Ornek,kullanici 3 girerse,
        //123
        //246
        //369

    }

    private static void faktoriyelBulma(int sayi) {
        if(sayi>=1 ){
            int snc =1;
            for (int i = sayi; i >=1 ; i--) {
                snc *=i;
            }
            System.out.println(sayi+" sayisinin faktoriyelinin karsiligi = "+snc);
        }else {
            System.out.println("Lutfen pozitif bir tam sayi giriniz!!");
        }

    }

    private static void ikiSayiArasindakiSayilarinToplami(int s1, int s2) {
        if (s1>s2){
            int toplam =0;
            for (int i = s2+1; i < s1; i++) {
                toplam +=i;
            }
            System.out.println("Girmis oldugunuz sayilarin arasindaki sayilarin toplam degeri = "+toplam );
        }else {
            int toplam =0;
            for (int i = s1+1; i < s2; i++) {
                toplam +=i;
            }
            System.out.println("Girmis oldugunuz sayilarin arasindaki sayilarin toplam degeri = "+toplam );
        }

    }

    private static void palindromKontrol(String s) {
        String tersten = "";
        for (int i = s.length()-1 ; i >= 0; i--) {
            tersten += String.valueOf(s.charAt(i));
        }
        System.out.println(s.equalsIgnoreCase(tersten)?s+" kelimesi bir palindrom kelimedir..":s+" kelimesi palindrom degildir");
    }

    private static void stringiTerstenYazdirma(String isim) {
        for (int i = isim.length()-1; i>=0 ; i-- ){
            System.out.print(isim.charAt(i));
        }

    }

    private static void sayiyaKadarJava() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen 0 ile 100 arasinda bir sayi giriniz = ");
        int a = scan.nextInt();
        if(a>0&&a<100){
            for (int i = 1; i < a ; i++) {
                if(i%3==0&&i%5==0){
                    System.out.println("Java Guzeldir ");
                }else if(i%3==0){
                    System.out.println("Java ");
                }else if(i%5==0){
                    System.out.println("Guzeldir ");
                }else{
                    System.out.println(i);
                }
            }
        }else{
            System.out.println("Lutfen 0 ile 100 arasinda pozitif bir sayi giriniz!!!");
        }
        scan.close();
    }

    private static void sayiyaKadarUcunVeBesinKati() {
        //Soru 5) Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak
        //girilen sayiya kadar 3’un veya 5”in kati olan sayilari yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.printf("Lutfen 0 ile 100 arasinda bir sayi giriniz");
        int a = scan.nextInt();
        if (a >0&&a<100) {
            System.out.println("Girdiginiz" +a+ " sayisina kadar olan 3 un ve 5 in kati olan sayilar:" );
            for (int i = 0; i < a; i++) {
                if(i%3==0&&i%5==0){
                    System.out.println(i+" sayisi hem 3 un hem de 5 in katidir\n");
                }else if(i%3==0){
                    System.out.println(i+" sayisi 3 un katidir\n");
                }else if(i%5==0){
                    System.out.println(i+" sayisi 5 un katidir\n");
                }

            }
        }else {
            System.out.println("Lutfen 0 ile 100 arasinda bir sayi giriniz!!!");
        }
        scan.close();
    }

    private static void sayiyaKadarUceBolunenleriBulma(int sayi) {
        System.out.print("Sayilar = ");
        for (int i = 1; i <sayi ; i++) {
            if (i %3 == 0) {
                System.out.print(i+",");
            }
        }

    }

    private static void yuzIleElliArasiniYazdir() {
        for (int i = 100; i < 50; i--) {
            System.out.print(i+",");
        }
    }

    private static void onIleOtuzArasiniYazdir() {
        for (int i = 10; i <29 ; i++) {
            System.out.print(i+",");
        }
        System.out.println(29);
    }

    private static void onKezJavaGuzeldirYazdir() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Java guzeldir.");

        }
    }
}
