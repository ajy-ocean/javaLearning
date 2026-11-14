// Prediction exercise

//         int[][] numbers = {
//             {2, 4, 6},
//             {8, 10, 12}
//         };
//         System.out.println(numbers[0][1]);
//         System.out.println(numbers[1][2]);
//         for (int i = 0; i < numbers.length; i++) {
//             for (int j = 0; j < numbers[i].length; j++) {
//                 System.out.print(numbers[i][j] + " ");
//             }
//             System.out.println();
//         }
// What is the output of numbers[0][1]?
// -> 4
// What is the output of numbers[1][2]?
// -> 12
// How many times does the outer loop execute?
// -> 2
// How many times does the inner loop execute in total?
// -> 6
// What is the difference between numbers.length and numbers[i].length?
// -> so in general length return the length of the array but in our case its different for our understanding it returns number of column in that ith position but in reality it return the length of the array in that index position.

public class Day20 {

    public static void main(String[] args) {
        int[][] marks = {
            {80, 75, 90},
            {65, 85, 70},
            {95, 88, 92}
        };
        int sum = 0;
        double average = 0;
        int totalCount = 0;
        int largestElement = marks[0][0];

        System.out.println("Print the entire matrix in row-and-column format.");
        for (int i = 0; i < marks.length; i++) {

            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
                sum += marks[i][j];

                if (largestElement < marks[i][j]) {
                    largestElement = marks[i][j];
                }
            }

            System.out.println();
        }

        System.out.println("Number of rows:- " + marks.length);
        System.out.println("Number of columns:- " + marks[0].length);
        System.out.println("Element at row index 1, column index 2:- " + marks[1][2]);

        System.out.println("Sum of all elements:- " + sum);

        for (int i = 0; i < marks.length; i++) {
            totalCount += marks[i].length;
        }
        average = (double) sum / (double) totalCount;
        System.out.println("Average of all elements:- " + average);
        System.out.println("Largest element in the entire matrix:- " + largestElement);
        
    }
}
