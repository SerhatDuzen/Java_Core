package day26_arraylists;

import java.util.ArrayList;
import java.util.List;

public class C2_ArrayList01 {
    public static void main(String[] args) {
        //ArrayList bir objedir
        // yeni bir tane olusturmak icin new keyword kullanmaliyiz
        //1.yol
        ArrayList<String> list = new ArrayList<String>();
        //2.yol
        ArrayList<String> list2 = new ArrayList<>();
        //3.yol / en cok bu kullanilir
         List<String> list3 = new ArrayList<>();
//Olusturdugumuz class isimleri javada kullanilan obje isimleri ile ayni olmalidir
//list olustururken otomatik olarak ekleme ozelligi yoktur
        // elemanlari tek tek eklenmesi gerekir

        list3.add("ali");
        list3.add("veli");
        list3.add("ayse");
        System.out.println(list3);

        list3.add(1,"can");
        System.out.println(list3);

        list3.add(1,"Fatma");

        System.out.println(list3);

        /*
         Soru 6) Verilen bir Array’den istenen degere esit olan elamanlari kaldirip,
         kalanlari yeni bir Array olarak yazdiran bir method yaziniz
         */

        int arr[]= {2,3,5,3,6,4,3,6,7};
        int sayi=3;

        List<Integer> newList = new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]!=sayi){
                newList.add(arr[i]);
            }
        }
        System.out.println(newList);

    }
}
