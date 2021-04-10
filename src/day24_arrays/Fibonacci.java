package day24_arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        //int s1 =0, s2=1, a=0, b=0, s3=0;
        ArrayList<Integer> sayilar =new ArrayList<Integer>();
sayilar.add(0);
sayilar.add(1);
        for (int i = 0; i < 20; i++) {
            int s1 = sayilar.get(sayilar.size()-1);
            int s2 = sayilar.get(sayilar.size()-2);
            sayilar.add(s1+s2);
        }
        //System.out.println(Arrays.toString(sayilar));
        //System.out.println(sayilar.toString());
        for (Integer i:sayilar
             ) {
            System.out.print(i+"+");
        }

    }
}
