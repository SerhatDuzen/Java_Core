package day18_whileloop;

public class C3_WhileLoop2 {
    public static void main(String[] args) {
        //Soru 2 ) For loop ve while Loop kullanarak 3 basamakli sayilardan 15, 20 ve 90’na tam bolunebilen sayilari yazdirin.


        for (int i = 100; i <1000 ; i++) {
            if(i%15==0&&i%20==0&&(i%90)==0)
                System.out.printf(i+ " ");
        }
        System.out.println();
        int a=99;
        while (a<1000){
if(a%15==0&&a%20==0&&(a%90)==0)
    System.out.printf(a+ " ");

a++;
        }

    }
}
