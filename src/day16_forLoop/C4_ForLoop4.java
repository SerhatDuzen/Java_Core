package day16_forLoop;

import java.util.Scanner;

public class C4_ForLoop4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("");
int sayac =0;
        for (int i = 50; i <150 ; i++) {
            if(i%7==0){
                sayac+=i;
            }
        }
        System.out.println("50 den 150 ye kadar 7 ye bolunebilen sayilarin toplami = "+sayac);

        scan.close();
    }
}
