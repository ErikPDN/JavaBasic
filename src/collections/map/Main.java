package collections.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Apple"); // Duplicatas não são permitidas, então "Apple" não será adicionado novamente
        System.out.println(hashSet);

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Apple", 1);
        hashMap.put("Banana", 2);
        hashMap.put("Apple", 3); // O valor associado à chave "Apple" será sobrescrito para 3
        System.out.println(hashMap);

        Map<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("Apple", 1);
        hashtable.put("Banana", 2);
        // hashtable.put(null, 3); // Lançará NullPointerException
        System.out.println(hashtable);

    }
}
