package day07_iflsestatements;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class C7_IfElseIf2 {
    public static void main(String[] args) {
        //Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
        // sayilarin ikisi de negative ise sayilarin carpimini yazdirin, sayilarin ikisi  farkli isaretlere sahipse “
        // farkli isaretlerde sayilarla islem yapamazsin” yazdirin,  sayilardan sifira esit olan varsa “sifir
        // carpmaya gore yutan elemandir”  yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int s1= scan.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        int s2 = scan.nextInt();
        if (s2>0&&s1>0) {
            System.out.println("Sayilarin toplami = "+(s1+s2));
        }else if(s1<0&&s2<0){
            System.out.println("Sayilarin carpimi = "+(s1*s2));
        }else if(s1==0||s2==0){
            System.out.println("Sifir carpmada yutan elemandir");
        }
        else{
            System.out.println("Farkli isaretlerle islem yapamazsin");
        }



        scan.close();
    }
}
