package day39_exceptions;

import java.util.Scanner;

public class Exceptions08 {
    public static void main(String[] args) {
        /*

         Kullanicidan carpma yapmak icin bir String isteyin.
         Kullanicinin girdigi String sadece sayilardan olusuyorsa
         sayiyi 2 ile carpip sonucu yazdirin.
        Kullanici sayilardan olusmayan bir String girerse
        “Girdiginiz String sayiya cevrilemez” yazdirin.
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir string giriniz : ");
        String str = scan.next();
        try{
            int sayi = Integer.parseInt(str);
            System.out.println(sayi*2);
        }catch (NumberFormatException n){
            System.out.println("Girdiginiz string sayiya cevrilemez!");
        }


    }
}

//104 , 106, 107
