package compareCollections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;


public class CompareMaps {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        LinkedHashMap<Integer,Integer> linkedHashMap=new LinkedHashMap<>();
        TreeMap<Integer,Integer> treeMap=new TreeMap<>();

        //-----add-----
        System.out.println("-------------------------");

        long startAddHashMap=System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            hashMap.put(i,i);
        }
        long endAddHashMap=System.nanoTime();
        System.out.println("HashMap add: "+(endAddHashMap-startAddHashMap));


        long startAddLinkedHashMap=System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedHashMap.put(i,i);
        }
        long endAddLinkedHashMap=System.nanoTime();
        System.out.println("LinkedHashMap add: "+(endAddLinkedHashMap-startAddLinkedHashMap));

        long startAddTreeMap=System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            treeMap.put(i,i);
        }
        long endAddTreeMap=System.nanoTime();
        System.out.println("TreeMap add: "+(endAddTreeMap-startAddTreeMap));
        //линкед быстрее всех. сет-самый тормоз


        //-----remove el-----
        System.out.println("-------------------------");

        long startRemHashMap=System.nanoTime();
        hashMap.remove(49999);
        long endRemHashMap=System.nanoTime();
        System.out.println("HashMap remove: "+(endRemHashMap-startRemHashMap));


        long startRemLinkedHashMap=System.nanoTime();
        linkedHashMap.remove(49999);
        long endRemLinkedHashMap=System.nanoTime();
        System.out.println("LinkedHashMap remove: "+(endRemLinkedHashMap-startRemLinkedHashMap));

        long startRemTreeMap=System.nanoTime();
        treeMap.remove(49999);
        long endRemTreeMap=System.nanoTime();
        System.out.println("TreeMap remove: "+(endRemTreeMap-startRemTreeMap));

    }
}
