package day29_passbyvalueimmutable;

import java.util.ArrayList;
import java.util.List;

public class C3_PassByValue03 {
    public static void main(String[] args) {
        /*
        Soru3 : Bir list olusturalim. Eleman olarak 10,11,12 ekleyelim.
        Iki method olusturup list elemanlarini artirmayi deneyelim
  - 1. Method’da elemanlari for each loop kullanarak artirin
 - 2. Method’da elemanlari set method’u kullanarak artirin
  - Method’lari arka arkaya cagirip artislarin kalici olup
  olmadiklarini kontrol edelim.
         */

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(12);
        //System.out.println(list);

        //degistirFor(list);
        System.out.println("1. method call dan sonra " + list);

        degistirSet(list);
        System.out.println("2. method call dan sonra : "+ list);
        //java pass by value kullanir. ancak lsit deki set methodu istisnai olarak
        //methodun icinde yapilan degisiklikleri de kalici hale getirir
    }

    public static void degistirSet(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() ; i++) {
list.set(i, list.get(i)+3);
        }
        System.out.println("Method icindeki list = "+list);

    }

    public static void degistirFor(ArrayList<Integer> list) {
        for (int w:list // for each loop ile listeyi guncellemiyoruz
             ) {   //sadece her bir elemani tek tek cagirip 3 mfazlasini yazdirdik
            w+=3;
            System.out.print(w+" ");
        }
        System.out.println("\n"+list);
    }


}
