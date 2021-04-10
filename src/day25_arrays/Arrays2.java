package day25_arrays;

import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        //verilen bir arrayda verilen bir elemanin va olup olmadigini nasil kontrol edeirz

        int arr[] = {10, 25, 30, 3, 16, 75};

        int sayi = 26;

        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == sayi) {
                flag = true;
            }
        }
        System.out.println(flag);
//methodla=>once siralama yapacagiz
//Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr,sayi)); // sonuc olarak aranan
        //sayiin indexini doner// yoksa da - olarak olsaydi kacinci eleman olac. yazdiridi

        // array nasli stringe cevrilir

        String s=  Arrays.toString(arr);
        System.out.println(s);





    }
}
