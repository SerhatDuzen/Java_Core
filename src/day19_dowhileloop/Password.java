package day19_dowhileloop;

import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
       /* Kullanicidan bir sifre girmesini isteyin.
                Girilen sifreyi asagidaki sartlara gore kontrol edin ve sifredeki hatalari yazdirin.
        Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin
        ve gecerli sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
                - Sifre kucuk harf icermelidir
                - Sifre buyuk harf icermelidir
                - Sifre ozel karakter icermelidir
                - Sifre en az 8 karakter olmalidir.
         */
        System.out.println(" - Sifre kucuk harf icermelidir\n" +
                "                - Sifre buyuk harf icermelidir\n" +
                "                - Sifre ozel karakter icermelidir\n" +
                "                - Sifre en az 8 karakter olmalidir.");
        Scanner scan = new Scanner(System.in);
        boolean flag = false;

        do {
            System.out.println("Lutfen sifre girisi yapiniz ; ");
            String sifre = scan.nextLine();
            flag =  isAtLeastEight(sifre) && smallCase(sifre) && greatCase(sifre) && charactr(sifre);

        }while(flag==false);
        System.out.println("Sifreniz basari ile olusturuldu!!");
        scan.close();
    }

    private static boolean charactr(String sifre) {
        boolean x = false;
        int index = 0;
        while(sifre.length()>index){
            if (sifre.charAt(index)>=' '&&sifre.charAt(index)<='/'){
                x = true;
            }


            index++;
        }
        if(x==false) {
            System.out.println("Sifre icersinde karakter olmali!!");
        }
        return x;

    }

    private static boolean greatCase(String sifre) {
        boolean x = false;
        int index = 0;
        while(sifre.length()>index){
            if (sifre.charAt(index)>='A'&&sifre.charAt(index)<='Z'){
                x = true;
            }


            index++;
        }
        if(x==false) {
            System.out.println("Buyuk harf yok be!!");
        }
        return x;

    }

    private static boolean smallCase(String sifre) {
        boolean x = false;
        int index = 0;
        while(sifre.length()>index){
            if (sifre.charAt(index)>='a'&&sifre.charAt(index)<='z'){
                x = true;
            }


            index++;
        }
        if(x==false) {
            System.out.println("Kucuk harf yok be!!");
        }
        return x;
    }

    private static boolean isAtLeastEight(String sifre) {

        boolean x = false;

        if(sifre.length()>=8){
            x = true;
        }
        if(x==false){
            System.out.println("En az 8 karakter giriniz!!");
        }

        return x;
    }
}
