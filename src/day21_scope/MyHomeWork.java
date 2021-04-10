package day21_scope;

import java.util.Scanner;

public class MyHomeWork {


    public static void main(String[] args) {
        /*
Asagidaki String degiskenini kullanarak  konsolda A L i
yazdiriniz.
String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
*/
        String pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        pickName = pickName.substring(0, 1) + " " + pickName.substring(11, 12) + " " + pickName.substring(8,9).toLowerCase();
        System.out.println(pickName);
/*
Kullaniciya gunde kac cay ictigini ve cayi kac sekerli ictigini sorun. Daha sonra kullanicinin yilda kac kg seker kullandigini hesaplayan java kodunu yaziniz.
1 seker= 1.7 gr
Ornek: Input ⇒
Cay : 10
Seker :2
Output : 12.41 kg/yil
*/
        Scanner scan = new Scanner(System.in);
        System.out.print("YILLIK SEKER TUKETIMI HESAPLAMA PROGRAMINA HOSGELDINIZ\nLutfen gunde kac bardak ictiginizi yaziniz :");
        int gunlukCay = scan.nextInt();
        System.out.print("Cayi kac sekerli iciyorsunuz? = ");
        int sekerSayi = scan.nextInt();
        System.out.println("Gunluk ictiginiz cay sayisi = " +
                +gunlukCay + "\nYillik ictiginiz cay sayisi = " + (gunlukCay * 365) +
                "\nCayda yillik seker tuketiminiz = "
                + ((gunlukCay * 365 * sekerSayi * 1.7) / 1000) + " kg dir.. ");
        /*
Konsolda Integer degiskeninin maximum ve minimum degerlerini
yazdiran kodu yaziniz.
*/
        System.out.println("MAX Integer degeri = " + Integer.MAX_VALUE + "\nMIN Integer degeri = " + Integer.MIN_VALUE);

         /*
Kullanicidan 3 basamakli bir sayi isteyin ve bu sayinin
basamaklari toplamini konsolda yazdiran programi yaziniz.
*/
        System.out.println("3 BASAMAKLI SAYILARIN RAKAMLARININ TOPLAMINI BULMA PROGRAMINA HOSGELDINIZ"
                + "\nLutfen 3 basamakli bir sayi giriniz = ");
        if (scan.hasNextInt()) {
            int sayi = scan.nextInt();
            if ((sayi > 99 && sayi < 1000)) {
                int birlerBasamagi = sayi % 10;
                int onlarBasamagi = (sayi / 10) % 10;
                int yuzlerBasamagi = (sayi / 100) % 10;
                System.out.println("Girmis oldugunuz sayinin yuzler basamagi = "
                        + yuzlerBasamagi + "\nOnlar basamagi = "
                        + onlarBasamagi + "\nBirler basamagi = "
                        + birlerBasamagi +
                        "\nRakamlari toplami ise = "
                        + (birlerBasamagi + onlarBasamagi + yuzlerBasamagi));
            } else {
                System.out.println("Lutfen 3 basamakli bir sayi } giriniz!!");
            }
        } else {
            System.out.println("Lutfen sayi girisi yapiniz!!!!");
        }
/*
Iki degisken atayin :
num1=1,
num2=1
‘increment’ yontemini kullanarak Carpim Tablosunu yazdirin.
Note: ++ increment isareti 1 arttirir.
Asagidaki sekilde Carpim Tablosunu yazdirin:
1X1=1
"\nSayinin rakamlari toplami =

 1X2=2
1X3=3
...
1 X 10 =10
*/
        int s1 = 1;
        int s2 = 1;
        System.out.println("Carpim Tablosu..");
        for (s1 = 1; s1 <= 10; s1++) {
            System.out.println("\n");
            for (s2 = 1; s2 <= 10; s2++) {
                System.out.println(s1 + " x " + s2 + " = " + (s1 * s2));
            }
        }
    }
}



