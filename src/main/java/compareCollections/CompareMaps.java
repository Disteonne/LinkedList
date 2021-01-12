package compareCollections;

import java.util.*;


public class CompareMaps {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        LinkedHashMap<Integer,Integer> linkedHashMap=new LinkedHashMap<>();
        TreeMap<Integer,Integer> treeMap=new TreeMap<>();

        //      ADD
        System.out.println("HashMap: "+add(hashMap,100000)+",LinkedHashMap: "+add(linkedHashMap,100000)+",TreeMap: "+add(treeMap,100000));


    }

    public static long add(Map<Integer,Integer> map, int size) {
        long startTimeOperation = System.nanoTime();
        for (int i = 0; i < size; i++) {
            map.put(i,i);
        }
        return System.nanoTime() - startTimeOperation;
    }

    public static long rem(Map<Integer,Integer> map, int valueKey) {
        long startTimeOperation = System.nanoTime();
        map.remove(valueKey);
        return System.nanoTime() - startTimeOperation;
    }
}
