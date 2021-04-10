package day25_arrays;

import java.util.Arrays;

public class Arrays4 {
    public static void main(String[] args) {
        // iki arrayin esit oldugunu kontrol etme

        int arr1[] = {10,25,5,20};

int arr2[]= {25,10,5,20};

        System.out.println(Arrays.equals(arr1,arr2));
Arrays.sort(arr1);
Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1,arr2));
// iki arrayin birbirine esit olmasi iin hem uzunluklari hem elemanlari hem de
        //indexleri esit olmalidir


    }}
