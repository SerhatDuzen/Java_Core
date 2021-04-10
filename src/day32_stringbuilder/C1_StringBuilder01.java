package day32_stringbuilder;

public class C1_StringBuilder01 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Rumeysa");
        sb1.append(" ").append("cetinturk");
        System.out.println(sb1);
        sb1.append("Javayi cok sever", 6, 9);
        System.out.println(sb1); // rumeysa cetinturk co

        System.out.println(sb1.length()); //21

        System.out.println(sb1.capacity()); //23 (7+16)

        System.out.println(sb1.charAt(1)); //u // bize bilgi getiren metotlar sbyi degistirmez

        sb1.delete(17, 21); //baslangic inclusive bitis exclusive
        System.out.println(sb1);
        sb1.deleteCharAt(16);
        System.out.println(sb1);

        String isim = "Rumeysa cetintur";
        System.out.println(sb1.equals(isim)); // data turleri farkli old icin
        //karsilastimasi mumkun deildir

        StringBuilder sb2 = new StringBuilder("Rumeysa cetintur");

        System.out.println(sb1 == sb2); // false // new keyword kullanildi
        System.out.println(sb1.equals(sb2)); //false // SB da equals methodu
        //stringden farkli calisir.. ancak kendiyle karsilastiginda true verir

        System.out.println(sb1.equals(sb1)); //true

        System.out.println(sb1.indexOf("cetin")); //8

        System.out.println(sb1.indexOf("e", 6)); //9

        System.out.println(sb1.indexOf("Kazim")); // -1 verir yoksa

        System.out.println(sb1.insert(7, " taka "));

        String cumle = "Hello world";
        sb1.insert(0, cumle, 0, 6); //alincak stringin baslangic ve bitis indexi
        System.out.println(sb1);

        System.out.println(sb1.lastIndexOf("t"));// en son nerede

        sb1.replace(8, 15, "Seher");
        System.out.println(sb1); // indexler arasina istenen string

        sb1.reverse(); //
        System.out.println(sb1);

        sb1.reverse();

        sb1.setCharAt(10, 'k');

        System.out.println(sb1.subSequence(8, 13));

        System.out.println(sb1.substring(8, 13));

        System.out.println(sb1.substring(8)); //balangictan sona kadar

        sb1.subSequence(8, 13);
        System.out.println(sb1);

        StringBuilder sb3 = new StringBuilder("Java cok guzel");

        StringBuilder sb4 = new StringBuilder("Java cok guzel");

        System.out.println(sb3.equals(sb4)); //false

        //iceriklerinin esit olup olmadigina bakmak icin stringdeki equals
        //methodunu kullanmali

        System.out.println(sb3.toString().equals(sb4.toString())); //true
        System.out.println(sb1.length()); //26
        System.out.println(sb1.capacity()); //48
        sb1.trimToSize(); //SB icin hazirlanan capacitydeki fazlaliklari siler
        //lenght ile cap esit duruma getirir
        System.out.println(sb1.length()); //26
        System.out.println(sb1.capacity()); //26

        System.out.println(sb3.compareTo(sb4));

        StringBuilder sb5 = new StringBuilder("Ali okula gel");
        StringBuilder sb6 = new StringBuilder("Abi okula gel");
        System.out.println(sb5.compareTo(sb6)); // indexlerin char olarak ascii farki
    }
}
