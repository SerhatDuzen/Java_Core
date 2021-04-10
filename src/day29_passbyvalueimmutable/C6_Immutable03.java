package day29_passbyvalueimmutable;

import java.util.ArrayList;
import java.util.List;

public class C6_Immutable03 {
    public static void main(String[] args) {
        //atama yapildiginda ne olr?

        String isim = "";
        for (int i = 0; i <10 ; i++) {
            isim=isim+i;
            System.out.println(isim);
        }
        System.out.println(" -------- ");
       System.out.println(isim);
// java bu kodu calistirdiginda 11 tane obje olusturdu // 1 kendi 10 tane de loop
// 10 tanesi garbage collector a gider. vatoz gibi onlari siler


        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add(String.valueOf(7));
        System.out.println(list);
    int arr[] = {1,3,5};
    int x=0;
        for (int i:arr
             ) {
            x= x+i*i;
        }
        System.out.println(x);
    }
}
