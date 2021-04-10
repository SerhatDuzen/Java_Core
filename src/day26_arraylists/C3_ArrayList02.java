package day26_arraylists;

import java.util.ArrayList;
import java.util.List;

public class C3_ArrayList02 {
    public static void main(String[] args) {
        // lsit in uzunlugu nasil bulunur

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(15);
        list.add(8);
        list.add(12);
        list.add(20);

        System.out.println(list);

        int uzunluk = list.size();

        System.out.println(uzunluk);

        // bir eleman nasil silinir

        list.remove(1);
        System.out.println(list);

        System.out.println(list.remove(2));
//remove index kullandigimizda o indexteki elemani remove eder ve buun delili olarak
        //o elemani getirir. eger olmayan bir index girersek RTE VERIR
        System.out.println(list);

        //System.out.println(list.remove(5));

        List<String > list2 =  new ArrayList<>();
        list2.add("Ali");
        System.out.println(list2.remove("Hasan")); // degeri bulamayinca false doner

        // remove(object) methodu kullanildiginda eger java istenen elemani bulup
        // remove ederse bize true dondurur
        //lstede bulamazsa FALSE doner
        System.out.println(list2.remove("Ali"));


    }
}
