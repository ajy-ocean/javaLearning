public class Day7 {

    public static void main(String[] args) {
        int customerAge = 30;
        boolean isCustomerStudent = false;
        String membershipType = "standard".toUpperCase();

        if (
            !(customerAge < 18) && 
            !isCustomerStudent  && 
            !membershipType.equals("GOLD")
        ) {
            System.out.println("No discount available");
        }
        if (membershipType.equals("GOLD")) {
            System.out.println("Customer is eligible for gold discount");
        }
        if (customerAge < 18) {
            System.out.println("Customer is eligible for youth discount");
        }
        if (isCustomerStudent) {
            System.out.println("Customer is eligible for student discount");
        }

    }
}
