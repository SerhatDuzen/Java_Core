package day19_dowhileloop;

import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Bu örnekte bilgisayar en başta rastgele bir sayı üretecek,
        // ardından döngü içerisinde kullanıcıdan sürekli sayı istenecektir.
        // Kullanıcının girdiği sayı, bilgisayarın tuttuğu ile karşılaştırılarak
        // bilemediği sürece devam edecektir.
        // Ayrıca "Aşağı" veya "Yukarı" diye ipucu verilecektir.
        // Bir taraftan da kullanıcının 10 kez deneme hakkı olacak ve bu hak
        // her seferinde bir azaltılacak, 0 olduğunda da döngü sona erecektir.


        Random rnd = new Random();

        int r = rnd.nextInt(100);

        int kalanCan = 10;

        System.out.println("Sayi bulmaca oyunu\n1 ile 100 arasindaki sayiyi bulmak icin 10 hakkiniz var!!!");
        System.out.println("Lutfen 100 ile 0 arasinda bir sayi giriniz:");
        do {
            System.out.println("Kalan hakkiniz = "+kalanCan);
            int sayi = scan.nextInt();

            if(sayi==r){
                System.out.println("Tebrikler bildiniz!!\nKalan can: "+kalanCan );
                break;
            }else if(sayi>r){
                System.out.println("Lutfen daha kucuk bir sayi giriniz!!");
                kalanCan--;

            }else if(sayi<r){
                System.out.println("Lutfen daha buyuk bir sayi giriniz!!");
                kalanCan--;
            }
        }while(kalanCan>0);
        if(kalanCan==0){
            System.out.println("Bilemedin kardeess!!!\nHakkin da bitti");
        }
        scan.close();
    }
}
