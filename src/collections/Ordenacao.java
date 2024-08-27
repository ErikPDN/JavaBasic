package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.random.*;

import banco.contas.*;

public class Ordenacao {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente("João", 1000, "123", 500);
        ContaCorrente c2 = new ContaCorrente("Maria", 2000, "456", 1000);
        ContaCorrente c3 = new ContaCorrente("José", 1500, "789", 700);

        List<ContaCorrente> contas = new ArrayList<>();
        contas.add(c1);
        contas.add(c2);
        contas.add(c3);
        
        System.out.println(contas); // ordena pelo numero da conta

        Collections.sort(contas);

        System.out.println(contas);
    }
}