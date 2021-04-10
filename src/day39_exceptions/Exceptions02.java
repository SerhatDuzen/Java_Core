package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

    public static void main(String[] args) {
        /*
        eger kodumuzu yazdigimizda birden fazla exc la ilgili durum olusuyorsa ic ice
        try-catch bloklari olusturabiliriz // bu ornekte ilk once dosyayi okutmak istedim
        Java ya dosyayi okuyamazsam diye bizden yardim istedi.
        biz de try-catch blogu ile FileNotFoundException ile handle etmesine yardimci olduk
        Sonra da yazilari okumaya calsitik ve java yeniden "ya dosyyi okuyamazsam diye yardim istedi.
        ioexceptin ile handle etmesini saglladik
         */

        try {
            FileInputStream fis = new FileInputStream("/Users/serhatduzen/IdeaProjects/winter2021turkish/src/day39_exceptions/File");
            int k=0;
            try {
                while((k=fis.read())!=-1) {
                    System.out.print((char)k);
                }
            } catch (IOException e) { // dosyalarla ilgili genel yazma ve okuma sorunlari ile handle eder

                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {


            System.out.println(e.getMessage());
        }
        System.out.println("");
        System.out.println("Kod bloke olmamisss");
    }
    }

