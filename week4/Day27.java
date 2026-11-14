
public class Day27 {

    public static void printNumbers(int n) {

        if (n == 0) {
            return;
        }

        System.out.println(n);

        printNumbers(n - 1);

    }

    public static int factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static int sum(int n) {

        if (n == 0) {
            return n;
        }

        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        printNumbers(5);
        System.out.println(factorial(5));
        System.out.println(sum(5));
    }
}
