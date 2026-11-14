
public class Day28 {

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.name = "Rahul";
        emp1.employeeId = 101;
        emp1.salary = 35000.0;
        emp1.displayDetails();

        System.out.println();

        Employee emp2 = new Employee();
        emp2.name = "Amit";
        emp2.employeeId = 102;
        emp2.salary = 55000.0;
        emp2.displayDetails();
        
        System.out.println("==================");
        System.out.println("After salary update: ");
        System.out.println("==================");
        
        emp1.salary = 65000.0;
        emp2.displayDetails();

    }
}

class Employee {

    String name;
    int employeeId;
    double salary;

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }
}
