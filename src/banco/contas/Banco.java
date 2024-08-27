package banco.contas;

import java.util.*;

public class Banco {
    private List<Conta> contas;
    private Map<String, Conta> contasPorTitular;

    public Banco() {
        contas = new ArrayList<>();
        contasPorTitular = new HashSet<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
        contasPorTitular.put(conta.getTitular(), conta);
    }

    public void removerConta(Conta conta) {
        contas.remove(conta);
        contasPorTitular.remove(conta.getTitular());
    }

    public List<Conta> getContas() {
        return contas;
    }

    public int getQuantidadeContas() {
        return contas.size();
    }

    public Conta getConta(Conta conta) {
        for (Conta account : contas) {
            if (account.equals(conta)) {
                return account;
            }
        }
        return null;
    }

    public boolean buscaPorTitular(String titular) {
        for (Conta conta : contas) {
            if (conta.getTitular().equals(titular)) {
                return true;
            }
        }
        return false;
    }

    public Conta getContaPorTitular(String titular) {
        return contasPorTitular.get(titular);
    }

}
