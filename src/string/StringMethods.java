package string;

public class StringMethods {
    public static void main(String[] args) {
        String str1 = "fj11";
        String str2 = "Socorram-me, subi no ônibus em Marrocos";

        String newString = reverse(str1);

        System.out.println(newString);

        String newString2 = reverse(str2);

        System.out.println(newString2);


        // Converte str1 para maiúsculas e substitui '1' por '3'
        str1 = str1.toUpperCase().replace("1", "3");
        System.out.println(str1);  // Imprime: FJ33

        // Imprime o caractere na posição 2 de str1 (começando de 0)
        System.out.println(str1.charAt(2));  // Imprime: 3

        // Imprime o comprimento (length) de str1
        System.out.println(str1.length());  // Imprime: 4

        // Imprime a substring de str1 começando na posição 2
        System.out.println(str1.substring(2));  // Imprime: 33

        // Imprime o índice da primeira ocorrência de "3" em str1
        System.out.println(str1.indexOf("3"));  // Imprime: 2

        // Verifica se str1 contém str2 e imprime "True" ou "False"
        if (str1.contains(str2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if (!str2.isEmpty()) {
            System.out.println("Not is empty");
        } else {
            System.out.println("is empty");
        }

        printLinePerLine(str1);
    }

    public static void printLinePerLine(String word) {
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
    }

    public static String reverse(String str) {
        char[] chars = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            start++;
            end--;
        }

        return new String(chars);
    }

    public static String reverseWithSB(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

}
