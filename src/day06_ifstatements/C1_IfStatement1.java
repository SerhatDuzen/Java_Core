package day06_ifstatements;

public class C1_IfStatement1 {
    public static void main(String[] args) {
        int a=10;
        int b=8;

        if (a>b){
            System.out.println("Ilk sayi buyuktur..");
        }

        if(a*b<0){
            System.out.println("Sayilarin carpimi negatif!");
        }
        if(a<b || b>0){
        System.out.println("Or lu cumle calisti..");
        }
        if (a-b>0 && a*b>0 ) {
            System.out.println("And cumlesi calisti!!");
        }



    }
}
