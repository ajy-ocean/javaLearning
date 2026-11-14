// Prediction exercise

//         int[] numbers = {4, 2, 3};
//         for (int i = 0; i < numbers.length - 1; i++) {
//             for (int j = 0; j < numbers.length - 1 - i; j++) {
//                 if (numbers[j] > numbers[j + 1]) {
//                     int temp = numbers[j];
//                     numbers[j] = numbers[j + 1];
//                     numbers[j + 1] = temp;
//                 }
//             }
//         }
//         for (int number : numbers) {
//             System.out.print(number + " ");
//         }
// What is the final output?
// -> [2, 3, 4]
// How many times does the outer loop execute?
// -> 2
// How many times does the inner loop execute in total?
// -> 2
// Why do we use numbers[j] > numbers[j + 1]?
// ->  because we are sorting element in ascending order as we are comparing adjacent elements if first element is greater than second we swap.
// What would happen if we changed > to <?
// -> if we change then condition will be false and entire logic fails which results hampering our sorting of the array elements.

public class Day19 {

    public static void main(String[] args) {
        int[] numbers = {45, 12, 78, 23, 9, 56};
        int temp;

        System.out.println("Print the original array.");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("Sort the array in ascending order using Bubble Sort.");
        for (int i = 0; i < numbers.length - 1; i++) {

            for (int j = 0; j < numbers.length - 1 - i; j++) {

                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("Sort another array in descending order using Bubble Sort.");
        int[] descendingNumbers = {5, 122, 18, 34, 93, 69};

        for (int i = 0; i < descendingNumbers.length - 1; i++) {

            for (int j = 0; j < descendingNumbers.length - 1 - i; j++) {
                if (descendingNumbers[j] < descendingNumbers[j + 1]) {
                    temp = descendingNumbers[j];
                    descendingNumbers[j] = descendingNumbers[j + 1];
                    descendingNumbers[j + 1] = temp;
                }
            }
        }

        for (int number : descendingNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
