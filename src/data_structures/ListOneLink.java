package data_structures;


public class ListOneLink<E> extends AbstractList<E> {
    Node<E> head = null;

    private static class Node<E> {
        E value;
        Node next;

        public Node(E value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
