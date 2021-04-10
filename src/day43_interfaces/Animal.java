package day43_interfaces;

import day20_scope.Scope1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Animal implements Interface02  {

    String myStr = "9009";
public void abc(){

}
    public void dostuff(String str) {
        int myNum = 0;
        try {
            String myStr = str;
            myNum = Integer.parseInt(myStr);
        } catch (NumberFormatException e) {
            System.out.println("myStr : " + myStr + " , myNum: " + myNum);
        }
        System.out.println("myStr : " + myStr + " , myNum: " + myNum);
    }
    final static int S = 13;
    public static void main(String[] args) {


        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal a3 = null;
        System.out.println(a1==a3);
    }


}

