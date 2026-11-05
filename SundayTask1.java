
public class SundayTask1 {

    public static void main(String[] args) {

        System.out.println("Java Expression Explorer");

        int firstNumber = 5;
        int secondNumber = 2;

        int thirdNumber = 10;
        int fourthNumber = 20;

        int fifthNumber = 7;
        int sixthNumber = 2;

        int seventhNumber = 0;
        int eightNumber = 2;

        int ninthNumber = 5;
        int tenthNumber = 0;

        System.out.println("First Number:- " + firstNumber);
        System.out.println("Second Number:- " + secondNumber);
        System.out.println("5 / 2:- " + (firstNumber / secondNumber));
        System.out.println("5 / 2.0:- " + (firstNumber / 2.0));
        System.out.println("5 / 2:- " + ((double) firstNumber / secondNumber));
        System.out.println("5 + 2:- " + (firstNumber + secondNumber));
        System.out.println("'5' + 2:- " + (firstNumber + "" + secondNumber));

        System.out.println("Third Number:- " + thirdNumber);
        System.out.println("Fourth Number:- " + fourthNumber);
        System.out.println("10 / 20:- " + (thirdNumber / fourthNumber));
        System.out.println("10 / 20.0:- " + (thirdNumber / 20.0));
        System.out.println("10 / 20:- " + ((double) thirdNumber / fourthNumber));
        System.out.println("10 + 20:- " + (thirdNumber + fourthNumber));
        System.out.println("'10' + 20:- " + (thirdNumber + "" + fourthNumber));

        System.out.println("Fifth Number:- " + fifthNumber);
        System.out.println("Sixth Number:- " + sixthNumber);
        System.out.println("7 / 2:- " + (fifthNumber / sixthNumber));
        System.out.println("7 / 2.0:- " + (fifthNumber / 2.0));
        System.out.println("7 / 2:- " + ((double) fifthNumber / sixthNumber));
        System.out.println("7 + 2:- " + (fifthNumber + sixthNumber));
        System.out.println("'7' + 2:- " + (fifthNumber + "" + sixthNumber));

        System.out.println("Seventh Number:- " + seventhNumber);
        System.out.println("Eighth Number:- " + eightNumber);
        System.out.println("0 / 2:- " + (seventhNumber / eightNumber));
        System.out.println("0 / 2.0:- " + (seventhNumber / 2.0));
        System.out.println("0 / 2:- " + ((double) seventhNumber / eightNumber));
        System.out.println("0 + 2:- " + (seventhNumber + eightNumber));
        System.out.println("'0' + 2:- " + (seventhNumber + "" + eightNumber));

        System.out.println("Ninth Number:- " + ninthNumber);
        System.out.println("Tenth Number:- " + tenthNumber);

        // Integer division by zero causes ArithmeticException.
        System.out.println("5 / 0.0:- " + (ninthNumber / 0));
        System.out.println("5 / 0:- " + ((double) ninthNumber / tenthNumber));
        System.out.println("5 + 0:- " + (ninthNumber + tenthNumber));
        System.out.println("'5' + 0:- " + (ninthNumber + "" + tenthNumber));

    }
}
