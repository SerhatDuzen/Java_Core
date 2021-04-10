package day47_queue_maps;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C1_Queue {
    C2_Deque cls;
    public static void main(String[] args) {
        //queue bir interfacedir dolayisiyla object uretemeyiz. child classi olan
        //priority ve linkedlist const ile uretilir. buna gore objenin davranisi degisir
        Queue<String> k1 = new PriorityQueue<>();
        k1.add("b");
        k1.add("c");
        k1.add("m");
        k1.add("a");
        System.out.println(k1);
        //queue yapisi (kuyruk) geregi insertion ordera gore siralama yapmasi beklenir
        //acnak const olarak priorityqueue sectigimiz icin java tarafindan belirlennen
        // prioritye gore siralama yapar // prority manuel olarak tanimlanabilir
        Queue<String> k2 = new LinkedList<>();
        //ayni elemanlarla fakat linkledlist const kullanarak olusturdugumuz queue ise
        //beklenenlere uygun olarak ekleme sirasina gore yazdirir
        k2.add("b");
        k2.add("c");
        k2.add("m");
        k2.add("a");
        System.out.println(k2);

        //queue nin yapisi geregi fifo kuali gecerlidir

        k2.offer("z"); //en sona eleman ekler
        System.out.println(k2);
        k1.offer("z");
        System.out.println(k1);
        System.out.println(k2.peek()); //sildemen ilk elemani dondurur
        k2.remove();//ilk elemani siler
        k2.remove("m"); //objeyi siler
        System.out.println(k2.poll()); // ilk elemani siler // poll bos bir queue da kullanilirsa
        //exc vermez // remove exc verir

        System.out.println(k1.element()); // silmeden ilk elemani etirir


    }
}
