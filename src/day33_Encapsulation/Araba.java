package day33_Encapsulation;

public class Araba {
    private String marka;
    private String model;
    private String plaka;
    private String yaptigiKm;
    private String renk;
    private String piyasaDegeri ;
    private boolean kazaliMi;

    public static void aracBilgileriniGetir(Araba car){
        System.out.println(car.getMarka());
        System.out.println(car.getModel());
        System.out.println(car.getPlaka());
        System.out.println(car.getYaptigiKm());
        System.out.println(car.getRenk());
        System.out.println(car.getPiyasaDegeri());
        System.out.println(car.isKazaliMi());
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        int m = Integer.parseInt(model);
        if(m>1950&&m<2022)this.model = model;
        else System.out.println("Lutfen gecerli bir aralikta giriniz");
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        if(Character.isDigit(plaka.charAt(0))&&Character.isDigit(plaka.charAt(1))){
            this.plaka = plaka;
        }else {
            System.out.println("Lutfen plakanin ilk 2 hanesini rakam olarak giriniz");
        }

    }

    public String getYaptigiKm() {
        return yaptigiKm;
    }

    public void setYaptigiKm(String yaptigiKm) {
        this.yaptigiKm = yaptigiKm;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getPiyasaDegeri() {
        return piyasaDegeri;
    }

    public void setPiyasaDegeri(String piyasaDegeri) {
        this.piyasaDegeri = piyasaDegeri;
    }

    public boolean isKazaliMi() {
        return kazaliMi;
    }

    public void setKazaliMi(boolean kazaliMi) {
        this.kazaliMi = kazaliMi;
    }
}
