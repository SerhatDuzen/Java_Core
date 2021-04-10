package day27_arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Ali");
        list.add("Can");
        list.add("Ayse");
        list.add("Fatma");

        System.out.println(list);

        list.set(2, "Kemal"); //set methodu o indexteki elemani kaldirir bizim istedigimiz
        //elemani koyar replace

        list.add(2, "Yasin");
        System.out.println(list);
        list.set(0, "Semih");
        System.out.println(list);
//list.set(4,"Yasin");  olmayan bir index giilirse RTE verir
        list.add(5, "Hurriyet"); //en cok index sayisi/
        System.out.println(list);
        //list.add(10,"Sefer"); // size dan buyuk index hata verir
        list.add(list.size(), "Serhat");

        System.out.println(list.contains("Hurriyet"));

        System.out.println(list.contains("Mehmet"));

        // list in elemanlarini siralama

        Collections.sort(list); //ONEMLI

        System.out.println(list);




    }
}
