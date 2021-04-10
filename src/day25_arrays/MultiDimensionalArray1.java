package day25_arrays;

import java.util.Arrays;

public class MultiDimensionalArray1 {
    public static void main(String[] args) {
//1- ic ice arraylede ana array outer array, icerdeki kucuk arraylaraise
        //inner array denir
        /*
  2- eger arrylarin boyutlari birbirinden farkli ise array i tum elemanlai
  yazarak declare edebiliriz

  3- mda de bir elemanin indexi ici en distaki array haric, elemana
  kadar tum arraylerin indexlerini yazmak gerekir

*/

        int arr[][]={{1,3,5},{3,5},{5,9,11,3}};
        //11i index ile ifade
        System.out.println(arr[2][2]);

        //eger arrayi uzunlukla declare etmek istersek inner array uzunluklari
        //esit olmalidir

        int arr2[][]= new int[3][2];

        System.out.println(Arrays.toString(arr2));//sadece referenslar X

        System.out.println(Arrays.deepToString(arr2));
        //derindekilerle beraber



    }
}
