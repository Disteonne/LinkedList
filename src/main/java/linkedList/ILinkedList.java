package linkedList;

import java.util.Iterator;
import java.util.function.Consumer;

public interface ILinkedList<E> extends Iterable<E> {

     void add(E element);

     void add(int index,E element);

     void clear();

     E get(int index);

     E remove(int index);

     E set(int index,E element);

     int size();

     E[] toArray();

     String toString();

     int indexOf(E element);

}
