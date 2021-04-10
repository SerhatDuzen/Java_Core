package day38_exceptions;

public class Exceptions03 {

    public static void main(String[] args) {
//tray catch blogundaki e nin gorevi
        int s1 =10, s2=0;

        Exceptions01 exp = new Exceptions01();
        //esitligin solundaki ex1 hem class adi hem de exp objesi icin data turu
int ans=1;
        try {
            System.out.println(s1/s2);
        }catch (ArithmeticException e){ // ArithmeticException bir class ve
            System.out.println("Bir sayi sifira bolunemez!!");
            //e objesi icin data turu
            System.out.println(e);
            ans=10;
            //bu durumda hem javaya sorunu yazmasi icin firsat vemis
            //hem de app i bloke etmemis oluruz
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (Exception e){

        }
        System.out.println(ans);

    }
}
