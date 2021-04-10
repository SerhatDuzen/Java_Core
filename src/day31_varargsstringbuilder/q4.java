package day31_varargsstringbuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class q4 {
    /* bir multidimensional array'i parametre olarak kabul
    eden bir method yazin
     * bu method array'deki elemanlari arraylist'e aktarsin
     * ve arraylist'i natural order'a gore yazdirin
     *
     * Eg : Input : {{John,Brad,Fox},{Lee,Ali},{Suzan}}
     * 		Output:[Ali, Brad, Fox, John, Lee, Suzan]
     */
    public static void main(String[] args) {
        String arr[][] = {{"John","Brad","Fox"},{"Lee","Ali"},{"Suzan"}};

        arrayiNaturalYazdir(arr);

    }

    private static void arrayiNaturalYazdir(String[][] arr) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                list.add(arr[i][j]);
            }
        }
        Collections.sort(list);
        System.out.println(list);

    }
}
