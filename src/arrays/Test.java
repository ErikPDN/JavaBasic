package arrays;

public class Test {
    public static void main(String[] args) {
        int[] idades = new int[11];
        for (int i = 0; i < idades.length; i++) {
            idades[i] = i * 10;
        }

        for (int j = 0; j < idades.length; j++) {
            System.out.println(idades[j]);
        }

    }
}
