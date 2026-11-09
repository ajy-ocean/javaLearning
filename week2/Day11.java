// Can we use break outside a loop?
// -> yes we can use inside if-else block main purpose of break is to break the follow of program or code

// What happens if we use continue inside a while loop but forget to update the counter?
// -> it continuously skip the current condition since the value is not increment that means it goes to infinite loop of skipping iteration

// Can a loop contain both break and continue?
// -> In general no because the break will break the loop so continue won't run but yeah we can do something like use the continue to skip the current iteration and break to break the loop

// public class Test {
//     public static void main(String[] args) {

//         if (10 > 5) {
//             break;
//         }

//         System.out.println("Hello");
//     }
// }
// Will this Java code compile? Explain why.
// -> no because we can only use break inside loop statements like for, while, do-while or switch statement this will give us a compilation error

// for (int i = 1; i <= 5; i++) {

//     if (i == 3) {
//         continue;
//     }

//     if (i == 5) {
//         break;
//     }

//     System.out.println(i);
// }
// Will this code print 1, 2, 4, 5 or something else?
// -> no, output is 1, 2, 4. 5 will be not be printed because of break it will breakt the loop that means we didn't reach the print statement

public class Day11 {

    public static void main(String[] args) {

        System.out.println("Print numbers from 1 to 10, but stop when the number reaches 6.");

        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("Print numbers from 1 to 10, but skip number 5.");

        int num = 1;
        while (num <= 10) {

            if (num == 5) {
                num++;
                continue;
            }

            System.out.println(num);
            num++;
        }

        System.out.println("Print numbers from 1 to 20, but skip all odd numbers using continue.");

        num = 1;
        do{
            if (num % 2 != 0) {
                num++;
                continue;
            }
            System.out.println(num);
            num++;
            
        }while(num <= 20);

        System.out.println("Use a loop to search for the number 7 between 1 and 10.");

        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                System.out.println("Number found: 7");
                break;
            }
        }
    }
}