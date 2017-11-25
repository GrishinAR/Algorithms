package test.data_structures;

import data_structures.Queue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    private Queue<Integer> list = new Queue<>();
    private Integer[] result = new Integer[100];

    @BeforeEach
    public void init() {
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        int j = 0;
        for (int i = 99; i >= 0 ; i--) {
            result[j] = i;
            j++;
        }
    }

    @DisplayName("Проверка get")
    @Test
    public void testGet() throws Exception {
        for (int i = 0; i < 100; i++) {
            list.get();
        }
        assertEquals(0, list.size());
    }

    @DisplayName("Проверка add")
    @Test
    public void testAdd() throws Exception {
        assertArrayEquals(result, list.toArray());
    }
}