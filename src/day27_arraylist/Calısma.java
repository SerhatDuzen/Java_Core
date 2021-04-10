package day27_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calısma {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("C");
        list.add("E");
        list.add("F");
        list.add("B");
        list.add(1,"L");
        //System.out.println(list);
        list.set(3,"D");
       // System.out.println(list);
list.remove("F");
Collections.sort(list);
        System.out.println(list);

    }


}
