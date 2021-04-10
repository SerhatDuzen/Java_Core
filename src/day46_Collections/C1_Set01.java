package day46_Collections;

import java.util.HashSet;
import java.util.Set;

public class C1_Set01 {

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        //set de onemli olan ozellik no dublacitin ve elemanin kumede var olup olmamasidir
        //siralama onemli degildir ancak girilen siralamada verir/natural siralama

        set1.add("E");
        set1.add("A");
        set1.add("B");
        System.out.println(set1.hashCode());
        set1.add("C");
        set1.add("A");
        set1.add("B");
        System.out.println(set1.hashCode());
        System.out.println(set1); //SETTE siralama yoktur. Ama burada siralama
        //olmasina agmen garantisi yoktur
        //Collectionsda Hashcode methdu o collection icindeki tum elemanlarin
        //hashcode larinin toplamini verir
        //yeni eleman eklersek hashcode degisir

    }

}
