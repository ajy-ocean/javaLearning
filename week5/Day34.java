public class Day34 {

    public static void main(String[] args) {

        WiproEmployee wiproEmployee;

        wiproEmployee = new WiproEmployee();
        wiproEmployee.name = "Sandy";
        wiproEmployee.employeeId = 23;
        wiproEmployee.displayDetails();
        wiproEmployee.work();
        System.out.println("=================");

        wiproEmployee = new WiproDeveloper();
        wiproEmployee.name = "Ajay";
        wiproEmployee.employeeId = 78;
        wiproEmployee.displayDetails();
        wiproEmployee.work();
        WiproDeveloper wiproDeveloper = (WiproDeveloper) wiproEmployee;
        wiproDeveloper.writeCode();
        System.out.println("=================");

        wiproEmployee = new WiproManager();
        wiproEmployee.name = "Dean";
        wiproEmployee.employeeId = 8;
        wiproEmployee.displayDetails();
        wiproEmployee.work();
        WiproManager wirproManager = (WiproManager) wiproEmployee;
        wirproManager.conductMeeting();
        System.out.println("=================");

    }
}

class WiproEmployee {
    String name;
    int employeeId;

    public void displayDetails() {
        System.out.println("Name:- " + name);
        System.out.println("Employee Id:- " + employeeId);
    }

    public void work() {
        System.out.println("Employee is performing general work.");
    }
}

class WiproDeveloper extends WiproEmployee {

    @Override
    public void work() {
        System.out.println("Developer is writing Java code.");
    }

    public void writeCode() {
        System.out.println("Writing Java code using Spring Boot.");
    }
}

class WiproManager extends WiproEmployee {

    @Override
    public void work() {
        System.out.println("Manager is managing the development team.");
    }

    public void conductMeeting() {
        System.out.println("Manager is conducting a meeting.");
    }
}

