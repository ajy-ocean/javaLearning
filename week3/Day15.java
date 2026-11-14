// int[] numbers = {10, 20, 30, 40, 50};

// System.out.println(numbers[0]);
// System.out.println(numbers[3]);
// numbers[1] = 99;
// System.out.println(numbers[1]);
// System.out.println(numbers.length);
// for (int i = 0; i < numbers.length; i++) {
//         System.out.print(numbers[i] + " ");
// }
// What are the five lines of output, including the final loop output?
// ->
// System.out.println(numbers[0]); -> 10
// System.out.println(numbers[3]); -> 40
// System.out.println(numbers[1]); -> 99
// System.out.println(numbers.length); -> 5
// loop o/p
// 10
// 99
// 30
// 40
// 50
// What is the index of the last element?
// -> 4
// What happens if we try numbers[5]?
// -> exception arrayindexoutofbound
// Why do we use i < numbers.length instead of i <= numbers.length?
// -> because index starts from 0 so 0 to 4 but length starts from 1 to 5 if we try to access index 5 which is not there we will get a array runtime exception basic logic index = arrayLength - 1

// int[] numbers = {10, 20, 30, 40, 50};

// What is the sum?
// -> 150.

// What is the average?
// -> sum/total elements -> 150/5 -> 30.

// Why does int result = 135 / 4; produce 33, not 33.75?
// -> because both of the numbers are integer which results into integer division so the result is 33 to get the desired floating point result just convert one of the operand to double like (double) 135 / 4 then the result would be 33.75.

// Write one Java statement that correctly calculates the average as a double.
// -> average = (double)sum / (double)ages.length;

// Does calculating the average require a loop after the sum has already been calculated? Explain why.
// -> No, because we already have the required things like sum and number of elements we can get from the length method like ages.length so not there is no required of loop here

public class Day15 {
    public static void main(String[] args) {
        System.out.println("Create an integer array containing 5 numbers of your choice and print all elements using a for loop.");
        int[] ages = {23, 55, 12, 10, 34};
        int sum = 0;
        double average = 0;

        for (int i = 0; i <= ages.length - 1; i++) {
            System.out.println("Age:- " + ages[i]);
        }

        System.out.println("Calculate and print the sum of all array elements.");
        for (int i = 0; i <= ages.length - 1; i++) {
            sum += ages[i];
        }
        System.out.println("Sum of all array elements:- " + sum);

        System.out.println("Calculate and print the average of all elements as a double.");
        average = (double)sum / (double)ages.length;

        System.out.println("Average of all array elements:- " + average);

        System.out.println("Find and print the largest number in the array.");
        int largestNumber = ages[0];

        for (int i = 0; i <= ages.length - 1; i++) {
            if (largestNumber < ages[i]) {
                largestNumber = ages[i];
            }
        }

        System.out.println("Largest number in the array:- " + largestNumber);

        System.out.println("Find and print the smallest number in the array.");
        int smallestNumber = ages[0];

        for (int i = 0; i <= ages.length - 1; i++) {
            if (smallestNumber > ages[i]) {
                smallestNumber = ages[i];
            }
        }

        System.out.println("Smallest number in the array:- " + smallestNumber);
    }
}
