package day19_dowhileloop;

import java.util.Scanner;

public class WeeklyHomework {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

/*
          Kullanicidan email girmesini isteyin
         @ isareti icermiyorsa “gecerli bir email girin” yazdirin
         @ isaretinden sonra sadece “gmail.com” yaziyorsa “email onaylandi” yazdirin
         @ isaretinden sonra “gmail.com” disinda birsey yaziyorsa
         “Lutfen gmail hesabinizi girin” yazdirin
         ORNEK:
         INPUT : techproed.com OUTPUT : “gecerli bir email girin”
         INPUT : techproed@gmail.com OUTPUT : “email onaylandi”
         INPUT : techproed@hotmail.com OUTPUT : “Lutfen gmail hesabinizi girin”


        do {
            System.out.println("Lutfen e-mail adresinizi yaziniz");
            String email = scan.nextLine();
                if(email.contains("@")){
                    if(email.endsWith("@gmail.com")){
                    System.out.println("E-mail onaylandi.");
                    break;
                    }else  {
                        System.out.println("Lutfen gmail hesabinizi girin!");
                        }
                }else {
                    System.out.println("Lutfen gecerli bir e-mail giriniz..");
        }}while (true);



          Print "Lütfen iş unvanınızı girin”
          “jobTitle” isimli bir degisken olusturun ve kullanicidan isteyin.
          Doğru jobTitle yazdırmak için aşağıdaki test datalarini kullanın.
          Example :
          Eger jobTitle  qa ise print “İş unvanınız Quality Analyst”
          test data: qa ise print Quality Analyst
          dev ise print Developer
          ba ise print Business Analyst
          pm ise print Project Manager

String jobTitle = scan.nextLine().toLowerCase();
switch (jobTitle){
    case "qa":
        System.out.println("İş unvanınız Quality Analyst");
        break;
    case "dev":
        System.out.println("İş unvanınız Software Developer");
        break;
    case "ba":
        System.out.println("İş unvanınız Business Analyst");
        break;
    case "pm":
        System.out.println("İş unvanınız Project Manager");
        break;
    case "devops":
        System.out.println("Soruyu yazan neden devops secenegi yazmiyor");
        break;
    default:
        System.out.println("Gecerli bir deger giriniz. \nTercihen devops!!");
        break;
}


	“NestedIfStatements” class olusturun.

Kullanicidan 2 kisi icin dogum gunu girmesini isteyin.

Yılı, ayi ve günü tamsayı olarak alın e NestedIf kullanarak
kimin yas olarak daha buyuk oldugunu ekrana yazdirin.
Examples:
	int birthYearOfYusuf=2000, birthMonthOfYusuf=12, birthDayOfYusuf=12,
	int birthYearOfMehmet=2000,birthMonthOfMehmet=12, birthDayOfMehmet=21;
	Yusuf is Older




        System.out.print("Kimin daha buyuk oldugunu bulma programina hosgeldiniz\n" +
                "Lutfen ilk kisinin dogum yilini giriniz : ");


        int y1 = scan.nextInt();
        System.out.print("Lutfen ilk kisinin dogdugu ayi sayi cinsinden giriniz : ");
        int a1 = scan.nextInt();
        System.out.print("Lutfen ilk kisinin ayin kacinda dogdugunu sayi cinsinden giriniz : ");
        int g1 = scan.nextInt();
        System.out.println("Ilk kisinin ismini giriniz");
        String k1;
        k1 = scan.next();
        System.out.print("Lutfen ikinci kisinin dogum yilini giriniz : ");
        int y2 = scan.nextInt();
        System.out.print("Lutfen ikinci kisinin dogdugu ayi sayi cinsinden giriniz : ");
        int a2 = scan.nextInt();
        System.out.print("Lutfen ikinci kisinin ayin kacinda dogdugunu sayi cinsinden giriniz : ");
        int g2 = scan.nextInt();
        System.out.println("Ikinci kisinin ismini giriniz");
        String k2;
        k2 = scan.next();


        if(y1>y2){
            System.out.println(k2+" buyuktur");
        }else if(y1==y2){
            if(a1>a2){
                System.out.println(k2+" buyuktur");
            }else if(a2>a1){
                System.out.println(k1+" buyuktur");
            }else{
                if(g1>g2){
                    System.out.println(k2+" buyuktur");
                }else if(g2>g1){
                    System.out.println(k1+" buyuktur");
                }else{
                    System.out.println("Ayni gun dogmuslar!!!");
                }
            }
        }else{
            System.out.println(k1+" buyuktur");
        }



Kullanicidan 3 tane pozitif  tam sayi alalim
bu uc sayidan ucgen olup olmama durumunu kontrol edelim
eger ucgen olabiliyor ise, es kenar ucgen mi kontrol edelim.

* Ucgen olma kosullari.
b+c>a>b-c  1
a+c>b>a-c  1
a+b>c>a-b 1

* Eskenar ucgen olma kosullari.
a=b=c

Konsolda asagidaki durumlari yazdiralim.
Eskenar ucgen
Sadece ucgen
Ucgen degildir


        System.out.println("Ucgen tespit programi");
        System.out.print("Lutfen ucgenin birinci kenarini giriniz : ");
        double k1 = scan.nextDouble();
        System.out.print("Lutfen ucgenin ikinci kenarini giriniz : ");
        double k2 = scan.nextDouble();
        System.out.print("Lutfen ucgenin ucuncu kenarini giriniz : ");
        double k3 = scan.nextDouble();
        if(((k2+k3>k1)&&((Math.abs(k2-k3))<k1))&&
                ((k1+k3>k2)&&((Math.abs(k1-k3))<k2))&&
                ((k2+k1>k3)&&((Math.abs(k2-k1))<k3))){
            System.out.println("Girdiginiz degerlerde ucgen olusturulabilir");
            System.out.println(k1==k2?k2==k3?"Eskenar ucgen":"Ikizkenar ucgen":k1==k3?
                    "Ikizkenar ucgen":"Cesitkenar ucgen");
        }else {
            System.out.println("Girdiginiz degerlere gore bir ucgen olusturulamaz!!");
        }

Kullanıcını 1 ile 7 arasında bir sayı girdiğinde haftanın hangi günü olduğunu yazdıran switch case java kodunu yazinız.
		 */

        System.out.print("Haftanin kacinci gununde oldugunuzu rakam ile giriniz : ");
byte b = scan.nextByte();
switch (b) {
    case 1:
        System.out.println("Pazartesi");
        break;
    case 2:
        System.out.println("Sali");
        break;
    case 3:
        System.out.println("Carsamba");
        break;
    case 4:
        System.out.println("Persembe");
        break;
    case 5:
        System.out.println("Cuma");
        break;
    case 6:
        System.out.println("Cumartesi");
        break;
    case 7:
        System.out.println("Pazar");
        break;
    default:
        System.out.println("Lutfen gecerli bir deger giriniz!!");
        break;
}



}

    }



