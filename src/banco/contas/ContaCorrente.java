package banco.contas;

public class ContaCorrente extends Conta{
    private double limite;
    
    public ContaCorrente(String titular, double saldo, String num, double limite) {
        super(titular, saldo, num);
        this.limite = limite;
    }

    public ContaCorrente(String titular, double saldo, String num) {
        super(titular, saldo, num);
        this.limite = limite;
    }

    // public int compareTo(ContaCorrente other) {
    //     return Double.compare(this.getSaldo(), other.getSaldo()); 
    // }
    
    public double getLimite() {
        return limite;
    }
    
    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && (saldo + limite) >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "Titular: " + titular + ", Número da Conta: " + numConta + ", Saldo: R$ " + saldo + ", Limite: R$ " + limite;
    }
    
    
}
