package day06_ifstatements;

import java.util.Scanner;

public class C2_IfStatements2 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("TEK MI CIFT MI\nLutfen bir sayi giriniz!!");
        //int i= scan.nextInt();
/*
        if (scan.hasNextInt()) {
            int i= scan.nextInt();
            if (i %2 == 0) {
                System.out.println("Cift sayidir");
            }
            else{
                System.out.println("Tek sayidir");
            }
        }
        else {
            System.out.println("Sayi giriniz!!!!");
        }

 */
        System.out.println("Lutfen yasinizi giriniz = ");//?
        if (scan.hasNextInt()){
            int i = scan.nextInt();
                 if(i>70){
                    System.out.println("Yaslanmissin be haci!!");

                    }
                 else if(i>30&&i<71){
                    System.out.println("Olgun yas");
                    }
                    else if(i<31&&i>0){
                        System.out.println("Gencsin be yavru!!");
                        }
                    else{
                        System.out.println("Ne yaziyon lan!!!!");
                        }
}
        else{
            System.out.println("Sayi gir lan!!");
        }

        scan.close();
    }
}
