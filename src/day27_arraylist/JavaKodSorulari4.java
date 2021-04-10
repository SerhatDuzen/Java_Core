package day27_arraylist;

import java.util.Scanner;

public class JavaKodSorulari4 {

    public static void main(String[] args) {
        /*
           Kullanıcının girmiş olduğu A,B,C,D,F notlarının karşılığını
           yazdıran Switch Case java kodunu yazınız.
           A	Excellent
           B	Good
           C	Average
           D	Deficient
           F	Failing

        Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen Harf notunuzu giriniz: ");
        String str = scan.next().toLowerCase();
        harfNotunuBul(str);


          Kullanicinin girmis oldugu ay icin kac gun oldugunu yazdiran Switch Case java kodunu yaziniz.



        System.out.print("Lutfen gun sayisini ogrenmek istediginiz ayin sirasini " +
                "sayi ile yaziniz : ");
        int aySira = scan.nextInt();
        ayKacGun(aySira);

Ternary kullanarak:
		int variable : FIYAT
		string variable : Secim (String Secim=.....)
		price = $10 ise Print “UCUZ”
		price 10-$20 arasi ise Print “UYGUN”
		diger durumlar icin “PAHALI” yazdirin.

        System.out.println("Lutfen durumunu ogrenmek istediginiz urunun fiyatini yaziniz : ");
        double fiyat = scan.nextDouble();
        System.out.print("Girmis oldugunuz urun ");
        System.out.print(fiyat<10?"ucuzdur!!":fiyat>20?"pahalidir!!":"uygundur!!");
/*
name1 ve name2 degiskenlerini olusturun.
name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
name1 degiskeninin karakter sayisi tek ise “name1 cift sayili olmadigi icin ortasina yerlestiremedik” yazdirin.
          e.g:
          name1= mehmet
         name2= ahmet
         Print ==> mehahmetmet

String name1 = "Adebayor";
String name2 = "Arshavin";
int t = name1.length();
        System.out.println(t%2==0?name1.substring(0,(t/2))+name2+name1.substring(t/2):"Name1 uzunlugu cift olmadigi icin ortasina yerlestiremedik!!");
*/

        /*
Kullanıcıdan bir kelime girmesini isteyin. Sözcükte tek sayıda karakter ve 3 veya daha fazla karakter içeriyorsa, kelimenin ortasındaki karakteri yazdırın.


Scanner sc = new Scanner(System.in);
        System.out.print("Lutfen bir kelime giriniz : ");
        String word = sc.next();
        int u = word.length();
        int avg = u/2;
        System.out.println(u%2!=0?word.substring(avg,avg+1):"Ortadaki harf belli deil");
*/
/*
Kullanıcıdan firstName ve lastName'i girmesini isteyin, ardından baş harflerini büyük harf yapın ve geri kalanı tamamen kucuk harf olarak konsolda yazdirin.
ferhat => Ferhat
          	kirac => Kirac

Scanner sc = new Scanner(System.in);
        System.out.print("Lutfen isminizi giriniz : ");
String isim= sc.next();
        System.out.print("Lutfen soy isminizi giriniz : ");
        String soyisim = sc.next();
        System.out.println(isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()+"\n"+
                soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase());

    }*/
/*
		StringMethods:
			Çift uzunlukta bir degiskenin ilk yarısını konsolda
			yazdirmak için bir Java programı yazıniz.

	    	     ORNEK:
		     	INPUT      :  Python
			OUTPUT :   Pyt
	    */

Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String word = scan.next();
        int u = word.length();
        System.out.println(u%2==0?word.substring(0,u/2):"Yarisi hesaplanamiyor!!");


    }
    private static void ayKacGun(int aySira) {
        switch (aySira) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Girmis oldugunuz ayda 31 gun vardir!!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Girmis oldugunuz ayda 30 gun vardir!!");
                break;
            case 2:
                System.out.println();
                System.out.println("Girmis oldugunuz ayda 28 gun vardir!!");
                break;

        }

    }

    private static void harfNotunuBul(String str) {
        switch (str) {
            case "a":
                System.out.println("Excellent");
                break;
            case "b":
                System.out.println("Good");
                break;
            case "c":
                System.out.println("Average");
                break;
            case "d":
                System.out.println("Deficient");
                break;
            case "f":
                System.out.println("Failing");
                break;
            default:
                System.out.println("Gecerli bir harf notu giriniz!!!");
        }
    }


}
