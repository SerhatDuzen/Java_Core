package day21_scope;

public class Scope1 {

//static variable lar class level da olusturuldugu icin class in her yerinden kullanilabilir
    //instance variable lar static olmayan methodlarda direk kullanilabiliyorken static
    //methodlarda object olusturularak kullanilabilir

    // static variable lar ise ister static isters no static methodlarda direk kullanilabilir


    static int okulId = 1201;
    static String okulAdi = "Yildiz Koleji";
    static boolean acikMi;


    public static void main(String[] args) {

        System.out.println(okulId + " " + okulAdi + " " + acikMi); // 1201 Yildiz Koleji false
        okulId = 1202;
        acikMi = true;
        staticMethod(); //1202 Yildiz Koleji true
        System.out.println(okulId + " " + okulAdi + " " + acikMi); // 1203 Yildiz Koleji true


    }

    public static void staticMethod() {
        System.out.println(okulId + " " + okulAdi + " " + acikMi);
        okulId = 1203;
    }


    public void method() {
        okulId = 1205;

    }

}
