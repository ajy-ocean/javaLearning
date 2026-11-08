public class Day10 {

    public static void main(String[] args) {

        System.out.println("Print numbers from 1 to 10.");
        int num = 1;
        do { 
            System.out.println(num);
            num++;
        } while (num <= 10);

        System.out.println("Print numbers from 10 down to 1.");
        num = 10;
        do {
            System.out.println(num);
            num--;
        } while(num >= 1);

        System.out.println("Print only even numbers from 2 to 20.");
        num = 2;
        do {
            System.out.println(num);
            num += 2;
        } while(num <= 20);

        System.out.println("Calculate the sum of numbers from 1 to 10 and print the result.");
        num = 1;
        int sum = 0;
        do {
            sum += num;
            num++;
        } while(num <= 10);

        System.out.println("Sum of numbers from 1 to 10 using do-while:- " + sum);

        System.out.println("Demonstrate that do-while executes at least once even when the condition is false.");

        num = 10;
        do { 
            System.out.println(num);
            num++;
        } while (num < 10);
    }
}