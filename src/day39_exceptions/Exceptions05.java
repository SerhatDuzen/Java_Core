package day39_exceptions;

public class Exceptions05 {

    public static void main(String[] args) {

        //null ile uygun olmayan islem javanullpointerexception verir
        //unchecked exception dur

        String str1 = " ";
        String str2="";
        String str3=null; //null bir deger deildir/ sadece str3 un hicbirseye esit olmadigini
        //soyleyen bir isaretcidir

        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println(str3.length()); //.NullPointerException


    }
}
