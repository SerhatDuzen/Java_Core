package day21_scope;

public class Scope2 {


    public static void main(String[] args) {
        //static variable lar icin object olusturma ihtiyaci yoktur
        //Baska bir class dan static var lara ulasmak istedigimizde
        //ulasmak istedigimiz class in adi .static variable adi yazmamiz yeterlidir
        System.out.println(Scope1.okulAdi); // Yildiz Koleji
        System.out.println(Scope1.okulId); //java run time programdir //1201
        //scope2 class i calistirdiginda scope1 calismaz
        //dolayisiyla en basta olusturulan veya atanandegerler gecerli olur
        Scope1.okulAdi= "Mehmet koleji";
        System.out.println(Scope1.okulAdi); //Mehmet Koleji

Scope1.staticMethod(); //1201 Mehmet Koleji false
        System.out.println(Scope1.okulId); // 1203
        System.out.println(Scope1.okulAdi); // Mehmet Koleji
    }
}
