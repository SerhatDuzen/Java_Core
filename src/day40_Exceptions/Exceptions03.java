package day40_Exceptions;

public class Exceptions03 {

    public static void main(String[] args) {

        int arr[] = {1,4,7,8};
        try {
            System.out.println(arr[20]);
        }finally {
            System.out.println("Ne olursa olsun bul satir yazilsin!!");
        }// finally blogu try catch ile veya sadece try blogu ile calisir
    }
}
