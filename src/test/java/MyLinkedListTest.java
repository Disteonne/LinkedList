import linkedList.MyLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    private MyLinkedList<Integer> linkedList=new MyLinkedList<>();
    @Test
    void add() {
        for (int i = 0; i < 10; i++) {
            linkedList.add(i);
        }
        assertEquals(10,linkedList.size());
    }

    @Test
    void testAdd() {
        add();
        linkedList.add(11);
        assertEquals(11,linkedList.size());
    }

    @Test
    void clear() {
        add();
        linkedList.clear();
        assertEquals(0,linkedList.size());
    }

    @Test
    void get() {
        add();
        assertEquals(7,linkedList.get(7));
    }

    @Test
    void remove() {
        add();
        linkedList.remove(3);
        assertEquals(4,linkedList.get(3));
    }

    @Test
    void set() {
        add();
        linkedList.set(4,9999);
        assertEquals(9999,linkedList.get(4));
    }

    @Test
    void size() {
        set();
        assertEquals(11,linkedList.size());
    }

    @Test
    void toArray() {
        MyLinkedList<String> listString=new MyLinkedList<>(String.class);
        listString.add("One");
        listString.add("Two");
        String[] array=listString.toArray();
        assertEquals("Two",array[1]);
    }

    @Test
    void testToString() {
        add();
        assertEquals("{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}",linkedList.toString());
    }

    @Test
    void indexOf() {
        set();
        assertEquals(4,linkedList.indexOf(9999));
    }
}