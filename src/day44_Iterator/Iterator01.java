package day44_Iterator;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println(list);
        for (String w : list
        ) {
            w += "B";
        }

        Iterator it1 = list.iterator();
        //next hasnext remove methodlarina sahiptir
        //listedeki tum elemanlari iterator kullanarak silelim

        while (it1.hasNext()) {
            it1.next();
            it1.remove();
        }
        System.out.println(list);

    }
}
