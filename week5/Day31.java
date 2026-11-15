
public class Day31 {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Ajay", 69, 1000000);
        Employee emp2 = new Employee("Nilesh", 19, 80000);
        Employee emp3 = new Employee("Panchi", 23, 60000);
        Employee.displayEmployeeCount();
        System.out.println();

        Employee.companyName = "Google";

        emp1.displayDetails();
        System.out.println();

        emp2.displayDetails();
        System.out.println();
        
        emp3.displayDetails();
    }
}

class Employee {

    String name;
    int employeeId;
    double salary;
    static String companyName = "Tech Solutions";
    static int employeeCount = 0;

    public Employee(String name, int employeeId, double salary) {
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
