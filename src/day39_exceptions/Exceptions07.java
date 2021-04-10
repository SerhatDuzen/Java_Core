package day39_exceptions;

public class Exceptions07 {

    public static void main(String[] args) {
//data turlerini casting yaparken uygun olmayan islem yaparsa Java ClassCastException verir

        //eger tamamen sayilardan olsymayan bir stringi int a cevirmeye calisirsaniz Java
        //NumberFormatException verir

        int sayi=0;
        String str= "123456";
        System.out.println(str+10);
        int strSayi =Integer.parseInt(str);
        System.out.println(strSayi+10);

        String str2= "123a45";
        System.out.println(Integer.parseInt(str2)); // NumberFormatException

        Object sayi2=40;
        String sayiStr = (String)sayi2; //narrowingCasting
        //ClssCastException verir // int olan bisey stringe cevrilmek isenirse



    }
}
