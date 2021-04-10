package day23_statickeyword;

public class CalismaStatic2 {

    int  count;
    static int stCount;

    public CalismaStatic2() {
        count ++;
        stCount ++;
    }

    public int getCount() {
        return count;

    }
    public static int getStCount() {
        return stCount;

    }
    public static void main(String[] args) {

        CalismaStatic2 cs1  =new CalismaStatic2();
        CalismaStatic2 cs2  =new CalismaStatic2();
        CalismaStatic2 cs3  =new CalismaStatic2();
        CalismaStatic2 cs4  =new CalismaStatic2();
        CalismaStatic2 cs5  =new CalismaStatic2();
        CalismaStatic2 cs6  =new CalismaStatic2();
        System.out.println("count is : "+cs1.getCount()); //1
        System.out.println("stcount is : "+cs1.getStCount()); //6
    }

}