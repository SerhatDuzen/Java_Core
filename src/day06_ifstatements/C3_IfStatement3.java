package day06_ifstatements;

import java.util.Locale;
import java.util.Scanner;

public class C3_IfStatement3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Hangi gunu girmek isterseniz o gunlerin bas harfini yaziniz = ");
        char c = scan.next().toLowerCase().charAt(0);
        if(c== 'p'){
            System.out.println("Pazar ve Pazartesi");
        }
        else if(c=='s'){
            System.out.println("Sali");
        }
        else if(c=='c'){
            System.out.println("Carsamba, cumartesi ve cuma");
        }
        else {
            System.out.println("Lutfen gecerli bir harf giriniz!!");
        }
        scan.close();
    }
}
