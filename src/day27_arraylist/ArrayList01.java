package day27_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Ali");
        list.add("Can");
        list.add("Ayse");
        list.add("Fatma");

        System.out.println(list);

        System.out.println(list.size());

        System.out.println(list.remove(1)); // indexi 1 olan can i silip sildigi elemani dondurecek

        System.out.println(list.remove("Ayse"));; // ayse'yi silecek ve bize true dondurecek

        System.out.println(list.remove("Mehmet")); // mehmeti bulamadigi icin
        //bize false donecek

        String isim = "Ali"; // immutable degistirliemez
isim.toLowerCase();
        System.out.println(isim);

        System.out.println(list);

        list.add("Ayse"); // mutable






    }
}
