package day38_exceptions;

import java.util.ArrayList;
import java.util.List;

public class Deneme {
private void init(){
    System.out.println("init fonksiyonu");
}
private void start(){
    init();
    System.out.println("Started");
}
    public static void main(String[] args) {

Integer i = new Integer("12345");
        System.out.println(i);
        List<Product> st = new ArrayList<>();
        st.add(new Product(10,"iCE"));
        st.add(new Product(11,"Choco"));
        Product p1= new Product(10,"iCE");
        System.out.println(123);


    }
}
class Product{
    int id;
    String name;
    Product(int id, String name){
        this.id=id;
        this.name=name;
    }
}
