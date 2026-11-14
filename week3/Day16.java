// Predict the output.
//         int[] numbers = {2, 4, 6, 8};

//         for (int number : numbers) {
//             System.out.print(number + " ");
//         }
//         System.out.println();
//         for (int number : numbers) {
//             number = number * 2;
//             System.out.print(number + " ");
//         }
//         System.out.println();
//         for (int i = 0; i < numbers.length; i++) {
//             numbers[i] = numbers[i] * 2;
//         }
//         for (int number : numbers) {
//             System.out.print(number + " ");
//         }
// What is the output of the first enhanced for loop?
// -> 2 4 6 8
// What is the output of the second enhanced for loop?
// -> 4 8 12 16
// What is the output of the final enhanced for loop?
// -> 4 8 12 16
// Why didn't the second loop modify the original array?
// -> Because we used for each loop or enhanced for loop which gets the copy of the array element not the exact values even though we modify the values but modification happened on the copy not the original values and also in enhanced for loop we can not access index.
// Why did the normal for loop successfully modify the original array?
// -> Normal for loop has access to the index values of the array through which we can modify the elements in the array since in enhanced for we don't have access to indices

public class Day16 {

    public static void main(String[] args) {

        System.out.println("Task 1 - Print array elements");
        int[] numbers = {5, 10, 15, 20, 25};
        int sum = 0;
        double average = 0;
        int evenNumber = 0;
        int oddNumber = 0;

        for (int number : numbers) {
            System.out.println(number);
            sum += number;
            if (number % 2 == 0) {
                evenNumber++;
            } else {
                oddNumber++;
            }
        }

        System.out.println("Task 2 - Calculate the sum");
        System.out.println("Sum:- " + sum);

        System.out.println("Task 3 - Calculate the average");
        average = (double) sum / (double) numbers.length;
        System.out.println("Average:- " + average);

        System.out.println("Task 4 - Count even and odd numbers");
        System.out.println("Even Numbers:- " + evenNumber);
        System.out.println("Odd Numbers:- " + oddNumber);

        System.out.println("Task 5 - Compare normal and enhanced for loops");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= 2;
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
