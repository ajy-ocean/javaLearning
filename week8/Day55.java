public class Day55 {

    public static void main(String[] args) {

        int firstNumber = 10;
        int secondNumber = 20;
        int thirdNumber = 0;

        try {
            divide(firstNumber, secondNumber);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        System.out.println("Program completed");

        try {
            divide(firstNumber, thirdNumber);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        System.out.println("Program completed");

        System.out.println("================");
        // ArithmeticException

        int[] numbers = {10, 20, 30, 0};

        try {
            for (int number : numbers) {
                if (number == 0) {
                    int result = number / 0;
                    System.out.println(result);
                }
            }

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }

        System.out.println("================");
        // ArrayIndexOutOfBoundsException
        try {
            int result = numbers[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        System.out.println("================");
        // NullPointerException
        try {
            String result = null;
            System.out.println(result.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }

        System.out.println("================");
        // Finally block
        try {
            int result = firstNumber / secondNumber;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Finally block executed");
        }

        try {
            int result = firstNumber / thirdNumber;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Finally block executed");
        }

        System.out.println("================");
        // method
        try {
            validateAge(23);
        } catch (IllegalArgumentException e) {
            System.out.println("Age should be greater than or equal to 18");
        }

        try {
            validateAge(3);
        } catch (IllegalArgumentException e) {
            System.out.println("Age should be greater than or equal to 18");
        }

        System.out.println("================");
        // method
        try {
            checkNumber(-67);
        } catch (Exception e) {
            System.out.println("Number should be greater than zero");
        }
        try {
            checkNumber(67);
        } catch (Exception e) {
            System.out.println("Number should be greater than zero");
        }
    }

    public static void divide(int a, int b) {
        int result = a / b;
        System.out.println(result);
    }

    public static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException();
        } else {
            System.out.println("Eligible");
        }
    }

    public static void checkNumber(int number)
            throws Exception {
        if (number < 0) {
            throw new Exception("Number cannot be negative");
        }
    }
}

/*

What is the difference between checked and unchecked exceptions?
->checked exception forces the programmer to handle exception during the compile time where unehecked exception does not
enforce handling of the exception

Why does Java require checked exceptions to be handled or declared?
-> because for eg filenotfound is a checked exception so java is trying to tell u that a file might not be present
did you handle the problem so if we try to perform an operation on a file that is not avaialbe it might cause an issue

What happens when an exception occurs inside a try block? Does Java execute the remaining statements inside that block?
-> it get caught by catch block after that remaining code is executed
and also the remaining statements inside the affected try block are skipped.

What is the difference between throw and throws?
-> throw keyword explicity we want to throw exception whereaas throws says whoever calls me should handle that exception

Why do we use a finally block?
-> it is mostly used for cleean process its a block that return whether we get an error or not only it doesn't run if we
get system.exit or something similar

What is exception propagation? Explain with a simple method-call example.
-> if lets say we have three method a, b and main if b calls a and main calls b if something happened some exception in a
it will travel to b because b called a and similarly it will travel to main since main called b that exception propagation

What is the difference between a custom checked exception and a custom unchecked exception?
-> if we extend Exception that custom checked if extends Runtime custom unehckec exception

 */
