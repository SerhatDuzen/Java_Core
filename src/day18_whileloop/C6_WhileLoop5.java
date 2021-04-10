package day18_whileloop;

import java.util.Scanner;

public class C6_WhileLoop5 {
    public static void main(String[] args) {


//asalSayiMi(79);
//isPrimeNumber(39);
    }

    private static void isPrimeNumber(int sayi) {
        String  flag = "Asal";
        int bolen = 2;
        while(sayi>bolen){
            if(sayi%bolen==0){
                flag="Asal sayi degil";
            }
            bolen++;
        }
        System.out.println(flag);
    }

    private static void asalSayiMi(int sayi) {
        int bolen = 2;
        int sayac = 0;
        while(bolen<sayi){
            if (sayi%bolen==0){
                sayac++;
            }

            bolen++;
        }
        if(sayac>0){
            System.out.println("Asal sayi degil");
            System.out.println((sayac+" kadar boleni var!!"));
        }else {
            System.out.println("Asal sayi");
        }


    }
}
