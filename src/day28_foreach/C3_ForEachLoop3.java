package day28_foreach;

import java.util.ArrayList;
import java.util.List;

public class C3_ForEachLoop3 {
    public static void main(String[] args) {

        //verilen bir arraydeki tum elemanlaribir listeye aktaran method yaziniz

        String arr[] = {"Ali","Veli","Ayse","Fatma"};

        List<String> list = listeyeCevir(arr);
        System.out.println(list);
    }

    public static List<String> listeyeCevir(String[] arr) {

        List< String> tempList = new ArrayList<>();
        for (String i:arr
             ) {
            tempList.add(i);
        }

        return tempList;
    }


}
