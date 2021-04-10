package day44_Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator03 {
    public static void main(String[] args) {
/*
Bir listedeki istenen sayi araliginda olmayan
elementleri silen bir program yaziniz …
(2. liste olusturmadan, gecerli liste uzerinde islem yapiniz)
 Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
 output: [23,40]
 */
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(13);
        list.add(56);
        list.add(23);
        list.add(2);
        list.add(13);
        list.add(56);
        list.add(23);
        list.add(45);
        list.add(14);
        list.add(40);
        ListIterator li3 = list.listIterator();
        list.add(45);
        list.add(14);
        list.add(40);


        while (li3.hasNext()){
            int a = (int) li3.next();
            if(a>=20&&a<=40) {
            }else {
                li3.remove();
            }
        }
        System.out.println(list);


    }
}
