package day38_exceptions;

import java.util.Scanner;

public class Exceptions02 {

    public static void main(String[] args) {
        //Kullanicidan 2 tamsayi alin ve bolumlerini yazdirin


        Scanner scan = new Scanner(System.in);
        int count = 0;
        while (count < 100) {
            System.out.println("Lutfen bolunecek tam sayiyi yazin ;");
            int s1 = scan.nextInt();
            System.out.println("Lutfen bolecek tam sayiyi girin ; ");
            int s2 = scan.nextInt();

//javaya exceptionsu handle etmek icin bir cozum uretmez isek
// java exception ile kasilastiginda calsmyi durduur. bu stops execution
            //throws exception firaltir/problemin kaynagini gosterir
// tum application durmus olur/ yasayan bir uygulamada bu KABUL EDILEMZ
            //BUNUN ICIN kod yazan kisi muhtemel sorunlari ongormeli ve javaya
            //bu sorunla handle eddebilmesi icin yol gostermelidir

            System.out.println("Islem no = " + (count + 1));
            try {
                System.out.println("Bolme isleminin sonucu : " + s1 / s2);
            } catch (ArithmeticException e) {
                System.out.println("Sayiyi 0 a bolemezsin!!");
            }
            count++;
        }
    }
}
