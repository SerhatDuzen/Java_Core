package day31_varargsstringbuilder;

import java.util.Arrays;
import java.util.Scanner;

public class q9 {
/* verilen arrayin n sayisi kadar maksimun
degerlerini bulan java programi yaziniz
 * not kisa metodlar kullamayiniz
 * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
int arr[] ={1,2,3,4,5,6,7,8};
        System.out.println("En buyuk kac elemani gormek istiyorsunuz?");
        int sayi = scan.nextInt();
mmMethod(arr,sayi);


        scan.close();
    }

    private static void mmMethod(int[] arr, int sayi) {
        Arrays.sort(arr);
        for (int i = arr.length-1; i >=arr.length-sayi ; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
