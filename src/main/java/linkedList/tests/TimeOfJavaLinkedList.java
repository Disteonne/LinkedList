package linkedList.tests;

import linkedList.tests.Tests;

import java.util.LinkedList;

public class TimeOfJavaLinkedList implements Tests {

    private LinkedList<String> javaList=new LinkedList<>();

    private  long startOperationTime=0;
    private  long endOperationTime=0;

    public LinkedList<String> getJavaList() {
        return javaList;
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
        startOperationTime=System.nanoTime();
        if(operation=="+") {
            String addAllEl = "";
            for (int i = 0; i < size; i++) {
                javaList.add(addAllEl + i + " ");
            }
        }else {
            for (int i = 0; i < size; i++) {
                javaList.remove(i);
            }
        }
        endOperationTime=System.nanoTime();
        return endOperationTime-startOperationTime;
    }
    /*
        '+' - insert
        '-' - remove
     */
    @Override
    public long insertOrRemoveOneEl(int index,String element,String operation) throws Exception {
        check(operation);
        clearTemps();
        startOperationTime=System.nanoTime();
        if (operation == "+") {
            javaList.add(index,element);
        }else {
            javaList.remove(index);
        }
        endOperationTime=System.nanoTime();
        return endOperationTime-startOperationTime;
    }



}
