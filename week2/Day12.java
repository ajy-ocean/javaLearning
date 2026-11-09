// Predict the output without running this code:
// for (int i = 1; i <= 3; i++) {

//     for (int j = 1; j <= 3; j++) {
//         System.out.print("* ");
//     }
//     System.out.println();
// }
// -> * * *
//    * * *
//    * * *
// How many times does the outer loop execute?
// -> three times for i = 1, 2, 3
// How many times does the inner loop execute in total?
// -> 9 times for each i iteration j iteration runs for 3 times so 3 * 3 is 9.
// Why is System.out.println() placed outside the inner loop but inside the outer loop?
// -> because System.out.print, prints everything in a single line to move to next line we use println since after third iteration of j we need to move to next row for  we use this println if we don't use this println all the stars * will be printed in a single line.

// Predict the output:
// for (int i = 1; i <= 3; i++) {

//     for (int j = 1; j <= i; j++) {

//         System.out.print(j + " ");

//     }

//     System.out.println();
// }
// -> 1 
//    1 2 
//    1 2 3

// How many times does the inner loop execute in total?
// -> 6 times

// What will happen if we change: j <= i, j <= 3 Explain the difference.
// -> if we change the condition of inner loop to j <= 3 that means now j is not dependent on the value of i and is dependent on 3 which will results such that in each line 1, 2, 3 will be printed for 4 rows basically in each row same value will be printed

public class Day12 {

    public static void main(String[] args) {

        System.out.println("Square pattern");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Increasing triangle");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Decreasing triangle");
        for (int i = 4; i >= 1; i--){
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Number pattern");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
