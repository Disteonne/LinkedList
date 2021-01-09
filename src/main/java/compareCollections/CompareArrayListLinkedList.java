package compareCollections;

import java.util.ArrayList;
import java.util.LinkedList;

public class CompareArrayListLinkedList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        LinkedList<Integer> linkedList=new LinkedList<>();

        System.out.println("-------------------------");
        long startAddTimeArrList=System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        long endAddTimeArrList=System.nanoTime();
        System.out.println("ArrayList add method: "+(endAddTimeArrList-startAddTimeArrList));

        long startAddTimeLinList=System.nanoTime();
        for (int i = 0; i < 100000; i++) {
           linkedList.add(i);
        }
        long endAddTimeLinList=System.nanoTime();
        System.out.println("LinkedList add method: "+(endAddTimeLinList-startAddTimeLinList));
        //arrayList faster


        System.out.println("-------------------------");
        long startAddElTimeArrList=System.nanoTime();
        arrayList.add(49999,999999);
        //arrayList.add(49742,999999);
        long endAddElTimeArrList=System.nanoTime();
        System.out.println("ArrayList ins el method: "+(endAddElTimeArrList-startAddElTimeArrList));

        long startAddElTimeLinList=System.nanoTime();
        linkedList.add(49999,999999);
        //linkedList.add(49742,999999);
        long endAddElTimeLinList=System.nanoTime();
        System.out.println("LinkedList ins el method: "+(endAddElTimeLinList-startAddElTimeLinList));
        //при маленьких индексах -линк быстрее. при средних-арр лист быстрее

        System.out.println("-------------------------");
        long startRemElTimeArrList=System.nanoTime();
        arrayList.remove(49999);
        long endRemElTimeArrList=System.nanoTime();
        System.out.println("ArrayList remove el method: "+(endRemElTimeArrList-startRemElTimeArrList));

        long startRemElTimeLinList=System.nanoTime();
        linkedList.remove(49999);
        long endRemElTimeLinList=System.nanoTime();
        System.out.println("LinkedList remove el method: "+(endRemElTimeLinList-startRemElTimeLinList));
        //результат аналогичен вставке эл-та



    }
}
