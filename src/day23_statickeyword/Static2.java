package day23_statickeyword;
public class Static2 {

    int x;
    static int y;

    Static2 (int i) {
        x+=i;
        y+=i;
    }
    public static void main(String[] args) {

        new Static2(2) ; // x=2    y=2
        Static2 dnm = new Static2(3);  // x=3 y=5
        System.out.println(dnm.x + "," +dnm.y);

    }
}
