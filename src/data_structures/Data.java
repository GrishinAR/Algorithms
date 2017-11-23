package data_structures;

public interface Data<E> {
    E add(E e);
    E remove();
    E[] toArray();
    int size();
}
