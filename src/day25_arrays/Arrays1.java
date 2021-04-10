package day25_arrays;

import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {

        //Array: birden fazla var store etmek icin kull
        // arr olustururken 2 seyi declare etmeliyiz: 1-data type 2-uzunluk
        //max eleman sayisindan fazlasini koymak istersek RTE verir


        int arr[] = {10, 44, 55};
        String arr2[] = new String[4];
        //arrayda pri datalar veya np lerin referanslari store edilebilir
        //mesela isimler arryain icinde isim degerleri degil, isimlerin referanslari olur

        //arrayin elemanlarina ulasma ve update etme:

        System.out.println(arr2[1]);
        arr2[2]="Boss";
        arr2[0]="Elveda";
        System.out.println(arr2); // referanslari yazdirir
        System.out.println(Arrays.toString(arr2));




    }
}
