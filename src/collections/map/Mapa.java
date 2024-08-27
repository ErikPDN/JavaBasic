package collections.map;

import banco.contas.ContaCorrente;
import banco.contas.ContaPoupanca;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente("Erik", 1000, "12");
        c1.depositar(100000);

        ContaCorrente c2 = new ContaCorrente("Maria", 1000, "14");
        c2.depositar(100);

        // Create Map
        Map<String, ContaCorrente> accountMap = new HashMap<>();

        accountMap.put("Director", c1);
        accountMap.put("Manager", c2);

        ContaCorrente contaCorrenteDirector = accountMap.get("Director");
        System.out.println(contaCorrenteDirector.getSaldo());
        ContaCorrente contaCorrenteManager = accountMap.get("Manager");
        System.out.println(contaCorrenteManager.getSaldo());
    }
}
