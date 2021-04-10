package day37_overriding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ödev {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        /*
		// Stringi ters çevirmek için bir Java Programı yazın
//1.Yol: StringBuilder () kullanarak
//2.Yol: String Classini kullanarak
//3.Yol: Bir method oluşturun, ardından methodu main method dan çağırın
*/
        /*
        System.out.println("Lutfen bir kelime ya da cumle giriniz !!");
        strTersCevirBirinciMethod(scan.nextLine());
        strTersCevirIkinciMethod(scan.nextLine());
        strTersCevirUcuncuMethod(scan.nextLine());
        */
        /* Kullanicidan sayilar girmesini isteyin
         * ve girdigi sayilari toplayip yazdirin.
         * yeni sayi isteyin
         * girilen sayilarin toplami 100 'u gecerse
         * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
         *
         */
        //sayiYazmacaProgrami();


        /*
         * SORU 3) Kullanicidan 100 den kucuk bir tamsayi isteyip, bu sayinin daha
         * onceden tanimlanmis array’de olup olmadigini kullaniciya donen bir method
         * yaziniz
         *
         * Array={3,5,21,32,34,45,56,57,76,87,95}
         *
         * Input : 5  Output: Girdiginiz sayi Arrayde var
         * Input : 15 Output: Girdiginiz sayi Arrayde yok
         */
        int myArr[]={3,5,21,32,34,45,56,57,76,87,95};
        System.out.println("Arrayde sorgulamak istediginiz sayiyi giriniz : ");
        arrKontrol(scan.nextInt());



    }

    private static void arrKontrol(int nextInt) {
        int myArr[]={3,5,21,32,34,45,56,57,76,87,95};
        boolean flag = false;
        for (int w:myArr
             ) {
            if(w==nextInt) {
                flag=true;
                break;
            }
        }
        System.out.println(flag==true?"Girmis oldugunuz deger arrayde mevcut.":"Girmis oldugunuz deger arrayde mevcut degil!");

    }

    private static void sayiYazmacaProgrami() {
        int count=0;
        int sum = 0;
        while(sum<100){
            count++;
            System.out.print("Lutfen bir sayi giriniz : ");
            sum += scan.nextInt();

        }
        System.out.println(String.format("Girmis oldugun %s tane sayinin toplami %s'dir.\nOyunumuzu begedi iseniz yorum yazmayi unutmayin",count,sum));
    }

    private static void strTersCevirUcuncuMethod(String nextLine) {
        System.out.println("***Zaten ilk ikisini methodla yaptim***\n***Farkli bir cozum deneyecegim***");
        String arr[] = nextLine.split("" );
        String str = "";
        for (int i = arr.length-1; i >=0 ; i--) {
            str = str.concat(arr[i]);
        }
        System.out.println("Kelimenin terten yazilisi : "+str);
    }

    private static void strTersCevirIkinciMethod(String nextLine) {
        System.out.println(" ****String Methodu ile cozum**** ");
        String str = "";
        for (int i = nextLine.length()-1; i >=0 ; i--) {
           str=str+(nextLine.charAt(i));
        }
        System.out.println("Kelimenin terten yazilisi : "+str);
    }

    private static void strTersCevirBirinciMethod(String nextLine) {
        StringBuilder sb = new StringBuilder();
        for (int i = nextLine.length()-1; i >=0 ; i--) {
            sb.append(nextLine.charAt(i));
        }
        System.out.println(" ****StringBuilder ile cozum**** ");
        System.out.println("Kelimenin terten yazilisi : "+sb);
    }

}
