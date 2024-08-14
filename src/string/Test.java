package string;

public class Test {
    public static void main(String[] args) {
        String x = new String("fj11");
        String y = new String("fj11");

        if (x == y) {
            System.out.println("referencia para o mesmo objeto");
        } else {
            System.out.println("Nao referencia para o mesmo objeto");
        }

        if (x.equals(y)) {
            System.out.println("referencia para o mesmo objeto");
        } else {
            System.out.println("Nao referencia para o mesmo objeto");
        }

        String word = "fj11";
        word = word.toUpperCase();
        System.out.println(word);
    }
}
