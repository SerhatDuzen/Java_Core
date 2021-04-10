package day31_varargsstringbuilder;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
/* Girilen Multidimensional arraydeki cift sayilari toplayan bir method
         * yaziniz
                *
         *
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
                *
         *
         */
        int arr[][]={{1,3,6},{2,8},{5,7,9,14}};
        arrToplaminiBul(arr);

    }

    private static void arrToplaminiBul(int[][] arr) {
        int sum=0;
        for (int[] outer:arr
             ) {
            for (int i:outer
                 ) {
                if(i%2==0) sum +=i;
            }
        }
        System.out.println(sum);
    }
}
