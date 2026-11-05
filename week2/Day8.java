
public class Day8 {

    public static void main(String[] args) {

        System.out.println("Print numbers from 1 to 10.");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Print numbers from 10 down to 1.");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Print only even numbers from 2 to 20.");
        for (int i = 2; i <= 20; i += 2) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Calculate the sum of numbers from 1 to 10 and print the result.");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println("sum of numbers from 1 to 10:- " + sum);
    }
}

