package day13_stringmanipulation;

public class C5_ReplaceAll {
    public static void main(String[] args) {

        String str = "Java ogren, mutlu ol, Java candir 12345";

        System.out.println(str.replace("Java","hava"));

        //replaceall metodu replace() metoduna benzer. ama 2 farki vardir
        //1- replace metodu char kabul eder ama replaceall kabul etmez
        //2= replaceall metodu regexp kullanimina izin verir

        System.out.println(str.replaceAll("\\w","*")); //tum harf ve rakamlar yerine * yazacak

        System.out.println(str.replaceAll("\\W","*"));

        System.out.println(str.replaceAll("\\d",".")); //sayilari . yapar

        System.out.println(str.replaceAll("\\D","."));

        System.out.println(str.replaceAll("\\s",".")); //bosluklari . yapar

        System.out.println(str.replaceAll("\\S","&"));

        System.out.println(str.replaceAll("\\d",""));

        //replaceFirst istenen karakterin ilkini degistirir ve regex kullanimina izin verir


    }
}
