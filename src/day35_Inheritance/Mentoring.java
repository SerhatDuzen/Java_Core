package day35_Inheritance;

import java.time.LocalDate;
import java.util.Scanner;

public class Mentoring {
    public static void main(String[] args) {
        //yuzeKadarTopla();
        //monkeyAlive(168);
        tekrarSayisiniBul('a',"Beşiktaş’sın sen bizim canımız\n" +
                "\n" +
                "Siyahla beyaz akar kanımız\n" +
                "\n" +
                "Seviyoruz seni canı gönülden\n" +
                "\n" +
                "Beşiktaş’sın sen bizim canımız\n" +
                "\n" +
                "Laylay laylay lay laylay laylay la");
        //sayininTersiniYazdir(2345566);
    }

    private static void sayininTersiniYazdir(int i) {
        String sayi = Integer.toString(i);
        String reverse = "";
        for (int j = sayi.length()-1; j >=0 ; j--) {
            reverse+=sayi.charAt(j);
        }
        System.out.println(sayi+" sayisinin tersi = "+reverse+" dir.");
    }

    private static void tekrarSayisiniBul(char a, String s) {
        int repeat=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==a) repeat++;
        }
        System.out.println(repeat+" kez bulunmaktadir.");

    }


    private static void monkeyAlive(int i) {
        System.out.println("Maymun her gun 4 muz yemektedir!!");
        LocalDate date = LocalDate.now();
        boolean live=true;
        int kalanGun = i/4;
        LocalDate deathDate = date.plusDays(kalanGun);
        System.out.println("Bugun gunlerden : "+date+
                "\nAdadaki muzlar "+kalanGun+" gun kadar yetti."+"" +
                "\nMaymun "+deathDate+" gunu muzsuzluktan öldu!!!"+
                "\nMaymunlari muzsuz birakmayin!!!!!");

    }

    private static void yuzeKadarTopla() {
        Scanner scan = new Scanner(System.in);

        int sum =0;
        while(true){
            System.out.print("Lutfen sayi girisi yapiniz : ");
            int sayi = scan.nextInt();
            sum+=sayi;
            if(sum>=100){
                System.out.println("Yetti bu kadar sayi yazdigin!!\n" +
                        "toplam 100 u gecti!!!!");
                break;
            }

        }

        scan.close();
    }
}
