package day02_scanner;

import java.util.Scanner;

public class C2_Scanner2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Alanini bulmak istediginiz dairenin yaricapini yaziniz = ");
        Double r =scan.nextDouble();
        System.out.println("Dairenin Alani = "+(3.14*r*r)+" cm2dir.");

        scan.close();
    }
}
