package day48_Maps;

import java.util.*;

public class Maps02 {

    public static void main(String[] args) {
        //asagida verilen bir mapte ozel bir degr almis keyleri liste olarak
        // yaziran bir method yaz

        Map<Integer,String> map1 = new HashMap<>();

        map1.put(101, "Ali, Can, java");
        map1.put(102, "Veli, Yan, java");
        map1.put(103, "Ali, Yan, C#");

        String istenenDil = "c#";
        List<String> myList = javayiBilenler(map1,istenenDil);
        System.out.println(myList);
    }

    public static List<String> javayiBilenler(Map<Integer, String> map1, String istenenDil) {
        List<String> isimListesi = new ArrayList<>();
        for (String each:map1.values()
             ) {
            String arr[] = each.split(", ");
            if(arr[2].equalsIgnoreCase(istenenDil)){
                isimListesi.add(arr[0]);
            }
        }
return isimListesi;
    }
}
