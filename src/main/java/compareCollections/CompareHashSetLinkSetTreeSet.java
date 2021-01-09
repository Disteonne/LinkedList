package compareCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CompareHashSetLinkSetTreeSet {
    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        //-----add-----
        System.out.println("-------------------------");

        long startAddTimeHashSet = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            hashSet.add(i);
        }
        long endAddTimeHashSet = System.nanoTime();
        System.out.println("HashSet add: " + (endAddTimeHashSet - startAddTimeHashSet));

        long startAddTimeLinkedHashSet = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedHashSet.add(i);
        }
        long endAddTimeLinkedHashSet = System.nanoTime();
        System.out.println("LinkedHashSet add: " + (endAddTimeLinkedHashSet - startAddTimeLinkedHashSet));

        long startAddTimeTreeSet = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            treeSet.add(i);
        }
        long endAddTimeTreeSet = System.nanoTime();
        System.out.println("TreeSet add: " + (endAddTimeTreeSet - startAddTimeTreeSet));


        //-----remove element-----
        System.out.println("-------------------------");

        long startRemTimeHashSet = System.nanoTime();
        hashSet.remove(49999);
        long endRemTimeHashSet = System.nanoTime();
        System.out.println("HashSet remove el: " + (endRemTimeHashSet - startRemTimeHashSet));

        long startRemTimeLinkedHashSet = System.nanoTime();
        linkedHashSet.remove(49999);
        long endRemTimeLinkedHashSet = System.nanoTime();
        System.out.println("LinkedHashSet remove el: " + (endRemTimeLinkedHashSet - startRemTimeLinkedHashSet));

        long startRemTimeTreeSet = System.nanoTime();
        treeSet.remove(49999);
        long endRemTimeTreeSet = System.nanoTime();
        System.out.println("TreeSet remove el: " + (endRemTimeTreeSet - startRemTimeTreeSet));

    }
}
