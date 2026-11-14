// Prediction exercise

//         int[] numbers = {5, 10, 15, 20, 10, 25};
//         int target = 10;
//         int foundIndex = -1;
//         for (int i = 0; i < numbers.length; i++) {
//             if (numbers[i] == target) {
//                 foundIndex = i;
//                 break;
//             }
//         }
//         System.out.println(foundIndex);
//         int count = 0;
//         for (int i = 0; i < numbers.length; i++) {
//             if (numbers[i] == target) {
//                 count++;
//             }
//         }
//         System.out.println(count);
// What is the output of the first System.out.println()?
// -> 1
// What is the output of the second System.out.println()?
// -> 2
// Why does the first loop stop before checking the entire array?
// -> since we found the target element we used break statement which break the loop directly and the loop stops.
// Why does the second loop not use break?
// -> because we need to find the number of times our target element occured in the array we can not use break because it will break the loop directly.
// What would foundIndex contain if target = 100?
// -> -1

public class Day18 {

    public static void main(String[] args) {

        int[] numbers = {12, 7, 25, 7, 40, 7, 18};
        int target = 7;
        int foundIndex = -1;
        int count = 0;

        System.out.println("Find and print the index of the first occurrence of target");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                foundIndex = i;
                break;
            }
        }
        System.out.println("Target found at this index:- " + foundIndex);

        System.out.println("Count and print how many times target occurs.");
        System.out.println("Print all indexes where target occurs.");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Target found at this index:- " + i);
                count++;
            }
        }
        System.out.println("Target occurs this many times:- " + count);

        System.out.println("Change target to 100 and verify that your program correctly reports that it wasn't found.");
        target = 100;
        foundIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("Target found on this index:- " + foundIndex);
        } else {
            System.out.println("Target not found");
        }
    }
}
