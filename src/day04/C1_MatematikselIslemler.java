package day04;

public class C1_MatematikselIslemler {
    public static void main(String[] args) {
/*
        int i1 = 77;
        int i2 = 4;
        int i3 = 12;
        double d1 = i1*i2/i3; // once esitligin sag tarafi/ sonra atama assignment yapilir
        System.out.println(d1);

double d2 = 24.56;
double d3 = 14.2;
double d4 = d2/d3;
        System.out.println(d4);
        System.out.println(d2/i2); // farkli tiplerdeki islemlerde genis olana gore davranir
double d5 = (double) i1/i2-i3/10;
        System.out.println(d5);
*/
        int num1= 38 / 2 *( 4 + 3 ) * 2;

        System.out.println(num1); //266

        int num2 = 8 + 2 * ( 14 - 6 / 2 ) - 12 ;
        System.out.println(num2); // 18


        int num3=10;

        double num4 = num1 * num2 /num3; // 266 * 18 /10 = 478.8 ==>478
        // Java once esitligin sag tarafini yapar
        // bu ornekte sag tarafta tum degiskenler int oldugundan sonucu da int yapar
        // sonra assignment(atama) islemi yapilir

        System.out.println(num4);


        double num5=24.56;
        double num6=14.2;

        double num7 = num5 / num6 ;

        System.out.println(num7); // 1.7295774647887323

        System.out.println(num5 / num3); // 24.56 / 10 = 2.456

        double num8 = (double) num1 * num2 /num3; // 478.8
        System.out.println(num8); // 478.8

    }
}
