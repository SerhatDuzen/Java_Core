package day27_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList03 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");
        int sayi = scan.nextInt();

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1);

        while (list.get(list.size() - 1)+ list.get(list.size()-2) <= sayi) {
            list.add(list.get(list.size() - 1) + list.get(list.size() - 2));

        }
        System.out.println(list);
        scan.close();
    }
}
