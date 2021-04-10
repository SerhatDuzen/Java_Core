package day20_scope;

public class Scope2 {
//farkli class lardan da Scope1 classina object olsuturarak ulasabilirm


    public static void main(String[] args) {
        Scope1 obj4 = new Scope1();
        System.out.println(obj4.isim);
        obj4.isim = "Ahmet" ;
        obj4.soyisim = "Can";
        System.out.println(obj4.isim+ " "+ obj4.soyisim);

    }
}
