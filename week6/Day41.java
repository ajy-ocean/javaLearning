public class Day41 {

    public static void main(String[] args) {

        UpiPayment upiPayment = new UpiPayment("Ajay");
        upiPayment.showCustomer();
        upiPayment.processPayment();

        System.out.println("======");

        Refundable refundable = new UpiPayment("Sandy");
        refundable.refund();

        System.out.println("======");

        CardPayment cardPayment = new CardPayment("Rawatji");
        cardPayment.showCustomer();
        cardPayment.processPayment();
    }
}

interface Refundable {
    void refund();
}

abstract class Payment {
    String customerName;

    Payment(String customerName) {
        this.customerName = customerName;
    }

    abstract void processPayment();

    public void showCustomer() {
        System.out.println("Customer Name:- " + customerName);
    }
}

class UpiPayment extends Payment implements Refundable {

    UpiPayment(String customerName) {
        super(customerName);
    }

    public void processPayment() {
        System.out.println("Processing UPI Payment");
    }

    @Override
    public void refund() {
        System.out.println(customerName + " we are refunding your purchase from BHIM UPI");
    }
}

class CardPayment extends Payment {

    CardPayment(String customerName) {
        super(customerName);
    }

    public void processPayment() {
        System.out.println("Processing Card payment");
    }
}