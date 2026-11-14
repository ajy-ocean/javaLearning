// Prediction exercise

//         int[][] numbers = {
//             {5, 10},
//             {15, 20, 25},
//             {30}
//         };
//         System.out.println(numbers.length);
//         System.out.println(numbers[0].length);
//         System.out.println(numbers[1].length);
//         System.out.println(numbers[2][0]);
//         int total = 0;
//         for (int i = 0; i < numbers.length; i++) {
//             for (int j = 0; j < numbers[i].length; j++) {
//                 total += numbers[i][j];
//             }
//         }
//         System.out.println(total);
// What is the output of numbers.length?
// -> 3
// What is the output of numbers[0].length?
// -> 2
// What is the output of numbers[1].length?
// -> 3
// What is the output of numbers[2][0]?
// -> 30
// What is the final value of total?
// -> 105
// Why do we use numbers[i].length instead of numbers[0].length in the inner loop?
// -> because we are learning jagged arrays and in these types of arrays the number of row and columns are not same they can be different if we use numbers[0].length we might get error or may an exception.

public class Day21 {
    public static void main(String[] args) {
        int[][] marks = {
            {80, 75},
            {65, 85, 70},
            {95},
            {88, 92, 76, 81}
        };
        int count = 0;
        int sum = 0;
        int largestMark = marks[0][0];

        System.out.println("Print all elements row by row.");
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
                count++;
                sum += marks[i][j];
                if (largestMark < marks[i][j]) {
                    largestMark = marks[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("Print the total number of rows:- " + marks.length);

        System.out.println("Print the number of elements in each row.");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i].length);
        }

        System.out.println("Calculate the total number of elements:- " + count);
        System.out.println("Calculate the sum of all marks:- " + sum);
        System.out.println("Calculate the average marks:- " + (double) sum / count);
        System.out.println("Find the largest mark.:- " + largestMark);

    }

}
