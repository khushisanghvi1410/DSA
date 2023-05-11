public class FiboonacciSeries {
    public static void main(String args[]) {
        // 0 1 1 2 3 5 8 13
        int a = 0;
        int b = 1;

        int n = 7;

        int number = 0;
        for (int i = 2; i < n; i++) {
            number = a + b;
            a = b;
            b = number;
        }

        System.out.println(number);
    }
}