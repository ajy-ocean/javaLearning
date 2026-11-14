
public class Day13 {

    public static void main(String[] args) {

        System.out.println("Pattern 1 - Right-aligned triangle");
        int n = 4;

        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < 2 * (n - i); j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Pattern 2 — Number triangle");
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }

        System.out.println("Pattern 3 — Repeated number sequence");
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        System.out.println("Pattern 4 — Reverse number triangle");
        for (int i = n; i >= 1; i--){

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
