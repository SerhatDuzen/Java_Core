package day33_Encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {
        Araba car1 = new Araba();
        car1.setMarka("Toyota Verso");
        car1.setModel("2015");
        car1.setKazaliMi(false);
        car1.setPiyasaDegeri("90000");
        car1.setPlaka("a2ae234");
        car1.setRenk("Beyaz");
        car1.setYaptigiKm("60000");
        car1.aracBilgileriniGetir(car1);
        System.out.println();
        System.out.println(car1.getPlaka());

    }
}
