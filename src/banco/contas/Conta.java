package banco.contas;

import java.util.Objects;

public abstract class Conta implements Comparable<Conta>{
    protected String titular;
    protected double saldo;
    protected String numConta;

    public Conta(String titular, double saldo, String num) {
        this.titular = titular;
        this.saldo = saldo;
        this.numConta = num;
    }

    @Override
    public int compareTo(Conta otherConta) {
        return this.getTitular().compareTo(otherConta.getTitular());
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numConta;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void transferir(double valor, Conta destino) {
        if (sacar(valor)) {
            destino.depositar(valor);
        }
    }


    @Override
    public boolean equals(Object obj) {
        // Verifica se o objeto é o mesmo
        if (this == obj) return true;

        // Verifica se o objeto é da mesma classe
        if (obj == null || getClass() != obj.getClass()) return false;

        // Faz o cast do objeto para a classe Conta
        Conta otherConta = (Conta) obj;

        // Compara os números das contas para verificar se são iguais
        return Objects.equals(numConta, otherConta.numConta) &&  Objects.equals(titular, otherConta.titular);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titular, numConta);
    }


    @Override
    public String toString() {
        return "Titular: " + titular + ", Número da Conta: " + numConta + ", Saldo: R$ " + saldo;
    }
}
