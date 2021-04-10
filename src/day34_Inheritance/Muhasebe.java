package day34_Inheritance;

public class Muhasebe extends Personel {
        // personel classinin child i dir
        public int saatUcreti;
        public String statu;
        public int maas;

        public int maasHesapla(){
            maas=30*8*saatUcreti;
            return maas;
        }

}
