package day18_whileloop;

import java.util.Scanner;

public class C5_WhileLoop4 {
    public static void main(String[] args) {
//Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari
// ve toplam kac tane  olduklarini ekranda yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen ozitif bir sayi giriniz ; ");

        int sayi = scan.nextInt();
        int bolen= 1;
        int count=0;

        while(bolen<=sayi){

            if(sayi%bolen==0){
                System.out.println(count+" - "+bolen+" ");
                count++;
            }
            bolen++;

        }
        System.out.println(count);
        scan.close();
    }
}
