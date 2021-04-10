package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions04 {
    public static void main(String[] args) {
        /*
         eger handle edilecek exceptionlar arasinda parent child iliskisi varsa
         bu durumda child exception icin catch blogu yazmasak da kodumuz calisir
         child exc i silmenin pozitif yani:
         tum exceptionlar handle edilebilir
         negatif yonu: bir sorunla karsilasildiginda bunun dosya bulunamadigi icin mi yoksa
         dosya okunamadigi icin mi oldugu anlasilmaz
        */
        try {
            FileInputStream fis = new FileInputStream("/Users/serhatduzen/IdeaProjects/winter2021turkish/src/day39_exceptions/File");
            int k=0;

            while((k=fis.read())!=-1) {
                System.out.print((char)k);
            }
        fis.close();
        }   // once child exception'i yazdik



         catch (IOException e) { // sonra parent exception


            System.out.println(e.getMessage());
        }
        System.out.println("");
        System.out.println("Kod bloke olmamisss");
    }

}
