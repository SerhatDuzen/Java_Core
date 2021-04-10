package day33_Encapsulation;

public class Encapsulation02 {
    private String okulIsmi = "Yildiz Koleji";


    private String tcNo="12345678901";
    private int hesapNo=5554321;
    public int sayi = 100;
    public static void main(String[] args) {
        // eger ulasmak istedigim class uyeleri(class member) public degilse baska
        // package'lerden ulasmak icin extra islem yapmamiz gerekir.

        //Yapabilecegimis islemlerden birincisi enmcapsulation dir.
        //bu classda komseyle paylasmak istemedifiniz methodlar olustualim
        //priate yapinca guvenlik konusunu hallettik. ancak class uyeleriiin
        //private olmasi oop conceptr aykiri.

        //encapsulation classimizda olusturdugumuz class uyelerine kimlerin
        //ne oranda ulasabilecegini belirlemek icin yapilir

    }

    private void denemeMethod(){
        System.out.println("Deneme methodu calisti!!");
    }

    public String getOkulIsmi() {
        return okulIsmi;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public void setHesapNo(int hesapNo) {
        this.hesapNo = hesapNo;
    }




}
