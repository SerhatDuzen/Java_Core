package day28_foreach;

public class C1_ForEachLoop {
    public static void main(String[] args) {

        //bir arr tum elemanlarini foreach ile yazd

        int arr[]= {2,4,5,97,8,10,12};

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
// for loop yazmamizin amaci arayin tum elemanlari uzerinde islem yapmak ise
//foreachloop daha kolay kod yazmamizi saglar

        for (int i:arr
             ) {
            System.out.print(i+ " ");
        }

    }
}
