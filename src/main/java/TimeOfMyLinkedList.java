import org.w3c.dom.Text;

import java.util.LinkedList;

public class TimeOfMyLinkedList implements Tests {

    private  MyLinkedList<String> list=new MyLinkedList<>();
    private  long startOperationTime=0;
    private  long endOperationTime=0;

    public MyLinkedList<String> getList() {
        return list;
    }
    @Override
    public void clearTemps(){
        startOperationTime=0;
        endOperationTime=0;
    }
    /*
        '+' - addAll
        '-' - removeAll
     */
    @Override
    public  long addOrRemoveAllElementsTime(int size,String operation) throws Exception {
        check(operation);
        clearTemps();
        startOperationTime=System.currentTimeMillis();
        if(operation=="+") {
            String addAllEl = "";
            for (int i = 0; i < size; i++) {
                list.add(addAllEl + i + " ");
            }
        }else {
            for (int i = 0; i < size; i++) {
                list.remove(i);
            }
        }
        endOperationTime=System.currentTimeMillis();
        return endOperationTime-startOperationTime;
    }

    /*
        '+' - insert
        '-' - remove
     */
    @Override
    public  long insertOrRemoveOneEl(int index,String element,String operation) throws Exception {
        check(operation);
        clearTemps();
        startOperationTime=System.currentTimeMillis();
        if (operation == "+") {
            list.add(index,element);
        }else {
            list.remove(index);
        }
        endOperationTime=System.currentTimeMillis();
        return endOperationTime-startOperationTime;
    }

}
