package day24_arrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {


        int sayi = 10;
        int sayi2= 20;
        int sayi3 = 30;

        String isim = "Ali";

int arr[] = {10,20,30}; // int[] arr seklide de kullanilir
//bu ornekte  arrayin elemanlarini direk yazdigim icin uzunluk belirmeye ihtiyac kalmadi
//bu kullanimda maxmeleman sayisi (lenght) yazdigimiz eleman sayisidir
        System.out.println(arr[0]); // Aray bir object dir. Eger direkm olarak arryi yazdirmak isterseniz
        // java referansi yazdirir
        System.out.println(Arrays.toString(arr));

String takim[] = new String[3];
        System.out.println(Arrays.toString(takim));
        takim[0] = "Ali";
        takim[1] = "Veli";
        takim[2] = "Hasan";
        takim[1]="Kemal";
//takim[3]="Mehmet";

        System.out.println(Arrays.toString(takim));
//bir arrayin uazunugu Arr.lenght
        System.out.println(takim.length); //stringdeki lenght() idi. arrayde sadece lengt
        takim[takim.length-1]= "Mehmet";





    }
}
