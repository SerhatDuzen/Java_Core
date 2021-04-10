package day39_exceptions;

import java.util.Scanner;

public class Soru {
   /* String str[],Urun isimlerini tuttugumuz bir Array olsun.
   Kullanicidan istedigi urunun sirasini isteyin ve istedigi urunu yazdirin.
    Kullanici Array’de olan urun sayisindan buyuk bir sira no girerse
    “Girdiginiz sira urun sayisindan buyuk” yazdirin.
*/
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       String str[]= new String[10];
       try{
           System.out.println("Diziye istediginiz urunun indexini giriniz : ");
           String word = str[scan.nextInt()];
           System.out.println("Girmis oldugunuz sayi eklenmistir!");
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println("Girmis oldugunuz sayi indexte yoktur");
       }


   }
}

