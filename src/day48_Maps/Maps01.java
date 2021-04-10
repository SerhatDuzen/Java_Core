package day48_Maps;

import java.util.HashMap;
import java.util.Map;

public class Maps01 {

    public static void main(String[] args) {

        Map<Integer,String> map1 = new HashMap<>();

        HashMap<Integer,String> map2 = new HashMap<>();

        map1.put(101, "Ali, Can, java");
        map1.put(102, "Veli, Yan, java");
        map1.put(103, "Ali, Yan, C#");
        System.out.println(map1);

        map2.put(101, "Vehri, Bas, java");
        map2.put(102, "Esra, Coban, sql");

        map1.putAll(map2);
        System.out.println(map1);
        //map e yeni bir eleman entry eklemek istedigimde java keye bakar
        //ilk map de ekleecek key varsa bu key e ait value 2.deki entry ninki ile updatelenir

        map1.putIfAbsent(102, "Ahmet, Demir, Java"); //yoksa ekle
        System.out.println(map1);
        map1.putIfAbsent(100, "Ahmet, Demir, Java"); //yoksa ekle
        System.out.println(map1);

        System.out.println(map1.containsKey(102));
        System.out.println(map1.containsValue("Java"));//false /aranan degerin tam esiti
        //varsa rue dondurur


    }
}
