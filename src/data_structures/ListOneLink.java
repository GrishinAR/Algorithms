package data_structures;


public class ListOneLink<E> implements Data<E> {
    private Node<E> bottom;
    private Node<E> current;
    private Node<E> element;

    private int size;

    @Override
    public E add(E e) {
        element =  new Node<>(e, null);
        if(size == 0) {
            bottom = element;
        } else {
            current.next = element;
        }
        current = element;
        size++;
        return element.value;
    }

    @Override
    public E get() {
        if(size == 0) {
            throw new IndexOutOfBoundsException("Пустой лист");
        }
        Node<E> element = bottom;
        E value = current.value;
        while(element != null) {
            if(element.next == current) {
                element.next = null;
                current = element;
            }
            element = element.next;
        }
        size--;
        return value;
    }

    @Override
    public E[] toArray() {
        if(size == 0) {
            return null;
        }
        Object[] elements;
        elements = new Object[size];
        Node<E> element = bottom;
        int i = 0;
        while(element != null) {
            elements[i] = element.value;
            element = element.next;
            i++;
        }
        return (E[])elements;
    }

    @Override
    public int size() {
        return size;
    }

    /**
     * Вложенный класс предназначен для реализации элемента.
     */
    private static class Node<E> {
        E value;
        Node next;

        public Node(E value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
