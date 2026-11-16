package Day39.company.developers;

import Day39.company.Employee;

public class Developer extends Employee {

    public void showDetails() {
        System.out.println("Name:- " + name);
        setSalary(34343);
        System.out.println("Salary:- " + getSalary());
        setDepartment("IT");
        System.out.println("Department:- " + getDepartment());

        // System.out.println("EmployeeId:- " + employeeId);
    }
}
