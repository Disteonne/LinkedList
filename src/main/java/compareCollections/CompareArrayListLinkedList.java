package compareCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CompareArrayListLinkedList {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        //      ADD
        System.out.println("ArrayList: "+add(arrayList,100000,null)+", LinkedList: "+add(linkedList,10,null));

        System.out.println("ArrayList: "+add(arrayList,100000,9999)+", LinkedList: "+add(linkedList,10,9999));

        //      REM
        System.out.println("ArrayList: "+rem(arrayList,0,null)+", LinkedList: "+rem(linkedList,0,null));
    }

    public static long add(List<Integer> list, int size, Integer element) {
        long startTimeOperation = System.nanoTime();
        if (element==null) {
            for (int i = 0; i < size; i++) {
                list.add(i);
            }
        } else{
            list.add(element);
        }
        return System.nanoTime() - startTimeOperation;
    }

    public static long rem(List<Integer> list, int index,Integer element) {
        long startTimeOperation = System.nanoTime();
        if(element==null) {
            list.remove(index);
        }else
            list.remove(element);
        return System.nanoTime() - startTimeOperation;
    }

}
