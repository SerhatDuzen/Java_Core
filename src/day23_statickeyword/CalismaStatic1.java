package day23_statickeyword;
public class CalismaStatic1 {

    int count;
    static int stCount;

    public CalismaStatic1() {
        count++;
        stCount++;

    }
    public int getCount() {
        return count;

    }
    public static int getStCount() {
        return stCount;

    }
    //count    1
    //stcount  1


    public static void main(String[] args) {

        CalismaStatic1 cs1  =new CalismaStatic1(); //
        CalismaStatic1 cs2  =new CalismaStatic1();
        CalismaStatic1 cs3  =new CalismaStatic1();
        CalismaStatic1 cs4  =new CalismaStatic1();
        CalismaStatic1 cs5  =new CalismaStatic1();
        CalismaStatic1 cs6  =new CalismaStatic1();
        System.out.println("count is : "+cs6.getCount()); //1
        System.out.println("stcount is : "+cs6.getStCount()); //6
    }

}