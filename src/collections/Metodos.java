package collections;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Metodos {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(Arrays.asList(1, 4, 10, 22, 44, 35));
       

        System.out.println("Metodos: ");
        System.out.println("MAX: " + Collections.max(lista));
        System.out.println("MIN: " + Collections.min(lista));
        System.out.println("BINARY SEARCH(44): " + Collections.binarySearch(lista, 44));
        Collections.reverse(lista);
        System.out.println("REVERSE: " + lista);

        Collections.shuffle(lista);
        System.out.println("Lista embaralhada: " + lista);

        Collections.rotate(lista, 2);  // Rotaciona 2 posições para a direita
        System.out.println("Lista rotacionada para a direita: " + lista);

        Collections.rotate(lista, -3);  // Rotaciona 3 posições para a esquerda
        System.out.println("Lista rotacionada para a esquerda: " + lista);
    }
}
