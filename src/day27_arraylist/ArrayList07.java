package day27_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList07 {
    public static void main(String[] args) {

// verilen bir arraydeki tekrarli elemalari silip tekrarsiz bir array olusturmak

        //isiyoruz. array veya list kullanarak bunu yapiniz

        Integer arr[] ={1,2,3,4,1,2,4,3,5,1,6,7,1,2,6,4,2 };

        List<Integer> liste = new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            if(!liste.contains(arr[i]))liste.add(arr[i]);
        }

        System.out.println(liste);

        Integer arr2[] = liste.toArray(new Integer[0]);



    }
}
