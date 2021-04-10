package day05_WrapperClass;

public class C3_Concatenation {
    public static void main(String[] args) {
// Concatenation - Birlestirme - Javada birden fazla stringi + isareti ile toplayarak
        String str1 = "Java";
        String str2 = "Guzeldir";
        System.out.println(str1+str2);
int sayi1 = 5;
int sayi2 = 4;
        System.out.println(sayi1+sayi2);
        System.out.println(sayi1+sayi2+str1+str2);
        System.out.println(str1+str2+sayi1+sayi2);

        System.out.println(str1+str2+(sayi1-sayi2));

        System.out.println(sayi1+sayi2+" "+str1+str2);// eger ki '' char alsaydik = > ascii degerini alacakti ve 41javaguz

        System.out.println(sayi1+sayi2+str1+' '+str2);
        System.out.println(str1+str2+sayi1*sayi2);
        System.out.println();




    }
}
