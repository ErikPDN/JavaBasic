package collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Conjunto {
    public static void main(String[] args) {
        Set<Camisa> set = new HashSet<>();

        Camisa camisaAzul = new Camisa("azul", 12);
        Camisa camisaAzul2 = new Camisa("azul", 12);
        Camisa camisaVerde = new Camisa("verde", 14);

        System.out.println(set.add(camisaAzul));
        System.out.println(set.add(camisaAzul2));
        System.out.println(set.add(camisaVerde));

        for (Camisa camisa : set) {
            System.out.println(camisa);
        }

        Iterator<Camisa> i = set.iterator();
        while (i.hasNext()) {
            Camisa camisa = i.next();
            System.out.println(camisa);
        }
    }
}

