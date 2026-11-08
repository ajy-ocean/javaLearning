public class Day9 {

    public static void main(String[] args) {

        System.out.println("Print numbers from 1 to 10.");
        int num = 1;
        while (num <= 10) {
            System.out.println(num);
            num++;
        }

        System.out.println("Print numbers from 10 down to 1.");
        num = 10;
        while (num >= 1) {
            System.out.println(num);
            num--;
        }

        System.out.println("Print only even numbers from 2 to 20.");
        num = 1;
        while (num <= 20) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num++;
        }

        System.out.println("Calculate the sum of numbers from 1 to 10 and print the result.");
        num = 1;
        int sum = 0;
        while (num <= 10) {
            sum = sum + num;
            num++;
        }
        System.out.println("Sum of numbers from 1 to 10:- " + sum);
    }
}