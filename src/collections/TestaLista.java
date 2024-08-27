package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import banco.contas.ContaCorrente;

public class TestaLista {
    public static void main(String[] args) {
        List<ContaCorrente> listaDeContas = new LinkedList<>();
        Random random = new Random();

        // Cria 10 contas com saldos aleatórios entre 0 e 10000
        for (int i = 0; i < 10; i++) {
            double saldoAleatorio = random.nextInt(10001); // Gera um valor entre 0 e 10000
            ContaCorrente conta = new ContaCorrente("Cliente " + (i + 1), saldoAleatorio, "00" + (i + 1), 500.0);
            listaDeContas.add(conta);
        }

        // Exibe as contas criadas
        for (ContaCorrente conta : listaDeContas) {
            System.out.println(conta);
        }
    }
}
