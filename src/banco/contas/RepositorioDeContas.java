package banco.contas;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepositorioDeContas {
    private List<Conta> contas;

    public RepositorioDeContas() {
        contas = new ArrayList<Conta>();
    }

    public void salva(List<Conta> contas) {
        try (PrintStream out = new PrintStream("contas.txt")) {
            for (Conta conta : contas) {
                String linha = String.format("%s,%s,%s,%.2f",
                        conta.getClass().getSimpleName(), // Tipo de conta (ContaCorrente, etc.)
                        conta.getNumeroConta(), // Número da conta
                        conta.getTitular(), // Titular da conta
                        conta.getSaldo()); // Saldo da conta

                out.println(linha);  // Escreve a linha no arquivo
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public List<Conta> carrega() {
        List<Conta> contas = new ArrayList<>();

        try(Scanner scanner = new Scanner(new File("contas.txt"))) {
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                Conta conta = getConta(linha);

                if (conta != null) {
                    contas.add(conta);
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return contas;
    }

    private static Conta getConta(String linha) {
        String[] split = linha.split(",");
        String tipoConta = split[0];
        String numeroConta = split[1];
        String titular = split[2];
        double saldo = Double.parseDouble(split[3]);

        Conta conta = null;
        if (tipoConta.equals("ContaCorrente")) {
            conta = new ContaCorrente(titular, saldo, numeroConta);
        } else if (tipoConta.equals("ContaPoupanca")) {
            conta = new ContaPoupanca(titular, saldo, numeroConta);
        }
        return conta;
    }
}
