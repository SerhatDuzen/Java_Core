package day29_passbyvalueimmutable;

public class C5_Immutable02 {
    public static void main(String[] args) {
        //degisikligi kalici yapmak icin aama yaparsak
        //immutable classlar nasil davranir
        String isim = "Ali";
        isim = isim + "";
        System.out.println(isim.equals("Ali")); //true
        System.out.println(isim == "Ali"); //false hem degere hem de referansa bakar

        String str1 = new String("Mehmet");
        String str2 = new String("Mehmet");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        String str3 = "Mehmet";
        String str4 = "Mehmet";
        System.out.println(str3==str4);
        System.out.println(str3.equals(str4));
        System.out.println("----------");
        System.out.println(str3==str1);
        System.out.println(str3.equals(str1));

        //new ile object olsturuldugunda java once objeyi olusturur
        //16. satrdaki gibi olsturuldugunda ise (newle cre edilenler haric)
        //string poola bakar. bulursa ref i de ayni yere kor



    }
}
