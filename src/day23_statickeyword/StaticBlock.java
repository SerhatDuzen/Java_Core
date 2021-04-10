package day23_statickeyword;

public class StaticBlock {

    static String isim;
//static block class calistirildiginda ilk olarak calisir. Main method dan once calisir.
    //static blocklar static variablelara deger atamak icinkullanilir
    static {
        isim="Mehmet";
        System.out.println(isim);
    }
    static {
        System.out.println("Ikinci statc blok calisti!!");
    }

    public static void main(String[] args) {
        isim="Alican";
        System.out.println(isim);
    }


}
