package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratorWithHashMap {
    public static void main(String[] args) {
        Map<Integer, String > myHm= new HashMap();

        myHm.put(1,"first");
        myHm.put(2,"Second");
        myHm.put(3,"Third");
        myHm.put(4,"Fourth");


        for (Map.Entry<Integer, String> entry: myHm.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }



        Set set = myHm.entrySet();

        Iterator  it = set.iterator();

        while (it.hasNext()){
            Map.Entry mp = (Map.Entry)it.next();
            System.out.println(mp.getKey());
            System.out.println(mp.getValue());
        }

    }
}
