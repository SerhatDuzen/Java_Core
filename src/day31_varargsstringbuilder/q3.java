package day31_varargsstringbuilder;

import java.text.MessageFormat;

public class q3 {
    /*
     * Bir array'de aranilan sayinin olup olmadigini
     * kontrol eden bir method yazin
     *
     */
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,12,23,3,4,56,77,88,45};

        isThereMyNumber(arr, 89);

    }

    private static boolean isThereMyNumber(int[] arr, int sayi) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==sayi) flag=true;
        }

        System.out.println(flag?MessageFormat.format("{0} degeri arrayde mevcut",sayi):MessageFormat.format("{0} degeri arrayde mevcut degil",sayi));
        return flag;
    }
}
