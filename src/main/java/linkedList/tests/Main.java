package linkedList.tests;

public class Main {

    public static void main(String[] args) throws Exception {
       TimeOfJavaLinkedList timeJava=new TimeOfJavaLinkedList();
       TimeOfMyLinkedList timeMyList=new TimeOfMyLinkedList();


        //       ADD ELEMENTS -> "-"
        //100 elem
        printForAddRem(100,timeJava,timeMyList);

        //       INSERT "+" /REMOVE "-" ELEMENT
        //printForInsertRem(0,timeJava,timeMyList);

        // test foreach
        for (String str:timeMyList.getList()
             ) {
            System.out.println(str);
        }
    }


    private static void printForAddRem(int size, Tests javaListTime, Tests myListTime) throws Exception {
        System.out.println(javaListTime.addOrRemoveAllElementsTime(size,"+"));
        System.out.println(myListTime.addOrRemoveAllElementsTime(size,"+"));
    }

    private static void printForInsertRem(int index, Tests javaListTime, Tests myListTime) throws Exception{
        System.out.println(javaListTime.insertOrRemoveOneEl(index,"newElement","+"));
        System.out.println(myListTime.insertOrRemoveOneEl(index,"newElement","+"));
    }
}
