package day16_forLoop;

import java.util.Scanner;

public class C2_ForLoop2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz = ");
        int s1 = scan.nextInt();
        System.out.println("Lutfen diger sayiyi yaziniz = ");
        int s2 = scan.nextInt();

        if(s1>s2){
            for (int i = s2; i <=s1 ; i++) {
                System.out.printf(i+",");
            }
        }
        else if(s2>s1 ){
            for (int i = s1; i <=s2 ; i++) {
                System.out.printf(i+",");
            }
        }
        else {
            System.out.println("Sayilar esiiittt!!!!!");
        }
        scan.close();
    }
}
