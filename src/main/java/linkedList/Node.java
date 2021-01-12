package linkedList;

public class Node<E> {
    protected E element;
    protected Node<E> nextNode;
    protected Node<E> lastNode;

    public Node(E element, Node<E> nextNode, Node<E> lastNode) {
        this.element = element;
        this.nextNode = nextNode;
        this.lastNode = lastNode;
    }

    public Node(E element) {
        this.element = element;
    }

    public E getElement() {
        return element;
    }

    public Node<E> getNextNode() {
        return nextNode;
    }

    public Node<E> getLastNode() {
        return lastNode;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public void setNextNode(Node<E> nextNode) {
        this.nextNode = nextNode;
    }

    public void setLastNode(Node<E> lastNode) {
        this.lastNode = lastNode;
    }
}
