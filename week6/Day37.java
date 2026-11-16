public class Day37 {

    public static void main(String[] args) {

        CompanyDeveloper companyDeveloper = new CompanyDeveloper("Ajay");
        companyDeveloper.displayDeveloperDetails();
//        companyDeveloper.companyName = "Meta";

    }
}

class CompanyEmployee {
    final String companyName = "Google";
    String employeeName;

    CompanyEmployee(String employeeName) {
        this.employeeName = employeeName;
    }

    final public void displayCompany() {
        System.out.println("Company Name:- " + this.companyName);
    }

    public void work() {
        System.out.println("Employee is working.");
    }
}

class CompanyDeveloper extends CompanyEmployee {

    CompanyDeveloper(String employeeName) {
        super(employeeName);
    }

    @Override
    public void work() {
        System.out.println("Developer is writing Java code.");
    }

    public void displayDeveloperDetails() {
        displayCompany();
        System.out.println("Developer Name:- " + this.employeeName);
        this.work();
    }
}