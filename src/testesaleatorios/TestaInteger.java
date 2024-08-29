package testesaleatorios;

public class TestaInteger {
    public static void main(String[] args) {
        Integer x1 = new Integer(10);
        Integer x2 = new Integer(10);

        // Verifica objeto
        if (x1 == x2) {
            System.out.println("igual");
        } else {
            System.out.println("diferente");
        }

        // Verifica se os valores dentro dos objetos são iguais
        if (x1.equals(x2)) {
            System.out.println("igual");
        } else {
            System.out.println("diferente");
        }
    }
}
