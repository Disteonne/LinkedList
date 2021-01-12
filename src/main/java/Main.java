import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws Exception {
       TimeOfJavaLinkedList timeJava=new TimeOfJavaLinkedList();
       TimeOfMyLinkedList timeMyList=new TimeOfMyLinkedList();

       long result=timeJava.addOrRemoveAllElementsTime(100,"+");
       //100 elem
        System.out.println(result);
        System.out.println(timeJava.getJavaList().size());
        System.out.println(timeMyList.addOrRemoveAllElementsTime(100,"+"));

        //1000 elem
        System.out.println(timeJava.addOrRemoveAllElementsTime(1000,"+"));
        System.out.println(timeMyList.addOrRemoveAllElementsTime(1000,"+"));

    }

}
