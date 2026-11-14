
public class Day26 {

    public static int calculate(int a, int b) {
        return a + b;
    }

    public static double calculate(double a, double b) {
        return a + b;
    }

    public static int calculate(int a, int b, int c) {
        return a + b + c;
    }

    public static double calculate(int a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println("Sum of two integers: " + calculate(12, 45));
        System.out.println("Sum of two doubles: " + calculate(19.7, 42.6));
        System.out.println("Sum of three integers: " + calculate(20, 42, 10));
        System.out.println("Sum of int and double: " + calculate(5, 10.0));

    }
}
