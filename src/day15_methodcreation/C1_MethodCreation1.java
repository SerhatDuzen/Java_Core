package day15_methodcreation;

import java.util.Scanner;

public class C1_MethodCreation1 {
    public static void main(String[] args) {
//Soru 1 ) Kullanicidan bir sayi alin. Bu sayi sifirdan buyukse,
// sayinin basamak sayisini, tek mi cift mi oldugunu ve 100’den
// buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
// 100’den kucukse sadece 1’ler basamagini yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz : ");
        int sayi = scan.nextInt();

        islem(sayi);
        scan.close();
    }

    public static void islem(int sayi) {
        pozitifNegatif(sayi);
        tekmiCiftmi(sayi);
        yuzdenBuyukmu(sayi);
    }

    public static void yuzdenBuyukmu(int sayi) {
        if(sayi>100){
            int birler = sayi%10, onlar= (sayi/10)%10 , yuzler=(sayi/100)%10;
            System.out.println("Sayi 100den buyuk\nRakamlari toplami"+
                    (birler+onlar+yuzler));
        }
        else{
            System.out.println(sayi%10);
        }
    }

    public static void tekmiCiftmi(int sayi) {
        System.out.println(sayi%2==0?"Cift sayi":"Tek sayi");
    }

    public static void pozitifNegatif(int sayi){
        System.out.println(sayi>=0?sayi==0?"Sayi sifir":"sayi pozitif":"sayi negatif");
}


}
