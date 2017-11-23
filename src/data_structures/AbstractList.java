package data_structures;

public abstract class AbstractList<E> implements Data<E> {
    private int size;

    @Override
    public E add(E e) {
        size++; 
        return null;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E[] toArray() {
        return new E[0];
    }

    @Override
    public int size() {
        return size;
    }

}
