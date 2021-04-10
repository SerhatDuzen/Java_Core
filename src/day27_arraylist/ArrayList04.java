package day27_arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();

        list1.add(10);
        list1.add(20);

        List<Integer> list2 = new ArrayList<>();

        list2.add(20);
        list2.add(10);

        System.out.println(list1.equals(list2)); // elemanlar ayni olsa da
        //indexler farkli oldugu ucun FALSE verir

        Collections.sort(list2);

        System.out.println(list1.equals(list2));

        list1.clear(); // listedeki tum elemanlari siler

        System.out.println(list1);



    }
}
