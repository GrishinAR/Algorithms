package data_structures;

/**
 * Реализация стека.
 *
 * @author Grishin A.R.
 *
 */
public class Stack<E> implements Data<E> {
    Node<E> bottom;
    Node<E> element;

    int size;

    @Override
    public E add(E e) {
        if(size == 0) {
            element = new Node<>(e, null);
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
        } else if(size == 1) {
            bottom = null;
            size--;
            return null;
        } else {
            bottom = bottom.next;
        }
        size--;
        return bottom.value;
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
