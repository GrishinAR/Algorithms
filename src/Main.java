import data_structures.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();
        for (int i = 0; i < 3; i++) {
            list.add(i);
        }
        list.get();
        list.get();
        list.get();
        System.out.println(Arrays.toString(list.toArray()));

    }
}
