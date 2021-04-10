package day28_foreach;

import java.util.ArrayList;
import java.util.List;

public class C5_ForEachLoop5 {
    public static void main(String[] args) {
//list deki karelerin toplami


        List<Integer> list =  new ArrayList<>();

        int sum = 0;

        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        for (int i:list
             ) {
            sum+=i*i;
            //System.out.println(sum);
        }
        //System.out.println("Sonuc");
        System.out.println(sum);

        
    }
}
