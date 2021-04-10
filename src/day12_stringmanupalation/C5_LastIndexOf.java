package day12_stringmanupalation;

import java.util.Scanner;

public class C5_LastIndexOf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
/*
        String cumle = scan.nextLine().toLowerCase();

        int d1 = cumle.indexOf("java"); // -1 ya da ilk java indexi
        int d2 = cumle.lastIndexOf("java"); // -1 ya da son java indexi
        if(d1==d2&&d1!=-1){
            System.out.println("Cumle bir adet java iceriyor");
        }
        else if(d2>d1){
            System.out.println("Biden fazla java iceriyor");
        }
        else{
            System.out.println("Hic java yok");
        }

        if (ilkJava==-1) {

            System.out.println("cumle java icermiyor");

        } else if(ilkJava==sonJava){
            System.out.println("cumle 1 java kelimesi iceriyor");
        } else {
            System.out.println("cumle 1'den fazla java iceriyor");
        }


//Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup
//olmadigini yazdirin
        System.out.printf("Lutfen bir cumle giriniz : ");
        String cumle = scan.nextLine();
        System.out.printf("Lutfen cumle icerisinde sorgulamak istediginiz harfi yaziniz");
        char c = scan.next().toLowerCase().charAt(0);
        int i = cumle.indexOf(c);
        if (i>=1){
            System.out.println("Aradiginiz harf cumlede mevcuttur.");
        }else {
            System.out.println("Aradiginiz harf cumlede bulunmamaktadir!!");
        }
Soru 1) String methodlarini kullanarak “ Java ogrenmek123 Cok guzel@ ” i “Java
ogrenmek cok guzel.” sekline getirin.
Soru 2) String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
String str1 = “$13.99”
String str2 = “$10.55”
ipucu : Double.parseDouble() methodunu kullanabilirsiniz.
Soru 3) Kullanicidan isim isteyin. Eger
- isim “a” harfi iceriyorsa “Girdiginiz isim a harfi iceriyor”
- isim “Z” harfi iceriyorsa “Girdiginiz isim Z harfi iceriyor”
- ikisi de yoksa “Girdiginiz isim a veya Z harfi icermiyor” yazdirin
Soru 4) Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin.

Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
- Ilk harf buyuk harf olmali
- Son harf kucuk harf olmali
- Sifre bosluk icermemeli
- Sifre uzunlugu en az 8 karakter olmali

Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
isim-soyisim : M***** B******* kart no : **** **** **** 1234
*/
        System.out.println("Lutfen isminizi giriniz = ");
        String isim = scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz = ");
        String soyisim = scan.nextLine();
        System.out.println("Lutfen 16 haneli kredi karti numaranizi giriniz = ");
        String numara = scan.nextLine();
        System.out.println("Isim-Soyisim : "+isim.toUpperCase().charAt(0)+isim.substring(1).replaceAll("\\w","*"
        )+" "+soyisim.toUpperCase().charAt(0)+soyisim.substring(1).replaceAll("\\w","*"
        ));
        System.out.println("Kart no : **** **** **** "+numara.substring(numara.length()-4));


        /*
        System.out.printf("Lutfen sifrenizi giriniz");
String pw = scan.nextLine();
if(!Character.isLowerCase(pw.charAt(0))&&Character.isLowerCase(pw.charAt(pw.length()-1))&&!pw.contains(" ")
        &&pw.length()>=8){
            System.out.printf("Sifre basari ile tanimlandi..");
        }else{
            System.out.printf("islem basarisiz. try again");
        }




        System.out.printf("Lutfen 4 harfli bir kelime yaziniz = ");
        String word = scan.nextLine();
if(word.length()==4){
    System.out.println("Girdiginiz kelimenin tersten yazilisi = "+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0));
}
else {
    System.out.println("4 harfli bir kelime girmedin haci" +
            "!!");
}


        System.out.println("Lutfen isminizi ve soy isminizi giriniz : ");
        System.out.printf("Isminiz : ");
        String isim = scan.nextLine();
        System.out.printf("Soyisminiz : ");
        String soyisim = scan.nextLine();
        if(isim.length()>soyisim.length()){
            System.out.printf("isminizin uzunlugu soyisminizden fazladir");
        }
        else if(isim.length()<soyisim.length()){
            System.out.printf("soyisminizin uzunlugu isminizden fazladir");
        }
        else {
            System.out.printf("isminiz ve soyisminizin uzunluklari esittir");
        }


        System.out.printf("Lutfen isminizi giriniz :");
        String isim= scan.nextLine().toLowerCase();
        if (isim.contains("a")){
            System.out.println("Girdiginiz isim a harfi iceriyor");
        }else if(isim.contains("z")){
            System.out.println("Girdiginiz isim z harfi iceriyor");
        }else {
            System.out.println("Girdiginiz isim a veya z harfi icermiyor");
        }


        String str1 = "$13.99";
        String str2 = "$10.55";
        str1 = str1.replace("$","");
        str2 = str2.replace("$","");
        Double snc = Double.parseDouble(str1)+ Double.parseDouble(str2);
        System.out.println(snc);
        String cumle = " Java ogrenmek123 Cok guzel@    ";
        cumle = cumle.trim();
        cumle = cumle.replace("123","");
        cumle = cumle.replace("@","");
        cumle = cumle.replace("C","c");
        System.out.println(cumle);

        if(cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());
        }else if(cumle.contains("kucuk")){
            System.out.println(cumle);
        }else {
            System.out.println("Cumle buyuk ya da kucuk kelimesini icermiyor!!");
        }
*/




        scan.close();
    }
}
