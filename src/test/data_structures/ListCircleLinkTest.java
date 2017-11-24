package test.data_structures;

import data_structures.ListCircleLink;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ListCircleLinkTest {
    private ListCircleLink<Integer> list = new ListCircleLink<>();
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

    @DisplayName("Проверка runningInRound")
    @Test
    public void testRunningInRound() {
        Object[] r = list.runningInCircle(1200);
        assertEquals(new Integer(0), r[200]);
    }
}