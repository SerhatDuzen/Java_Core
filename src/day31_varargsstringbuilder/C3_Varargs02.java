package day31_varargsstringbuilder;

public class C3_Varargs02 {
    public static void main(String[] args) {

        toplama(2,5);
        toplama(5,10,15);
        toplama(4,5,99,6,14,56);
        toplama(1,2,3,4,5,6,7,8,9);




    }

    private static void toplama(int... i) {// data turunden sonra yazdigimiz ... varargs kullanacagimiz anlamina gelir
int sum=0;
        for (int j:i
             ) {
sum+=j;
        }
        System.out.println("Toplam = "+sum);
    }
}
