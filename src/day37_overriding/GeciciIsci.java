package day37_overriding;

public class GeciciIsci extends Isci{
    public String calistigiBolum="Yemekhane";

    public static void main(String[] args) {

        //overriding gecesiz kilma.. cdild classda parentden miras alinan methodu
        //degistirmek
        GeciciIsci gi1= new GeciciIsci();
        System.out.println(gi1.maasHesapla());
        gi1.mesai();

    }

    //overrie yapmak icin parent classdaki method signaturei ile child class da
    //bir method olsturulur.
    //signature ayni oldugundan sadece body degisir

    //@Override //annotation denir.bu sadece bir aciklama deildir. override ettigimiz
    //methodu surekli kontrol eder. parent deki overriden method signature i degistirilirse
    //CTE verdirir
    public void mesai() {
        //super.mesai();
        System.out.println("Gecici isciler haftada 25 saat calisir!");
    }
//java 19. satirda kodu inceleyenler icin bir aciklama getirir
//eger override edilen parent classdaki methodun (overriden class) un da calismasini istirsak
//overrideing mehodun  super.overridenmethodismi() yazilir
    //super.method yazilmazsa calismaz

    public double maasHesapla(){
        return 30*8*10;
    }
}


//overload : ayni isimde ama farkli metho signature sahip metotlaar