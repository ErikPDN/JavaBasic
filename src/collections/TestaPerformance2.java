package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestaPerformance2 {
    public static void main(String[] args) {
        System.out.println("Iniciando...");
        long init = System.currentTimeMillis();

        List<Integer> test = new LinkedList<>();

        for (int i = 0; i < 30000; i++) {
            test.add(0, i);
        }

        long end = System.currentTimeMillis();

        // Time spend using ArrayList: 48ms
        // Time spend using LinkedList: 5ms
        System.out.println("Total time: " + (end - init) + "ms");
    }
}
