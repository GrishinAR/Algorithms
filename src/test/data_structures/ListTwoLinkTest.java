package test.data_structures;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import data_structures.ListTwoLink;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ListTwoLinkTest {
    private ListTwoLink<Integer> list = new ListTwoLink<>();
    private Integer[] result = new Integer[100];

    @BeforeEach
    public void init() {
        for (int i = 0; i < 100; i++) {
            list.add(i);
            result[i] = i;
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