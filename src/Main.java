import data_structures.ListCircleLink;
import data_structures.ListOneLink;
import data_structures.ListTwoLink;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ListTwoLink<Integer> list = new ListTwoLink<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.get();
        list.get();
        list.add(3);
        System.out.println(Arrays.toString(list.toArray()));

    }
}
