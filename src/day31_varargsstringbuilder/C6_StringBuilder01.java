package day31_varargsstringbuilder;

public class C6_StringBuilder01 {
    public static void main(String[] args) {

StringBuilder sb1 = new StringBuilder(); //Bos bir SB olusturur
        System.out.println("sb1 : "+sb1);
        StringBuilder sb2 = new StringBuilder("Mehmet");//icinde mehmet de
        //geri olab SB uretir
        System.out.println("sb2 : "+sb2);
        StringBuilder sb3 = new StringBuilder(10);
        // kapasitesi 10 olan bos bir SB uretir

        sb1.append(" Hoca");
        System.out.println("sb1 append : "+sb1);

        sb2.append(" Hoca");
        System.out.println("sb2 append : "+sb2);

        sb3.append(" Hoca");
        System.out.println("sb3 append : "+sb3);

        System.out.println("sb1 uzunluk "+sb1.length()); //5
        System.out.println("sb1 kapasite "+sb1.capacity()); //16 default deger

        System.out.println("sb2 uzunluk "+sb2.length()); //11
        System.out.println("sb2 kapasite "+sb2.capacity());//22 biz 6 olsuturduk, 16 da def deger

        System.out.println("sb3 uzunluk "+sb3.length());//5
        System.out.println("sb3 kapasite "+sb3.capacity());//10 basta 10 cap verdigimiz icin dolana kadar 10 da tutar

        //capacity hafiza yonetimi icin cok onemlidir
        // kod yazilirken sabit uzunluk veya max uzunluk belli ise
        //3. metot ile olusturarak HAFIZA KULLANIMINI optimize edebiliriz
        
    }
}
