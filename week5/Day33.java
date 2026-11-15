public class Day33 {

    public static void main(String[] args) {
        TcsEmployee tcsEmployee = new TcsEmployee();
        tcsEmployee.name = "Raju";
        tcsEmployee.employeeId = 12;
        tcsEmployee.salary = 34324.3;
        tcsEmployee.designation = "TCS Employee";
        tcsEmployee.displayDetails();
        tcsEmployee.work();
        System.out.println("===============");

        TcsDeveloper tcsDeveloper = new TcsDeveloper();
        tcsDeveloper.name = "Ajay";
        tcsDeveloper.employeeId = 133;
        tcsDeveloper.salary = 6556324.3;
        tcsDeveloper.designation = "TCS FULL STACK JAVA DEVELOPER";
        tcsDeveloper.displayDetails();
        tcsDeveloper.work();
        System.out.println("===============");

        TcsManager tcsManager = new TcsManager();
        tcsManager.name = "Kevin";
        tcsManager.employeeId = 445;
        tcsManager.salary = 79879824.3;
        tcsManager.designation = "TCS IT MANAGER";
        tcsManager.displayDetails();
        tcsManager.work();
        System.out.println("===============");

    }
}

class TcsEmployee {
    String name;
    int employeeId;
    double salary;
    String designation;

    public void work() {
        System.out.println("Employee is performing general work.");
    }

    public void displayDetails() {
        System.out.println("Employee Name:- " + name);
        System.out.println("Employee ID:- " + employeeId);
        System.out.println("Employee Salary:- " + salary);
        System.out.println("Employee Designation:- " + designation);
    }
}

class TcsDeveloper extends TcsEmployee {

    @Override
    public void work() {
        super.work();
        System.out.println("Developer is writing Java code.");
    }
}

class TcsManager extends TcsEmployee {

    @Override
    public void work() {
        System.out.println("Manager is managing the development team.");
    }
}