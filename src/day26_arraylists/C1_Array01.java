package day26_arraylists;

import java.util.Arrays;

public class C1_Array01 {

    public static void main(String[] args) {

int arr[] = {2,3,5,3,6,4,3,6,7};
int sayi = 3;
int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==sayi){
                count++;
            }
        }
int arr2[] = new int[arr.length-count];


       int a= 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=sayi){
                arr2[a]= arr[i];
                a++;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }


}
