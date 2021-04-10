package day19_dowhileloop;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class C2_Flag {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz ");

        String cumle = scan.nextLine();

        int i = 0;
        Boolean flag = false;
        while (cumle.length()>i){
            if(cumle.charAt(i)>='A'&&cumle.charAt(i)<='Z'){
                flag=true;
            }
            i++;
        }

        if(flag){
            System.out.println("Buyuk harf var");
        }else {
            System.out.println("YOOOK");
        }
        scan.close();
    }
}
