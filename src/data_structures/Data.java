package data_structures;

/**
 * Итерфейс для различных структр данных.
 *
 * @param <E> тип элементов списка
 * @author Grishin A.R.
 * @see ListOneLink
 * @see ListTwoLink
 * @see ListCircleLink
 *
 */
public interface Data<E> {

    /**
     * Функция для добавления элемента в структуру данных.
     *
     * @param e элемент для вставки в структуру данных
     * @return вернёт вставляемый элемент
     *
     */
    E add(E e);

    /**
     * Функция для получения элемента из структуры данных и удаления его.
     *
     * @return вернёт элемент из структуры.
     *
     */
    E get();

    /**
     * Функция формирует массив с данными.
     *
     * @return вернёт массив элементов из структуры
     *
     */
    E[] toArray();

    /**
     * Функция возвращает количество элементов.
     *
     * @return размер
     *
     */
    int size();
}
