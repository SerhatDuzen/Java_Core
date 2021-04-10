package day33_Encapsulation;

public class Encapsulation03 {

    public static void main(String[] args) {
        //enc 02 classindaki class membera ulasmaua calisalim
        Encapsulation02 obj1 = new Encapsulation02();
        //erisim yetkisi ikiye ayrilir. 1 okuyabilme 2 degistirip kullanabilme
        System.out.println(obj1.sayi);
        obj1.sayi=25;
        System.out.println(obj1.sayi);
        System.out.println(obj1.getOkulIsmi()); //sadece okunabiliyor
        obj1.setHesapNo(14000000); //sadece atama yapilabiliyor




    }

}
