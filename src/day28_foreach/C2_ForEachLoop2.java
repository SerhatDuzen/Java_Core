package day28_foreach;

public class C2_ForEachLoop2 {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8,9};
        int snc= 1;
        for (int w:arr
             ) {
            snc*=w;
        }
        System.out.println("Girmis oldugun sayilarin carpimi = "+snc+" dir.");


    }
}
