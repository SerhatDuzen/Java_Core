package day22_constructor;

import java.lang.reflect.Constructor;

public class Car {

    String marka;
    String model;
    int yil;
    boolean kazasiVarmi;

    public static void main(String[] args) {
        Car car1 = new Car();
        //bir obje olusturuldugunda esitligi saginda mutlaka const kullanilir
        // const ismi class ismi ile ayni olmalidir
        //COnstructorda mutlaka () olmalidir
        // canst da parametre olmasi istege bagldir
        System.out.println(car1.marka + " " + car1.model + " " +
                car1.yil + " " + car1.kazasiVarmi); //Burda default degerler
        car1.marka = "Toyota";
        car1.model = "Corolla";
        car1.yil = 2010;
        car1.kazasiVarmi = false;
        System.out.println(car1.marka + " " + car1.model + " " +
                car1.yil + " " + car1.kazasiVarmi);

        Car car2 = new Car();
        car2.marka = "Opel";
        car2.model = "Astra";
        car2.yil = 2015;
        car2.kazasiVarmi = true;
        System.out.println(car2.marka + " " + car2.model + " " +
                car2.yil + " " + car2.kazasiVarmi);
    }



}
