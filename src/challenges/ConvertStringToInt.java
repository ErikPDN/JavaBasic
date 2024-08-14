package challenges;

public class ConvertStringToInt {
    public static void main(String[] args) {
        String x = "762";
        int result = 0;

        for (int i = 0; i < x.length(); i++) {
            int digit = x.charAt(i) - '0';

            result = result * 10 + digit;
        }

        System.out.println(result);

    }
}
