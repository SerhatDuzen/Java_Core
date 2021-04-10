package day32_stringbuilder;

import java.time.LocalTime;

public class C2_StringBuilder02 {
    public static void main(String[] args) {

        ///100000 kez donecek loop yapalim. loopda sring ve sting builder kullanip
        //oncesinde ve sonasinda zman alalim. hizlarini karsilastiralim


        String str = "";
        StringBuilder sb = new StringBuilder("");
        LocalTime time = LocalTime.now();
        System.out.println(time);

        for (int i = 0; i <100000 ; i++) {
str+=i;
        }
        LocalTime time2 = LocalTime.now();
        System.out.println(time2);


        LocalTime time3 = LocalTime.now();
        System.out.println(time3);

        for (int i = 0; i <100000 ; i++) {
            sb.append(i);
        }
        LocalTime time4 = LocalTime.now();
        System.out.println(time4);

        //SB Stringden cok daha hizli

        //stringbuffer da yavas. multithread a yarar

        
    }
}
