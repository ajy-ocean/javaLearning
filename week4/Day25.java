
public class Day25 {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static void showResult(String operation, double result) {
        System.out.println("operation:- " + operation);
        System.out.println("result:- " + result);
    }

    public static void main(String[] args) {

        int add = add(2, 3);
        showResult("Addition", add);

        int subtract = subtract(3, 5);
        showResult("Subtraction", subtract);

        int multiply = multiply(2, 10);
        showResult("Multiplication", multiply);

        double divide = divide(10, 5);
        showResult("Division", divide);
    }
}
