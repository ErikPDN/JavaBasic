package banco.contas;

public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(String titular, double saldo, String num, double taxa) {
        super(titular, saldo, num);
        taxaRendimento = taxa;
    }

    public ContaPoupanca(String titular, double saldo, String num) {
        super(titular, saldo, num);
    }

    public void aplicarRendimento() {
        double rendimento = getSaldo() * taxaRendimento;
        depositar(rendimento);
    }
}
