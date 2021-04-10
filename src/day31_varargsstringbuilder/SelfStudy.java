package day31_varargsstringbuilder;

import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.util.*;

public class SelfStudy {
    public static void main(String[] args) {
        /*Bos bir liste olusturun. Sirasi ile 10,20,20,30,40,40,40, sayilarini listeye ekleyin
         *
         * Method kullanarak  tekrar eden elemanlari silip listenin son uzunlugunu yazdiran bir program yazin
         *
         */
String isim= "";
        //isim = JOptionPane.showInputDialog("Lutfen isminizi giriniz : ");
        //System.out.println(isim);
int a =12888661;
float f = a;
        System.out.println(f);

        }

    private static void myMethod(List<Integer> list) {
        List<Integer> temp = new ArrayList<>();
        for (int a:list
             ) {
            if(!temp.contains(a)){
                temp.add(a);
            }
        }
        System.out.println(temp.size());
    }


}

