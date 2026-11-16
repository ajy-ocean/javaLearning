package Day39.company;

public class Employee {

    public String name;
    protected String department;
    int employeeId;
    private double salary;

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("EmployeeId:- " + employeeId);
        System.out.println("Name:- " + name);
        System.out.println("Department:- " + department);
        System.out.println("Salary:- " + salary);
    }
}
