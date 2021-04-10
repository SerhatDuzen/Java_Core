package day43_interfaces;

import java.util.ArrayList;
import java.util.List;

public class InterfaceRunner extends Animal implements Interface02 {

    public static void main(String[] args) {
//static olarak tanimlanmis variable yada method baska classdan classIsmi.Methodismi
        //seklinde cagrilabilir. Static burda da cagrilir
        Interface02.deneme2();

        //default method ise obje uzerinden cagrilmalidir

        InterfaceRunner obj1 = new InterfaceRunner();
        obj1.deneme();

        List<Interface02> st = new ArrayList<>();
st.add((Interface02) new Animal());
        System.out.println(st);

        }

    }

