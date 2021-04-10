package day22_constructor;

public class ParametreliContructor {



    public ParametreliContructor(int yil) {
        this.yil = yil;
    }
    public ParametreliContructor() {
    }
    public ParametreliContructor(String Marka, String Model){
        this.marka = Marka;
        this.model= Model;
    }

    public ParametreliContructor(String marka, String model, int yil, boolean kazasiVarmi) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.kazasiVarmi = kazasiVarmi;
    }

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
}
