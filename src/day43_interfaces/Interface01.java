package day43_interfaces;

public interface Interface01 {

    public void motor(); // interface icinde abst methodlar ve ozel concrete methodlar

    // olabilir.
    /*
    bIR ABST MEthod un body si olmadigindan o methodun istenen dinamik ozelligi nasil
    gerceklestirecegini bilmemiz mumkun degildir. sadece ne yapacagini biliriz
    BU METHD BIZE SUNU ANLATIR: beni inherit eden her concrete class in dinamik motor
    ozelligi olmalidir

     */
    void vites();
    abstract void kasa();
/*
Interface de sadece Abstract, public, methodlar olur
bu iki kw u yazsak da yazmasak da java tum methodlari bu sekilde kabul eder
 */

    //javada interface olusturmak istiyorsak bastan o sekilde olusturmaliyiz
    //bir class sonradan bazi yeywordler yazilarak interface olusturulamaz


    String isim = "Mustafa"; //java isim kelimesini ialic ve bold yapti/ **final deger**
    //atama yapmak zorunlu



}
