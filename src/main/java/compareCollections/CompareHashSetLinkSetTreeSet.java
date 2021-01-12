package compareCollections;

import java.util.*;

public class CompareHashSetLinkSetTreeSet {
    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        //  ADD
        System.out.println("HashSet: "+add(hashSet,100000)+",LinkedHashSet: "+add(linkedHashSet,100000)+",TreeSet: "+add(treeSet,100000));
        //  REM
        System.out.println("HashSet: "+rem(hashSet,0)+",LinkedHashSet: "+rem(linkedHashSet,0)+",TreeSet: "+rem(treeSet,0));

    }

    public static long add(Set<Integer> set, int size) {
        long startTimeOperation = System.nanoTime();
            for (int i = 0; i < size; i++) {
                set.add(i);
            }
        return System.nanoTime() - startTimeOperation;
    }

    public static long rem(Set<Integer> set, int index) {
        long startTimeOperation = System.nanoTime();
            set.remove(index);
        return System.nanoTime() - startTimeOperation;
    }
}
