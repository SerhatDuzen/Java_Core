package day44_Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator04 {
    public static void main(String[] args) {
        /*

         */
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(13);
        list.add(56);
        list.add(23);
        list.add(45);
        list.add(14);
        list.add(40);
        ListIterator li4 = list.listIterator();//cursoru sona goturme
        while (li4.hasNext()){
            li4.next();
        }


        while (li4.hasPrevious()){

            System.out.print(li4.previous()+" ");
        }
    }
}
