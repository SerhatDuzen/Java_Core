package day24_arrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen array uzunlugunu giriniz!!");

        int arraylenght = scan.nextInt();

        int arr[] = new int[arraylenght];

        for (int i = 0; i < arraylenght; i++) {
            System.out.print((i+1)+"nci sayiyi giriniz:");
            arr[i]= scan.nextInt();
        }
        System.out.println("Listeniz = "+ Arrays.toString(arr));

    }
}
