
public class Day31 {

    public static void main(String[] args) {
        ParentEmployee emp1 = new ParentEmployee("Ajay", 69, 1000000);
        ParentEmployee emp2 = new ParentEmployee("Nilesh", 19, 80000);
        ParentEmployee emp3 = new ParentEmployee("Panchi", 23, 60000);
        ParentEmployee.displayEmployeeCount();
        System.out.println();

        ParentEmployee.companyName = "Google";

        emp1.displayDetails();
        System.out.println();

        emp2.displayDetails();
        System.out.println();
        
        emp3.displayDetails();
    }
}

class ParentEmployee {

    String name;
    int employeeId;
    double salary;
    static String companyName = "Tech Solutions";
    static int employeeCount = 0;

    public ParentEmployee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
        employeeCount++;
    }

    public void displayDetails() {
        System.out.println("Name:- " + name);
        System.out.println("Employee Id:- " + employeeId);
        System.out.println("Salary:- " + salary);
        System.out.println("CompanyName:- " + companyName);
    }

    public static void displayEmployeeCount() {
        // System.out.println(salary);
        System.out.println("Employee Count:- " + employeeCount);
    }

}
