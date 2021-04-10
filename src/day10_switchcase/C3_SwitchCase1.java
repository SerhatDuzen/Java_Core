package day10_switchcase;

import java.util.Scanner;

public class C3_SwitchCase1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz = ");

        int a = scan.nextInt();

        if (a==0){
            System.out.println("Sifir");
        } else if(a==1){
            System.out.println("Bir");
        }else if(a==2){
            System.out.println("Iki");
        }else if(a==3){
            System.out.println("Uc");
        }else if(a==4){
            System.out.println("Dort");
        }else if(a==5){
            System.out.println("Bes");
        }else if(a==6){
            System.out.println("Alti");
        }else if(a==7){
            System.out.println("Yedi");
        }else if(a==8){
            System.out.println("Sekiz");
        }else if(a==9){
            System.out.println("Dokuz");
        }else {
            System.out.println("Gecersiz deger girdiniz");
        }

        switch (a){
            case 0 :
                System.out.println("Sifir");
                break;
            case 1 :
                System.out.println("Bir");
                break;
            case 2 :
                System.out.println("Iki");
                break;
            case 3 :
                System.out.println("Uc");
                break;
            case 4 :
                System.out.println("Dort");
                break;
            case 5 :
                System.out.println("Bes");
                break;
            case 6 :
                System.out.println("Alti");
                break;
            case 7 :
                System.out.println("Yedi");
                break;
            case 8 :
                System.out.println("Sekiz");
                break;
            case 9 :
                System.out.println("Dokuz");
                break;
            default:
                System.out.println("Gecersiz deger!!");

                scan.close();
        }

    }
}
