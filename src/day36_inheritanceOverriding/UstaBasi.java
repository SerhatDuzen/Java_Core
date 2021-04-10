package day36_inheritanceOverriding;

public class UstaBasi extends Isci {
    public String bolum="takimhane";
    public int sorOldIscisay = 20;

    public static void main(String[] args) {
        UstaBasi ub1 = new UstaBasi();
        System.out.println(ub1.bolum);
        //objeyi torun const classinda olsutrurunca 3 class a da ulasabilirz

                //ustabasi is a personel ,, Isci /// IS A
        Isci ub2 = new UstaBasi();
        Personel ub3 = new UstaBasi();
        //IS A relation da istege bagli olarak kullanilabilr
        //daha genis data turu yazmanin avantaji kapsamin genis olmasi
        System.out.println(ub2.raporluMu);
        //dezavantaji ise kapsamin daha dar olmasi. child in kapsami gorunmez.
        //Sadece sectigimiz class ve paent datalara ulasabiliriz




    }

}
