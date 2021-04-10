package day22_constructor;

public class CarUret {
    // bu class da gorunur bir constructor yok
    //Bir class olusturuldugunda java bu class dan object uretilecegini
    //bilir ve default olarak gorulmeyen default const class a yerlestirir
    //default cnst parametresizdir Dolayisiyla sadece hicbir ozelligi tanimlanamayan
    //objeler uretir    (tisort uret)
    //default const ile uretilen bir objenin tum ozellikleri sonradan tanimlanmalidir
    //eger biz sonradan const yazarsak java default const u iptal eder
    //bir cnst olustralim

    public CarUret(){

    }
    //kurallar 1- ismi class ile ayni olmalidir/dolayisyla buyuk harfle baslar
    // 2- const return type a sahip degildir
    // 3- const isminden sonra mutlaka parantez olur () ama parametre
    //olmasi opsiyoneldir
    //4- bir const olusturuldugunda kimlerin kullanacagini access modifier yazilir
    //5 -


    String marka;
    String model;
    int yil;
    boolean kazasiVarmi;

    public void yakit(String yakit) {
        System.out.println("Araba yakit olarak " + yakit + " kullanir.");
    }

    public void vites(String vites) {
        System.out.println("Araba " + vites + " viteslidir.");
    }
    // bu bir programda cok fazla uretecegimiz objeler icin bir tane class
    // olustururuz. objelere ait ozellikler bulunur
    //bu class direk calistirilmayacagi icin main method olmasa da olu
    //kaliphane gibidir


}
