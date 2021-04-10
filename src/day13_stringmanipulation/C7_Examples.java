package day13_stringmanipulation;

import java.util.Scanner;

public class C7_Examples {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        /*
        System.out.println("Lutfen 4 harfli bir kelime yaziniz = ");
        String w= scan.nextLine();
        if(w.length()==4){
            System.out.println(""+w.charAt(3)+w.charAt(2)+w.charAt(1)+w.charAt(0));
        }else {
            System.out.println("Lutfen 4 karakterli bir kelime giriniz!!");
        }
*/
        String str1 = "$13.99";
        String str2 = "$10.55";
        str1 = str1.replace("$","");
        str2 = str2.replace("$","");
        //eger iceriginin tamaminin sayi old biliyorsak parsedouble ve parseint ile ceviri
        double d1 = Double.parseDouble(str1);
double d2 = Double.parseDouble(str2);
        System.out.println(d1+d2);
    }
}
