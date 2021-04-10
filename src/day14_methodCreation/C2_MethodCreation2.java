package day14_methodCreation;

public class C2_MethodCreation2 {
    public static void main(String[] args) {
       //int snc =  carp(topla(3,5),topla(5,9));
        //System.out.println(snc);
ortalama(87,73);//method call


    }
    public static int topla(int sayi1,int sayi2){

        return sayi1+sayi2;
    }
    public static int carp(int s1,int s2){
        return s1*s2;
    }
public static void ortalama(double sayi1,double sayi2){

    System.out.println("Girdiginiz iki sayinin ortalamasi "+(sayi1+sayi2)/2);
}


}
