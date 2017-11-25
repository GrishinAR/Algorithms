package data_structures;

/**
 * Реализация очереди.
 *
 * @author Grishin A.R.
 *
 */
public class Queue<E> implements Data<E> {
    Node<E> bottom;
    Node<E> top;
    Node<E> element;

    int size;

    @Override
    public E add(E e) {
        if(size == 0) {
            element = new Node<>(e, null);
            top = element;
        } else {
            element = new Node<>(e, bottom);
        }
        bottom = element;
        size++;
        return element.value;
    }

    @Override
    public E get() {
        if(size == 0) {
            throw new IndexOutOfBoundsException("Пустой лист");
        }
        Node<E> element = bottom;
        E value = top.value;
        while(element != null) {
            if(element.next == top) {
                element.next = null;
                top = element;
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
