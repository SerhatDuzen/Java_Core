package day19_dowhileloop;

import java.util.Scanner;

public class C4_DoWhileLoop2 {
    public static void main(String[] args) {

        //Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a basmasini soyleyin.
        //  Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve “Negatif sayi giremezsiniz”
        //  yazdirip basa donun
        //  Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini, yanlislikla kac negative
        //  sayi girdigini ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
        Scanner scan = new Scanner(System.in);
int pozitifsayi=0, negatifsayi=0, toplam=0, sayi=1;


        do {
            System.out.println("Lutfen pozitif bir sayi giriniz: ");
            sayi = scan.nextInt();
            if(sayi>0){
                pozitifsayi++;
                toplam+=sayi;
            }else if(sayi<0) {
                System.out.println("Negatif sayi giremezsiniz ");
                negatifsayi++;
            }

        }while (sayi!=0);
        System.out.println("Toplam pozitif " + pozitifsayi );
        System.out.println("Toplam negatif " + negatifsayi );
        System.out.println("Toplam: "+ toplam);
        scan.close();
    }
}
