package day46_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C2_HashSet01 {
//arraydeki tekrarli elalmanlari silip unique elemanlardan olusan bir arraya ceviren
    //bir method yaziniz

    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,3,2,4,5,6,7,8,4,5};
        int tarr[] = tekrarliElemanlariSil(arr);
        System.out.println(Arrays.toString(tarr));

    }

    private static int[] tekrarliElemanlariSil(int[] arr) {
        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set1.add(arr[i]);
        }
        int arr2[] = new int[set1.size()];
        int index = 0;
        for (int i:set1
             ) {
            arr2[index]=i;
            index++;
        }
     return arr2;
    }
}
