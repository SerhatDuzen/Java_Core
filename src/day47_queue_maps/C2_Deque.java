package day47_queue_maps;

import java.util.Deque;
import java.util.LinkedList;

public class C2_Deque {
    public static void main(String[] args) {
        // De double ended

        Deque<String> dk1 = new LinkedList<>();
        dk1.addFirst("C");
        dk1.add("M"); //SONA EKLER
        System.out.println(dk1);
        dk1.addLast("L");

        dk1.getFirst(); //ilk elemani getirir

        dk1.getLast(); // son elemani getirir
    }
}
