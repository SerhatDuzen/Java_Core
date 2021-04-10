package day25_arrays;

import java.util.Arrays;

public class Arrays3 {

    public static void main(String[] args) {

        String s = "Herkes javayi tanisa severdi";
        /*System.out.println(s.length());
        char arr[] = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        System.out.println(Arrays.toString(arr));
        */
//kelimelere ayirmak istersek
        //String arr[] = s.split(" ");
        //System.out.println(Arrays.toString(arr));
        String arr2[] = s.split("java");
        //System.out.println(Arrays.toString(arr2));

        String arr3[] = s.split("");
        System.out.println(Arrays.toString(arr3));// harf harf boler



    }
}
