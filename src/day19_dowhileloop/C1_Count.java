package day19_dowhileloop;

import java.util.Scanner;

public class C1_Count {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir cume giriniz:");

        String cumle = scan.nextLine();
        System.out.println("Lutfen sorgulamak istediginiz harfi giriniz ");
        String harf = scan.next().substring(0,1);

        int count = 0;
        int a=0;
        while (cumle.length()>a ){
            if((cumle.substring(a,a+1)).equals(harf)){
                count++;
            }
            a++;
        }
        System.out.println(count);
        scan.close();
    }

}
