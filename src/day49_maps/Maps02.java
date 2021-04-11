package day49_maps;

import java.util.HashMap;
import java.util.Map;

public class Maps02 {
    public static void main(String[] args) {
/*Verilen bir String’deki harfleri ve
harflerin kacar kez kullanildigini return eden bir method yaziniz
 */
String input = "Heellllloooooooo";
        Map<String,Integer> methoddanGelen = harfSayisiBul(input);
        System.out.println(methoddanGelen);

    }

    public static Map<String, Integer> harfSayisiBul(String input) {
        String arr[] = input.split("");
        Map<String,Integer> harfKullanimSayisi = new HashMap<>();
        for (String w:arr
             ) {
            if(!harfKullanimSayisi.containsKey(w)){
                harfKullanimSayisi.put(w,1);
            }else {
                harfKullanimSayisi.put(w,harfKullanimSayisi.get(w)+1);
            }
        }


        return harfKullanimSayisi;
    }
}
