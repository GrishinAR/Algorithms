package data_structures;

/**
 * Реализация двухсвязного списка. Для наглядности toArray идёт по ссылке prev,
 * из-за этого вывод будет в обратном порядке.
 *
 * @author Grishin A.R.
 *
 */
public class ListTwoLink<E> implements Data<E> {
    private Node<E> bottom;
    private Node<E> top;
    private Node<E> element;

    private int size;

    @Override
    public E add(E e) {
        if(size == 0) {
            element =  new Node<>(null, e, null);
            bottom = element;
        } else {
            element =  new Node<>(top, e, null);
            top.next = element;
        }
        top = element;
        size++;
        return element.value;
    }

    @Override
    public E get() {
        if(size == 0) {
            throw new IndexOutOfBoundsException("Пустой лист");
        }
        E returnElement = top.value;
        if(size > 1) {
            top.prev.next = null;
            top = top.prev;
        } else {
            top = null;
            bottom = null;
        }
        size--;
        return returnElement;
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
        Node prev;

        public Node(Node prev, E value, Node next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
    }
}
