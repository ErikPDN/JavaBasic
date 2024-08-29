package threads;

public class Main {
    public static void main(String[] args) {
        Programa p1 = new Programa();
        p1.setId(1);

        Thread t1 = new Thread(p1);
        t1.start();

        Programa p2 = new Programa();
        p2.setId(2);

        Thread t2 = new Thread(p2);
        t2.start();

        // Usando lambda
        Runnable r = () -> {
            for(int i = 0; i < 10000; i++) {
                System.out.println("programa: 3 valor: " + i);
            }
        };

        Thread t3 = new Thread(r);
        t3.start();

        // Passando a func lambda direto para o construtor
        new Thread(() -> {
            for(int i = 0; i < 10000; i++) {
                System.out.println("programa: 4 valor: " + i);
            }
        }).start();
    }
}
