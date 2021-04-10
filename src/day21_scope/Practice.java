package day21_scope;


import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Lutfen 1 den buyuk bir sayi giriniz : ");
        int a = sc.nextInt();
        int count = 0;
        //String as = a+"";
        if (a >= 2) {
            for (int i = 2; i < a; i++) {
                if(asalSayiMi(i)){
                    count++;
                }
            }
        } else {
            System.out.println("Sana duzgun sayi gir dedim!!!");
        }
        System.out.println(a+" sayisina kadar "+count+" adet asal sayi bulunmaktadir.");

        sc.close();

    }

    private static boolean asalSayiMi(int i) {
        int sum = 0;
        for (int j = 2; j <i ; j++) {
            if (i%j==0){
                sum+=i;
            }
        }
        if (sum==0){
            //System.out.println(i+" sayisi asal sayidir.");
            return true;
        }else if(i==2){
            //System.out.println("2 sayisi asal sayidir");
            return true;
        }else {
            //System.out.println(i+ " sayisi asal sayi degildir");
            return false;
        }

    }

}