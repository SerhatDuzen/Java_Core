package day31_varargsstringbuilder;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Olusturmak istediginiz arrayin uzunlugunu giriniz : ");
        int uz = scan.nextInt();
        int arr[] = new int[uz];
        for (int i = 0; i < uz; i++) {
            System.out.println("Arrayin "+(i+1)+" nci elemanini giriniz: ");
            arr[i]= scan.nextInt();
        }
        elemanlarinToplami(arr);
        scan.close();
    }

    private static void elemanlarinToplami(int[] arr) {
        int sum=0;
        for (int w:arr
             ) {
            sum+=w;
        }
        System.out.println("Array deki sayilarin toplami = "+sum);
    }
}
