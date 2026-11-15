
public class Day32 {

    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.name = "Naruto";
        dev.employeeId = 106;
        dev.setSalary(434343.323);
        dev.displayDetails();

        System.out.println();

        Manager manager = new Manager();
        manager.name = "Hinata";
        manager.employeeId = 206;
        manager.setSalary(786843.3);
        manager.displayDetails();
    }
}

class BaseEmployee {

    String name;
    int employeeId;
    private double salary;

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name:- " + name);
        System.out.println("Employee Id:- " + employeeId);
        System.out.println("Salary:- " + getSalary());
    }

}

class Developer extends BaseEmployee {

    void writeCode() {
        System.out.println("Developer is writing Java code.");
    }
}

class Manager extends BaseEmployee {

    void conductMeeting() {
        System.out.println("Manager is conducting a team meeting.");
    }

}
