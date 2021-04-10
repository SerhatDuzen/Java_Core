package day35_Inheritance;

public class Memur extends Personel {

    public int maas;

    public Memur() {
        //super();
        System.out.println("Child class parametresiz calisti..");
    }
    /*Inheritancede const olsuturdugumuzda javanin oto olarak const class
    koydugu super kw onemlidir..
    super kw default const gibidir . biz gormesek d calisir. ancak yerine
    baska bir keyword yazarsak etkisiz hale gelir

    ***EXTENDS varsa yerine birsey yazmadikca super const calisir

     */

    public Memur(int maas) {
        super("Mehmet",6000);
        System.out.println("Child class parametreli const calisti..");
    }

    public static void main(String[] args) {
        Memur mmr1 = new Memur(3000);

    }
}
