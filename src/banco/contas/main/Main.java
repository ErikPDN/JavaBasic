package banco.contas.main;

import banco.contas.Banco;
import banco.contas.ContaCorrente;

public class Main {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente("Erik", 10000, "1");
        ContaCorrente c2 = new ContaCorrente("Maria", 20000, "2");
        ContaCorrente c3 = new ContaCorrente("Erik", 10000, "1");

        Banco banco = new Banco();
        banco.adicionarConta(c1);
        banco.adicionarConta(c2);
        banco.adicionarConta(c3);

        System.out.println(banco.getContas());
    }
}
