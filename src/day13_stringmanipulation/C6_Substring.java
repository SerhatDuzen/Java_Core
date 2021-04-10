package day13_stringmanipulation;

public class C6_Substring {
    public static void main(String[] args) {

        String str = "Her ders Java gibi olsa";

        System.out.println(str.substring(0,10).replaceAll("//D","*")+str.substring(10)); //10. index dahil (inclusive) sonuna kadar tum string

        System.out.println(str.substring(str.length()-10)); //son 10 harfi yazdir


        System.out.println(str.substring(0,10)); // ilk 10 karakter cunku ilki incul  ikincisi exclusive

        //11.karakterden sona kadar olan stringi yazdirma

        System.out.println(str.substring(10)); //


        System.out.println(str.substring(10,10)); // hicbir sey yazdirmaz

        //System.out.println(str.substring(8,7));//rte
        System.out.println(str.substring(22)); //lenght - 1 son karakter

        System.out.println(str.substring(23)); //lenght bos verir

        System.out.println(str.substring(24)); //lenght ten buyuk sayi hata



    }
}
