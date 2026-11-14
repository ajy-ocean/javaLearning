// Prediction exercise
// public class Day17 {

//     public static void main(String[] args) {
//         int[] a = {5, 10, 15};
//         int[] b = a;
//         b[1] = 50;
//         System.out.println(a[1]);
//         System.out.println(b[1]);
//         int[] c = {100, 200, 300};
//         b = c;
//         b[0] = 999;
//         System.out.println(a[0]);
//         System.out.println(b[0]);
//         System.out.println(c[0]);
//     }
// }
// What are the five lines of output?
// ->
// System.out.println(a[1]); -> 50
// System.out.println(b[1]); -> 50
// System.out.println(a[0]); -> 5
// System.out.println(b[0]); -> 999
// System.out.println(c[0]); -> 999
// After int[] b = a;, do a and b refer to the same array?
// -> yes
// After b = c;, which array does b refer to?
// -> c's array
// Why does changing b[0] to 999 also change c[0]?
// -> because b and c points to same array or reference because b = c we did assign c to b
// Does changing b[0] affect a[0] after b = c; ?
// -> No, because b and a are pointing to different array or reference so changing one array element doesn't effect others.
import java.util.Arrays;

public class Day17 {

    public static void main(String[] args) {
        System.out.println("Task 1 - Reference assignment");
        int[] original = {10, 20, 30, 40, 50};
        int[] reference = original;

        System.out.println("Task 2 - Modify through reference");
        reference[1] = 99;
        System.out.println(original[1]);
        System.out.println(reference[1]);

        System.out.println("Task 3 - Independent copy");
        int[] copy = Arrays.copyOf(original, original.length);

        System.out.println("Task 4 - Modify independent copy");
        copy[0] = 500;
        System.out.println(original[0]);
        System.out.println(copy[0]);

        System.out.println("Task 5 — Print all three arrays");
        System.out.println("Original");
        for (int number : original) {
            System.out.println(number);
        }

        System.out.println("Reference");
        for (int number : reference) {
            System.out.println(number);
        }

        System.out.println("Copy");
        for (int number : copy) {
            System.out.println(number);
        }
    }
}
