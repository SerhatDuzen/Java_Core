package day39_exceptions;

public class Exceptions06 {

    public static void main(String[] args) {
        //list ve arrayde var olmayan bir indexte islem yapmak isterseniz java indexoutofexc verir
        int arr[] = {1,2,5,6};

        System.out.println(arr[1]); //2
        System.out.println(arr[5]); //arrayIndexOfBoundsException



    }
}
