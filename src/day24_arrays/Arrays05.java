package day24_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays05 {
    public static void main(String[] args) {

        //Scanner scan =new Scanner(System.in);

        int arr[] = {2,5,6,8,1,3,4,555,33,11,22};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        for (int i = arr.length; i >= 0  ; i--) {
            System.out.println(arr[i]+" ");
        }
        
    }

}
