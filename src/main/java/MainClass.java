import java.util.Iterator;
import java.util.LinkedList;


public class MainClass {

    public static void main(String[] args) {
            //-----add-----
            MyLinkedList<String> linkedList = new MyLinkedList<>();
            linkedList.add("1");
            linkedList.add("2");
            linkedList.add("3");
            linkedList.add("4");
            linkedList.add("5");
            linkedList.add("6");

            for (int i = 0; i < linkedList.size(); i++) {
                System.out.println(linkedList.get(i));
            }

            //-----remove + toArray-----
            System.out.println("-------------------");
            MyLinkedList<Integer> newLinkedList = new MyLinkedList<>(Integer.class);
            newLinkedList.add(6);
            newLinkedList.add(-4);
            newLinkedList.add(21);
            newLinkedList.add(19);
            newLinkedList.add(-104);
            newLinkedList.add(3);

            newLinkedList.remove(5);
            Integer[] array = newLinkedList.toArray();
            for (Integer i : array
            ) {
                System.out.println(i);
            }

            //-----Iterator-----
            System.out.println("-------------------");
            System.out.println("Iterator");
            Iterator<Integer> iterator=newLinkedList.iterator();
            while (iterator.hasNext()){
                    System.out.println(iterator.next());
            }
            //----add element index-----
            System.out.println("-------------------");
            MyLinkedList<String> list=new MyLinkedList<>();
            for (int i = 0; i < 10; i++) {
                    String str=""+i;
                    list.add(str);
            }
            for (int i = 0; i < list.size(); i++) {
                    System.out.print(list.get(i)+"    ");
            }
            System.out.println("\n - - - - -");
            list.add(9,"999");
            for (int i = 0; i < list.size(); i++) {
                    System.out.print(list.get(i)+"    ");
            }

            //-----Element-----
            System.out.println("-------------------");
            Integer integer=newLinkedList.get(0);
            System.out.println(integer); //expected 6 - done
            Integer integer1=newLinkedList.get(3);
            System.out.println(integer1); //expected 19 - done
            Integer integer2=newLinkedList.get(4);
            System.out.println(integer2); //expected -104 - done

            //-----Clear + size-----
            System.out.println("-------------------");
            newLinkedList.clear();
            System.out.println(newLinkedList.size()); //expected 0 - done


            //COMPARE MyLinkedList and LinkedList


            //-----add-----
            System.out.println("-------------------");
            long startTimeMyList=System.nanoTime();
            MyLinkedList<Integer> myLinkedList=new MyLinkedList<>();
            for (int i = 0; i < 10000; i++) {
                    myLinkedList.add(i);
            }
            long endTimeMyList=System.nanoTime();
            long resultMyListAddElements=endTimeMyList-startTimeMyList;

            long startTimeList=System.nanoTime();
            LinkedList<Integer> linkedList1=new LinkedList<>();
            for (int i = 0; i < 10000; i++) {
                    linkedList1.add(i);
            }
            long endTimeList=System.nanoTime();
            long resultListAddElements=endTimeMyList-startTimeMyList;
            System.out.println("MyList add method: "+resultMyListAddElements);
            System.out.println("Java List add method: "+resultListAddElements);

            //-----remove-----
            System.out.println("-------------------");
            long startTimeMyListRemove=System.nanoTime();
            myLinkedList.remove(6857);
            long endTimeMyListRemove=System.nanoTime();
            System.out.println("MyList remove el method: "+(endTimeMyListRemove-startTimeMyListRemove));

            long startTimeListRemove=System.nanoTime();
            linkedList1.remove(6857);
            long endTimeListRemove=System.nanoTime();
            System.out.println("Java List remove el method: "+(endTimeListRemove-startTimeListRemove));

            //-----clear-----
            System.out.println("-------------------");
            long startTimeMyListClear=System.nanoTime();
            myLinkedList.clear();
            long endTimeMyListClear=System.nanoTime();
            System.out.println("MyList clear el method: "+(endTimeMyListClear-startTimeMyListClear));

            long startTimeListClear=System.nanoTime();
            linkedList1.clear();
            long endTimeListClear=System.nanoTime();
            System.out.println("Java List clear method: "+(endTimeListClear-startTimeListClear));


        }

}
