package day31_varargsstringbuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class java5odev {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

/*
//Q
		Kullanıcıdan bir isim ve karakter girmesini isteyin,
		sonra karakterin kaç kez tekrarlandığını kontrol edin.
		e.g:
		char ch1= 'a' ;
		String name =“John came late"
=> Tekrar Sayisi = 2
		//ANSWER
        System.out.print("Lutfen bir cumle giriniz : ");
String sentence = scan.nextLine();
        System.out.print("Lutfen bu cumle icerisinde kac kez gectigini ogrenmek istediginiz karakteri giriniz : ");
char c = scan.next().charAt(0);
String sayac = "";
int tekrar=0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i)==c) {
                tekrar++;
            }

        }
        System.out.println("Tekrar sayisi = "+tekrar);

//Q
1-20 arasindaki -20 dahil olmak üzere-  çift sayıları yazdırın. e.g.2 4 6 .. 20


1-20 arasindaki -20 dahil olmak üzere-  tek sayıları yazdırın. e.g 1,3,5,7,...,19 Virgul dahil!


20 ile 1 arasindaki 5 e bolunebilen sayillari 20 den geriye gelerek yazdirin. e.g.20,15,10,5

1 - 20 arasındaki tüm çift sayıların toplamını bulun.

11 veya 15 hariç 1-20 arasındaki tüm sayıları yazdırın; break or continue kullanin.
//ANSWER
        System.out.print("1 ile 20 arasindaki cift sayilar : ");
        for (int i = 2; i <= 20; i+=2) System.out.print(i+" ");

        System.out.print("\n1 ile 20 arasindaki tek sayilar : ");
        for (int i = 1; i <20 ; i+=2) System.out.print(i+", ");

        System.out.print("\n20 ile 1 arasindaki 5 ile bolunebilen sayilar : ");
        for (int i = 20; i >0 ; i--) {
            if(i%5==0) System.out.print(i+", ");
        }
        System.out.print("\n1 ile 20 arasindaki tum cift sayilarin toplami : ");
        int sum=0;
        for (int i = 0; i <20 ; i++) {
            if(i%2==0) sum++;
        }
        System.out.print(sum);
        System.out.print("\n1 ile 20 arasindaki 11 veya 15 haric sayilar : ");
        for (int i = 1; i <20 ; i++) {
            if(i==11 || i==15){
                continue;
            }else {
                System.out.print(i+" ");
            }

        }
        //Question
Verilen String array icerisindeki tekrar eden karakterleri
 yazdiran Java kodunu yaziniz.
String str=“ilovejavatoo”
Output: o v a

        //ANSWER


        String str="ilovejavatoo" ;
        String arr[] = str.split("");
        Arrays.sort(arr);
List<String> list = new ArrayList<>();
        //System.out.println(Arrays.toString(arr));
        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i].equals(arr[i+1])){
                list.add(arr[i]);
            }
        }
        for (int i = 0; i < list.size()-1 ; i++) {
            if(list.get(i).equals(list.get(i+1))) list.remove(i+1);
        }
        System.out.println(list); ////zor yaptim


//question
Get numbers from the user and output that number consecutive
fibonacci number sequence
     	e.g : User enters 10
output : 0 1 1  2  3  5 8 13 21 34

//Answer
        System.out.print("Kac sayisina kadar fibonacciyi goruntulemek istiyorsun :");
        int sayi = scan.nextInt();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        while (list.get(list.size()-2)+list.get(list.size()-1)<sayi){
            list.add(list.get(list.size()-2)+list.get(list.size()-1));
        }
        System.out.print("Fibonacci Degerleri : ");
        System.out.println(list);


String name = "Emine";
         charAt yöntemini kullanarak konsolda tüm harfleri yazdırın.
         */
        String name = "Emine";
        for (int i = 0; i <name.length() ; i++) {
            System.out.print(name.charAt(i)+" ");
        }

        scan.close();
    }
}
