package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions01 {

    public static void main(String[] args) {
        //javaya bir dosyayi okumasini veya yazmasini soyledigimizde java
        //ya dosyayi bulamazsam der. Dossya bulma ile ilgili exception turu:
        //FileNotFoundExceptions
        //Java kodumuzu yazdigimiz anda olasi problemi gorur . Bunlara Checked
        //exceptions diyoruz.

        try {
            FileInputStream fis = new FileInputStream("/Users/serhatduzen/IdeaProjects/winter2021turkish/src/day39_exceptions/File");

        } catch (FileNotFoundException e) {
            //e.printStackTrace(); //tum hata aciklamalarini yazdirir ama kodumuz
            //bloke olmaz
            System.out.println(e.getMessage());
        }
        System.out.println("Kod bloke olmamis");

    }
}
