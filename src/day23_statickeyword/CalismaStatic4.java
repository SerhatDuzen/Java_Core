package day23_statickeyword;

public class CalismaStatic4 {

    int count = 0;

    CalismaStatic4(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        CalismaStatic4 c1 =new CalismaStatic4();//1
        CalismaStatic4 c2 =new CalismaStatic4();//1
        CalismaStatic4 c3 =new CalismaStatic4();//1

    }

}