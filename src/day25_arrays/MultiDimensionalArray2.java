package day25_arrays;

public class MultiDimensionalArray2 {
    public static void main(String[] args) {
        //verilen 2 katli bir arrayin el topl

        int arr[][]={{1,2,3},{5,8},{9,6,5,1}};
int sum=0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j <arr[i].length ; j++) {
                sum+= arr[i][j];
            }
        }
        System.out.println(sum);

    }

}
