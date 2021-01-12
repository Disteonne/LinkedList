import java.lang.reflect.Array;
import java.util.Iterator;


public class MyLinkedList<E> implements ILinkedList<E> {

    private int size;
    private Node<E> first;
    private Node<E> last;


    private E[] elements;
    private Class<?> aClass;
    private int counter = 0;
    private int countOfIterator=0;



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
        int count=0;
        if(index>0 & index<size ){
            for (Node<E> node=first;first!=null;){
                if(count==index-1){
                    Node<E> newNode=new Node<E>(element,node.nextNode,node);
                    node.nextNode.lastNode=newNode;
                    node.nextNode=newNode;
                    break;
                }
                node=node.nextNode;
                count++;
            }
        }
    }

    @Override
    public void clear() {
        for (Node<E> node = first; first != null & node!=null; ) {
            Node<E> nextNode = node.nextNode;
            node.lastNode = null;
            node.nextNode = null;
            node.element = null;
            node= nextNode;
        }
        //first = null;
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
    public Iterator<E> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<E>{
        @Override
        public boolean hasNext() {
            return counter < size;
        }

        @Override
        public E next() {

            return get(counter++);
        }
    }

    @Override
    public String toString() {
        Iterator<E> iterator=iterator();
        if(! iterator.hasNext()){
            return "list is empty";
        }

        StringBuilder stringBuilder=new StringBuilder("{");
        while (true){
            stringBuilder.append(iterator.next());
            if(!iterator.hasNext()){
                counter=0;
                return stringBuilder.append("}").toString();
            }
            stringBuilder.append(", ");
        }
    }

    @Override
    public int indexOf(E element) {
        int index=0;
        while (iterator().hasNext()){
            E elOfNode=iterator().next();
            if(elOfNode.equals(element)){
                return index;
            }
            index++;
        }
        return -1;
    }


}
