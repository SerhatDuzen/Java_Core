package day27_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList05 {

    public static void main(String[] args) {

        //verilen bir arrayi liste nasil cevirebiliriz

        Integer sayi[] = {10,12,35,60,40};

        List<Integer> listArr = Arrays.asList(sayi);

        System.out.println(listArr);

        //listArr.add(19); // bu methodla arrya cevirdigimiz list esnek olmaz
        // arrayin ozelliklerini tasir  ancak add remove clear gibi lenghti
        //etkileyen methodlar kullanilamaz
// atanan list ve array senkronize olarak anlik degisir
        sayi[1]=5;
        System.out.println(Arrays.toString(sayi));

        //System.out.println(listArr);

        System.out.println(listArr);

        listArr.set(2,13);
        System.out.println(Arrays.toString(sayi));
        System.out.println(listArr);
    }
}
