package day29_passbyvalueimmutable;

import java.util.ArrayList;
import java.util.List;

public class C4_immutable {
    public static void main(String[] args) {
        String isim = "Ali";
        isim.concat("can");
        System.out.println(isim); //Ali
        System.out.println(isim.concat("can")); //Alican
        System.out.println(isim); //Ali

        //Stringlerde method ile yaptigimiz degisikikler kalici olmaz
        //cunku java string classini immutable yapmistir


        List<String> isimList = new ArrayList<>();
        System.out.println(isimList); // []
        isimList.add("Ali");
        isimList.add("Can");
        System.out.println(isimList); //[Ali, Can]
        //list lerde methodla yaptigimiz degisiklikler list e islenir
        //cunju list mutable dir



    }
}
