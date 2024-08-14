package fibonacci;

public class FibonacciPorMemorizacao {
    public static void main(String[] args) {
        int n = 10; // Exemplo: calcular o 10º número de Fibonacci
        System.out.println("Fibonacci de " + n + " é: " + fibonacci(n));
    }

    public static int fibonacciPorMemorizacao(int n, int[] memo) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        if (memo[n] != -1) return memo[n];

        // Calcula o valor e armazena no array
        memo[n] = fibonacciPorMemorizacao(n - 1, memo) + fibonacciPorMemorizacao(n - 2, memo);
        return memo[n];
    }

    // Método auxiliar para inicializar o array de memoização
    public static int fibonacci(int n) {
       int[] memo = new int[n + 1];
       for (int i = 0; i <= n; i++) {
           memo[i] = -1;
       }

       return fibonacciPorMemorizacao(n, memo);
    }
}
