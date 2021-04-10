package day31_varargsstringbuilder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        /* Kullanicidan int  list uzunlugunu isteyin
         * Listin uzunlugu kadar kullanicidan list 
         * elemanlarini girmesini isteyin
         * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen olusturmak istediginiz Listeni eleman sayisini giriniz :");
        int listLn = scan.nextInt();
        List<Integer> list = new ArrayList<>(); 
        for (int i = 0; i < listLn; i++) {
            System.out.print("Listenizin "+(i+1)+"inci elemaini giriniz : ");
            list.add(scan.nextInt());
        }
        tekrarEdenElemanlariBul(list);


        scan.close();

    }

    private static List<Integer> tekrarEdenElemanlariBul(List<Integer> list) {
        List<Integer> list2 = new ArrayList<>();

        for (int i:list
             ) {
            if(!list2.contains(i)) list2.add(i);
        }


        //for (int i = 0; i < list.size(); i++) {
        //    if(!list2.contains(list.get(i))) list2.add((list.get(i)));
        //}
        System.out.println("Tekrarsiz liste: "+list2);
        return list2;
    }
}
