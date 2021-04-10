package day21_scope;

public class Scope4 {

    public static void main(String[] args) {
// bir method icinde olusturulan variable sadece o method icerisinde kullanilabilir
        int sayi = 10;
        //System.out.println(isim);
        int sayi2; // bir local var deger atanmadan da olusturulabilir

        //System.out.println(sayi2);// ancak ilk deger atamasi yapilmayan var lar kullanilamaz
        //sayi2++; ilk dege atanmadigi icin deger arttirma ya da azaltma da yapilamaz
        // java deger atamasi olmadan Local variable olusturulmasina izin verir. ilerde deger
        //atanacak diye bekler
        sayi2=15; // olusturma 9. satirda deger atamasi da 15. satirda yapilabilir
        //birden fazla methodun oldugu classlarda her methodda kullanmamiz gereken ortak
        //variable varsa class level de olusturmaliyim
        // ortak var classin yapisina bagli olarak instance veya static olabilir


    }

    public static void statikMethod() {
        String isim = "Hasan";
        //System.out.println(sayi); //Bu kurala main method icersindeki var lar da dahildir
    }

    public void method() {
        boolean isTrue = true;

        //System.out.println(sayi); bu kural statc olmayan tum methodlar icin gecerlidir

    }
}
