package day37_overriding;

public class Isci extends Personel{
    public String bolum="Kaynak Atolyesi";
    public double maas=5000;
    public String isim="Mesut";
    public double maasHesapla(String str){

        return 30*8*15; //30 gun - 8 gunluk mesai - 15 saat ucreti
    }
    public void mesai(){
        System.out.println("Isciler gunluk 8 saat calisir.");
    }



}
