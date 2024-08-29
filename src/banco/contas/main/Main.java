package banco.contas.main;

import banco.contas.Banco;
import banco.contas.Conta;
import banco.contas.ContaCorrente;
import banco.contas.RepositorioDeContas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente("Erik", 10000, "1");
        ContaCorrente c2 = new ContaCorrente("Maria", 20000, "2");
        ContaCorrente c3 = new ContaCorrente("Erik", 10000, "1");

        List<Conta> listaContas = new ArrayList<>();
        listaContas.add(c1);
        listaContas.add(c2);
        listaContas.add(c3);

        Banco banco = new Banco();
        banco.adicionarConta(c1);
        banco.adicionarConta(c2);
        banco.adicionarConta(c3);

        RepositorioDeContas repo = new RepositorioDeContas();
        repo.salva(listaContas);
//        System.out.println(banco.getContas());

        System.out.println(repo.carrega());
    }
}
