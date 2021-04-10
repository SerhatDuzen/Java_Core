package day28_foreach;

import java.util.ArrayList;
import java.util.List;

public class C4_ForEachLoop4 {
    public static void main(String[] args) {

        String arr1[] = { "Ali","Can","Ayse","Seher"};
        String arr2[] = { "Ali", "Veli","Mesut","Seher","Sedat"};

        //ortak elemanlari koynak icin

        List<String> list = new ArrayList<>();

        for (String str:arr1
             ) {
            //list.add(str);
            for (String str2:arr2
                 ) {
                if(str.equals(str2)){
                    list.add(str2);
                }

            }
        }
        List<String> listSon = new ArrayList<>();
        for (String str: arr1
             ) {
            listSon.add(str);
        }
        for (String str: arr2
        ) {
            listSon.add(str);
        }
        for (String str: list
             ) {
            listSon.remove(str);
        }

        System.out.println(listSon);
    }
}
