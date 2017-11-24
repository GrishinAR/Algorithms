package data_structures;

public class ListCircleLink<E> implements Data<E> {
    private Node<E> bottom;
    private Node<E> current;
    private Node<E> element;

    private int size;

    @Override
    public E add(E e) {
        if (size == 0) {
            element = new Node<>(e, null);
            bottom = element;
        } else {
            element = new Node<>(e, bottom);
            current.next = element;
        }
        current = element;
        size++;
        return element.value;
    }

    @Override
    public E get() {
        if (size == 0) {
            throw new IndexOutOfBoundsException("Пустой лист");
        }

        return null;
    }

    @Override
    public E[] toArray() {
        if (size == 0) {
            return null;
        }
        Object[] elements;
        elements = new Object[size];
        Node<E> element = bottom;
        for (int i = 0; i < elements.length; i++) {
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
     * Метод перебирает по кругу элементы.
     *
     * @param step количество шагов
     * @return массив отобранных элементов
     */
    public E[] runningInCircle(int step) {
        if(size <= 1) {
            throw new IndexOutOfBoundsException("Мало элементов в листе");
        }
        Object[] elements = new Object[step];
        Node<E> element = bottom;
        for (int i = 0; i < step; i++) {
            elements[i] = element.value;
            element = element.next;
        }
        return (E[])elements;
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