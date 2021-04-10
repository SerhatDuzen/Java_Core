package day31_varargsstringbuilder;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        /*
         * bir array'deki sayilarin ortalamasini bulan java kodunu yaziniz
         *
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */
        int arr[] = {1,2,3,4,5,6,7};
        double avg = arrayinOrtalamasiniBul(arr);
        System.out.println(avg);
    }

    private static double arrayinOrtalamasiniBul(int[] arr) {
        int sum = 0;
        for (int w :arr
             ) {
            sum+=w;
        }

        return sum/arr.length;
    }
}
