package day31_varargsstringbuilder;

public class C4_Varargs03 {
    public static void main(String[] args) {
        /*
        toplama(2,5);
        toplama(5,10,15);
        toplama(4,5,99,6,14,56);
        toplama(1,2,3,4,5,6,7,8,9);
// Verilen integerler'den ilki hariç tüm sayiları toplayin
// Bulduğunuz toplam ile ilk sayiyi çarpıp sonucu yazdırın
*/

        //ilkiHaricTopla(1,2,3,4,5,6,7,8);
toplamIleIlkSayiyiCarp(1,2,3,4,5,6,7,8,9);
    }

    private static void toplamIleIlkSayiyiCarp(int i, int ... arg) {
        int sum=0;
        for (int k:arg
             ) {
            sum+=k;
        }
        sum+=i;
        System.out.println(sum*i);
    }

    private static void ilkiHaricTopla(int i, int... k) {
        int sum=0;
        for (int a:k
             ) {
            sum+=a;
        }
        System.out.println(sum);
    }

    private static void toplama(int sayi, int sayi2, int... i) {//args ve baska bir parametre
        System.out.println("Vaargs a dahil olmayan argument : "+sayi);


    }
}
