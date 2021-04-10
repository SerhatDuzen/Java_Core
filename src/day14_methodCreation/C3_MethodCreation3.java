package day14_methodCreation;

import java.util.Scanner;

public class C3_MethodCreation3 {
    public static void main(String[] args) {

        ortalama(15.15,23.65,43.66);

ortalama(44,55);
    }


    public static void ortalama(double d1,double d2, double d3){
        System.out.println((d1+d2+d3)/3);

    }
    public static void ortalama(double sayi1,double sayi2){

        System.out.println("Girdiginiz iki sayinin ortalamasi "+(sayi1+sayi2)/2);
    }
}
