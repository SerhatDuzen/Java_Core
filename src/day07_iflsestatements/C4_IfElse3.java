package day07_iflsestatements;

import java.util.Scanner;

public class C4_IfElse3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(" Emeklilik tespit yazilimi\n Yasiniz nedir = ");
int y = scan.nextInt();
        if (y > 65) {
            System.out.println("Emekli olabilirsiniz!\nTebrikler..");
        }
        else{
            System.out.println("Henuz emekli olamazsiniz\nEmekli olmak icin "+(65-y)+" yil daha calismaniz gerekmektedir.");
        }

    }
}
