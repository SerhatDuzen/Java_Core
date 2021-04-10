package day43_interfaces;

public interface Interface02 {

   //defauld ve static
abstract void abc();
    default void deneme(){
        System.out.println("default kw li method");
    }
       //bizim bildigimiz default access modifier
        //bir methodda birden fazla access modiier olmaz. inrwefacede ols methodlar
    //abst ve public dir. default access modifier degildir.
    //interfacede default yw kullanarak concrete(bodysiolan) method olustrabliriz
    // default kw ozel bir cozumudur// burdaki def  kw methodun concrete oldugunun isareti

    static void deneme2(){
        System.out.println("static kw li method");

    }


        //def kw icin yazilanlar static icin de gecerlidir.
    //static ve defailt kw kullanarak olusturdugumuz methodlar override edilmek zorunda degil

}
