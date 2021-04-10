package day45_collections;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C1_LinkedList01 {
    public static void main(String[] args) {
        //linked list de tum elemanlar tren gibi birbirine baglidir
        //collectionsda obje olustururken olusturmak istedigimiz collection un
        //class mi yoksa interface mi olduguna bakmaliyiz
        //eger olusturmak istedigimiz collection interface ise data turu olarak
        //o interface i, const olarak ise uygun bir class secmeliyiz
        //simdiye kadar list(interface) olustururken const olarak arraylist secmistik


        List<String>  liste = new ArrayList<>();
        liste.add("w");
        liste.add("y");
        LinkedList<String> ll1 = new LinkedList<>();

        ll1.add("A");
        ll1.add("B");
        System.out.println(ll1);
        ll1.add(1,"C");
        System.out.println(ll1);
        ll1.addAll(
             liste
        );
        System.out.println(ll1);
        ll1.addAll(2,liste);
        System.out.println(ll1);
        ll1.addLast("K");
        System.out.println(ll1);
        //Linked list List ve Queue interfacelerine implement ile child oldugunda
        //her iki interfacedeki tum methodlari overide etmek zorundadir
        //islev olarak ayni isi yapan addLast @ ' dan add() ise list den inhertittir

        //ben sadece list ozelliklerini iceren linkedlist olusturmak istiyorum
        List<String> list3 = new LinkedList<>();
        list3.add("sadece list den gelen ozellikler var");
        Queue<String> queue3 = new LinkedList<>();
        queue3.add("sadece queue ozellikleri icerir");




    }
}
