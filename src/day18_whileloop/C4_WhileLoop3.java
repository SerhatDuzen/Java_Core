package day18_whileloop;

import java.util.Scanner;

public class C4_WhileLoop3 {
    public static void main(String[] args) {
//oru 4) Kullanicidan baslangic ve bitis haflerini alin ve baslangic harfinden
// baslayip bitis harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin.
// Kullanicinin hata yapmadigini farz edin.
        Scanner scan = new Scanner(System.in);
        char c1 = scan.next().toUpperCase().charAt(0);
        char c2 = scan.next().toUpperCase().charAt(0);

        if(c1>c2){
            while ( c1>c2 ){
                System.out.print(c2+" ");

                c2++;
            }
            }else if(c2>c1){
            while ( c1<c2 ){
                System.out.print(c1+" ");

                c1++;
            }

            scan.close();

    }
}}
