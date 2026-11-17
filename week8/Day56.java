class InvalidAgeException extends RuntimeException {

    InvalidAgeException(String message) {
        super(message);
    }
}

class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String message) {
        super(message);
    }

}

class InvalidQuantityException extends RuntimeException {

    InvalidQuantityException(String message) {
        super(message);
    }
}

class InvalidProductPriceException extends RuntimeException {

    InvalidProductPriceException(String message) {
        super(message);
    }
}

public class Day56 {

    public static void validateAge(int age) {
        if (age < 18) {
            throw new InvalidAgeException("Age is below 18, Employee is not eligible");
        } else {
            System.out.println("Employee is eligible");
        }
    }

    public static void purchaseProduct(int quantity, double price) {
        if (quantity <= 0) {
            throw new InvalidQuantityException("Invalid Quantity");
        } else if (price <= 0) {
            throw new InvalidProductPriceException("Invalid price");
        } else {
            System.out.println("Total price:- " + quantity * price);
            System.out.println("Successful purchase");
        }
    }

    public static void withdraw(double balance, double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance");
        } else {
            System.out.println("Withdrawal successful");
        }
    }

    public static void main(String[] args) {

        try {
            validateAge(23);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("=======");
        try {
            validateAge(3);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("=======");
        try {
            withdraw(10000, 5000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("=======");
        try {
            withdraw(10000, 15000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("=======");
        try {
            purchaseProduct(2, 500);
        } catch (InvalidQuantityException | InvalidProductPriceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("=======");
        try {
            purchaseProduct(0, 500);
        } catch (InvalidQuantityException | InvalidProductPriceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("=======");
        try {
            purchaseProduct(2, -100);
        } catch (InvalidQuantityException | InvalidProductPriceException e) {
            System.out.println(e.getMessage());
        }
    }

}


/*

Why do we create custom exceptions instead of using only Java's built-in exceptions?
-> sometime we require our own custom exception according to our business logic

Why do we use super(message) inside a custom exception constructor?
-> so the parent constructor will be called that we studied in inheritance child have to call parent constructor
More specifically, super(message) calls the parent exception constructor and stores the message in the exception object.

What happens if a checked exception is thrown but neither caught nor declared?
-> This causes a compilation error because Exception is checked, and the method neither catches nor declares it.

Can a custom unchecked exception be declared using throws? Is it compulsory?
-> yes it can, no its not compulsory

Can we create multiple custom exception classes in the same Java project?
-> yes

Which custom exception would you create for a negative withdrawal amount?
-> InvalidAmountException, runtime Unchecked
Invalid input that should be corrected by the caller

Which custom exception would you create for insufficient balance?
-> InsufficientBalanceException, runtime Checked or unchecked
Depends on whether the application wants callers to explicitly handle this business condition

Which custom exception would you create for an underage account holder?
-> InvalidAgeException, runtime Unchecked
Invalid business input that prevents account creation

Would you make each exception checked or unchecked? Explain your choices.
-> if extends exception then checked and if extends runtime then unchecked

Why is it better to have separate exception classes for different business errors?
-> this create proper segegration of exceptions and we can create different type of custom exception according to our own business logic

 */