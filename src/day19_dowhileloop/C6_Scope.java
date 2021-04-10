package day19_dowhileloop;

public class C6_Scope {

    public static void main(String[] args) {

        // bir class in icersinde olusturulan variable nin nerede gecerli oldugu ve nerden
        //kullanilabildigini o variablenin scope i belirler
        int sayi=1;

        denemeMethod();
        sayi++;
        System.out.println(sayi);

    }

    public static void denemeMethod() {

String isim= "Mehmet";



    }
}
