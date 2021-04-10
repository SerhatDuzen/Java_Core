package day05_WrapperClass;

import java.util.Scanner;

public class C1_ModulusSon {
    public static void main(String[] args) {

        //Scanner scan = new Scanner(System.in);
        //System.out.println("Bir sayi giriniz = ");
        //int s = scan.nextInt();
        int sayi = 1469;
        int r1 = sayi%10;
        System.out.println("verilen sayiyinin birler basamagi = "+sayi%10); // verilen sayiyinin birler basamagi

        System.out.println("Birler basamagi haric sayi = " + sayi/10);
// bir islemde = isareti varsa kalici olarak degisir. = isareti yoksa sadece o anlik matematiksael islem yapar
        System.out.println(sayi/=10);

    }
}
