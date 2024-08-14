package arrays;

public class TestSplit {
    public static void main(String[] args) {
        String str1 = "Socorram-me, subi no ônibus em Marrocos";
        String[] str2 = str1.split(" ");

        String[] str3 = reverseArray(str2);
        for (String s : str3) {
            System.out.print(s + " ");
        }
    }

    public static String[] reverseArray(String[] arr) {
        String[] reversed = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }

        return reversed;
    }
}
