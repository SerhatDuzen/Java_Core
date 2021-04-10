package day23_statickeyword;

public class CalismaStatic5 {

    int number;
    String name;
    static String college ="ITS";

    CalismaStatic5 (int r, String n, String college){
        this.number=r;
        this.name=n;
        this.college=college;
    }

    public static void main(String[] args) {

        CalismaStatic5 s1 = new CalismaStatic5(111,"Karan","MIT");
        CalismaStatic5 s2 = new CalismaStatic5(222,"Aryan","Harvard");

        System.out.println(s1.number); //111
        System.out.println(s2.number); //222

        System.out.println(s1.name); //karan
        System.out.println(s2.name); //aryan

        System.out.println(s1.college); //Harvard
        System.out.println(s2.college); //harvard
    }

}