package day23_statickeyword;

public class CalismaStatic3 {
    static int x;
    int y;

    CalismaStatic3(){
        x+=2;
        y++;
    }
    static int getSquare() {
        return x * x;
    }


    public static void main(String[] args) {
        CalismaStatic3 sm1 = new CalismaStatic3(); //x=4

        CalismaStatic3 sm2 = new CalismaStatic3();

        int z = sm1.getSquare(); //16

        System.out.println("-x" + z + "-y" + sm2.y); //-x16-y1

    }

}