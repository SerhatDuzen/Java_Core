package day49_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps01 {
    public static void main(String[] args) {


        Map<Integer, String> map1 = new HashMap<>();
        map1.put(101,"Ali, Can, Java");
        map1.putIfAbsent(102,"Veli, Yan, Java");
        map1.putIfAbsent(103,"Ali, Yan, C#");
        System.out.println(map1);
        System.out.println(map1.size());
        System.out.println(map1.entrySet());
        System.out.println(map1.entrySet().size());

        Set<Map.Entry<Integer,String>> mapdenSet = map1.entrySet();
        for (Map.Entry<Integer,String> each:mapdenSet
             ) {
            System.out.println(each);
        }

        System.out.println(map1.equals(mapdenSet));

        System.out.println(map1.get(101));


    }
}