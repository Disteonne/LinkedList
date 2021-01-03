import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class MyLinkedList<E> implements ILinkedList<E> {

    private int size;
    private Node<E> first;
    private Node<E> last;


    private E[] elements;
    private Class<?> aClass;


    private int counter = 0;

    public MyLinkedList() {
    }

    public MyLinkedList(Class<E> eClass) {
        this.aClass = eClass;
    }

    private void addToStart(E element) {
        Node<E> node = first;
        Node<E> newNode = new Node<>(element, node, null);
        first = newNode;
        if (node == null) {
            throw new NullPointerException();
        } else
            newNode.lastNode = node;
        size++;
    }

    private void addToEnd(E element) {
        Node<E> node = last;
        Node<E> newNode = new Node<>(element, null, node);
        last = newNode;
        if (node == null) {
            first = newNode;
        } else {
            node.nextNode = newNode;
        }
        size++;
    }

    @Override
    public void add(E element) {
        addToEnd(element);
    }

    @Override
    public void add(int index, E element) {
        if (index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0 && size == 0 | index == size) {
            addToEnd(element);
        }
        if (index == 0 && size > 0) {
            addToStart(element);
        }
    }

    @Override
    public void clear() {
        for (Node<E> node = first; first != null; ) {
            Node<E> nextNode = node.nextNode;
            node.lastNode = null;
            node.nextNode = null;
            node.element = null;
            node = nextNode;
        }
        first = null;
        size = 0;
    }

    private E getFirst() {
        Node<E> first = this.first;
        if (first == null) {
            throw new NullPointerException();
        } else
            return first.element;
    }

    private E getLast() {
        Node<E> last = this.last;
        if (last == null) {
            throw new NullPointerException();
        } else {
            return last.element;
        }
    }

    @Override
    public E get(int index) {
        E elementResult = null;
        if (size == 0) {
            throw new NullPointerException();
        }
        if (index == 0 & size > 0) {
            elementResult = getFirst();
        }
        /*
        if(index==size-1 & size>0){
           return  getLast();
        }
         */
        if (index > 0 & index < size) {
            Node<E> target = first;
            for (int i = 0; i < index; i++) {
                if (i == size - 1) {
                    getLast();
                } else {
                    target = getNextNode(target);
                }
            }
            elementResult = target.getElement();
        }
        return elementResult;
    }

    private Node<E> getNextNode(Node<E> node) {
        return node.getNextNode();
    }

    private void removeFirst(Node<E> node) {


    }

    @Override
    public E remove(int index) {
        if (index >= 0 & index < size) {
            return unlink(getNode(index));
        } else
            throw new IndexOutOfBoundsException();
    }

    private Node<E> getNode(int index){
        Node<E> result=null;
        int count=0;
        for (Node<E> node = first; first != null; node = node.nextNode) {
            if(count!=index){
                count++;
                continue;
            }else {
                result=node;
                break;
            }
        }
        return result;
    }

    private E unlink(Node<E> node) {
        E elem = node.element;
        Node<E> nextN = node.nextNode; //следующий
        Node<E> lastN = node.lastNode; //предыдущий

        if (nextN == null) {
            last = lastN;
        } else {
            nextN.lastNode = lastN;
            if(node.lastNode!=null) {

                //node.nextNode = null;
                lastN.nextNode = nextN;
            }
        }

        if (lastN == null) {
            first = nextN;
        } else {
            //lastN.lastNode = lastN;
            lastN.nextNode = nextN;
            if(node.nextNode!=null) {
                node.nextNode.lastNode = lastN;
                node.nextNode = null;
            }
        }
        node.element = null;
        size--;
        return elem;
    }

    @Override
    public E set(int index, E element) {
        add(index, element);
        return element;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E[] toArray() {
        elements = (E[]) Array.newInstance(aClass, size);
        int count = 0;
        for (Node<E> node = first; first != null; node = node.nextNode) {
            if (count != size) {
                elements[count] = node.element;
                count++;
            } else
                break;
        }
        return elements;
    }


    @Override
    public boolean hasNext() {
        return counter < size;
    }

    @Override
    public E next() {
        return get(counter++);
    }

    public static void main(String[] args) {
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        linkedList.add("kek");
        linkedList.add("new string");
        linkedList.add("еще одна строчка");
        linkedList.add("еще одна строчка1");
        linkedList.add("еще одна строчка2");
        linkedList.add("еще одна строчка3");
        for (int i = 0; i < linkedList.size; i++) {
            System.out.println(linkedList.get(i));
        }
        String str = "";
        /*
        for (MyLinkedList<String> it = linkedList; it.hasNext(); ) {
            String str = it.next();
            System.out.println(str);
        }
         */

        MyLinkedList<Integer> newLinkedList = new MyLinkedList<>(Integer.class);
        newLinkedList.add(6);
        newLinkedList.add(-4);
        newLinkedList.add(21);
        newLinkedList.add(19);
        newLinkedList.add(-104);
        newLinkedList.add(3);
        /*
        Integer[] array = newLinkedList.toArray();
        for (Integer i : array
        ) {
            System.out.println(i);
        }
         */
        newLinkedList.remove(5);
        Integer[] array = newLinkedList.toArray();
        for (Integer i : array
        ) {
            System.out.println(i);
        }
    }
}