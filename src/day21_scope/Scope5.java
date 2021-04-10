package day21_scope;

public class Scope5 {

    public static void main(String[] args) {

        for (int i = 0; i < 5 ; i++) {
            String isim = "Ayse"; //
            System.out.println(i+" "+isim);
        }
        //System.out.println(isim); // Loop icinde olusturulan var lar loopa ozeldir ve loop
        //disinda kullanilamaz

        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }

        int count = 0;// method a ait bir local var dir.
        // deger atamadan kullanmaya calisirsaniz cte alirsiniz


        while(count<5){
            System.out.println(count);
            count++;
        }
    }

}
