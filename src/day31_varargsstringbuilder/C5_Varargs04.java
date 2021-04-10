package day31_varargsstringbuilder;

import java.util.ArrayList;
import java.util.List;

public class C5_Varargs04 {
    public static void main(String[] args) {

List<Integer> list = new ArrayList<>();
list.add(10);
list.add(20);
///toplama(list); varargs esnek oldugu icin list e benzese de list
        //abul etmez ve lsit degildir
        int arr[] = {15,20,25};
        toplama(arr); //array olarak calisir ve argument olarak
        //array yollanabilir

        //kullanicidan deger alarak varags calistirmak istiyorsak
        //girilen degerleri bi arraye kaydetmeliyiz
// bunu icin kullanicidan aldiginiz degerleri bir liste koyariz
        //sonra listi araye ceviririz



    }
    public static void toplama(int... var) { // data turunden sonra yazdigimiz ... varags kullanacagimiz anlamina geliyor
        //System.out.println("varargs'a dahil olmayan argument: "+ sayi1);

        int toplam=0;
        for (int each : var) {
            toplam+=each;
        }

    }}
