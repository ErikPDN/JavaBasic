package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerfomance {
    public static void main(String[] args) {
        System.out.println("Iniciando...");
        Collection<Integer> teste = new HashSet<>();
        long init = System.currentTimeMillis();

        int total = 50000;

        // Insertion (O(1) in ArrayList)
        // Insertion (O(1) in HashSet or O(n) on worst case)
        for (int i = 0; i < total; i++) {
            teste.add(i);
        }

        // Search (O(n) in ArrayList)
        // Search (O(1) in HashSet)
        for (int i = 0; i < total; i++) {
            teste.contains(i);
        }

        long end = System.currentTimeMillis();

        // HashSet = 9ms
        // ArrayList = 430ms
        System.out.println("Total time: " + (end - init) + "ms");
    }
}
