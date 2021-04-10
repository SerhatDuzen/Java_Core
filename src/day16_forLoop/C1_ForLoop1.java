package day16_forLoop;

import java.util.Scanner;

public class C1_ForLoop1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 1. sayiyi yaziniz = ");
        int s1 =  scan.nextInt();
        System.out.println("Lutfen 2. sayiyi giriniz = ");
        int s2= scan.nextInt();

        if(s1>s2){
            for (int i = s2+1; i < s2 ; i++) {
                System.out.print(i+",");
            }
            }else if (s2>s1){
            for (int i = s1+1; i < s2 ; i++) {
                System.out.print(i+",");
        }

    }else {
            System.out.println("Girdiginiz sayilar esittir!!");
        }
        scan.close();
}}
