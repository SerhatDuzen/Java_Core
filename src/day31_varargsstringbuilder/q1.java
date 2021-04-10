package day31_varargsstringbuilder;

import java.util.Arrays;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        /*
         * Kullanicidan bir isim alin ve bu ismi char array'ine
         * donusturen bir method yazin
         *
         *
         * (toCharArray methodunu kullanmayin)
         *
         * Input : John
         * Output : [J, o, h, n]
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir isim giriniz : ");
        String str = scan.next();
        char arr[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i]=str.charAt(i);
        }
        System.out.println(Arrays.toString(arr));
        scan.close();
    }
}
