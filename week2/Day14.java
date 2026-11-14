// Predict the output without running this code:

public class Day14 {

    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }

            System.out.println();
        }

        System.out.println("How many times does the first inner loop execute in total?:- " + 6 + " times");

        System.out.println("How many times does the second inner loop execute in total?:- " + 10 + " times");

        System.out.println("Why are there two separate inner loops?:- one inner manages the spaces from left side and second inner loop prints the number + space");
    }
}
