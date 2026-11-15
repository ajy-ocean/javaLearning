public class Day35 {

    public static void main(String[] args) {

        GoogleEmployee googleEmployee;
        googleEmployee = new GoogleDeveloper();
        googleEmployee.name = "Ajay";
        googleEmployee.employeeId = 23;
        googleEmployee.displayDetails();
        googleEmployee.work();
        System.out.println("================");

        System.out.println(googleEmployee instanceof GoogleDeveloper);

        if (googleEmployee instanceof GoogleDeveloper) {
            GoogleDeveloper googleDeveloper = (GoogleDeveloper) googleEmployee;
            googleDeveloper.writeCode();
        }
        System.out.println("================");

        googleEmployee = new GoogleManager();
        googleEmployee.name = "Jcole";
        googleEmployee.employeeId = 90;
        googleEmployee.displayDetails();
        googleEmployee.work();
        System.out.println("================");

        System.out.println(googleEmployee instanceof GoogleManager);

        if (googleEmployee instanceof GoogleManager) {
            GoogleManager googleManager = (GoogleManager) googleEmployee;
            googleManager.conductMeeting();
        }
    }
}

class GoogleEmployee {
    String name;
    int employeeId;

    public void displayDetails() {
        System.out.println("Name:- " + name);
        System.out.println("Employee Id:- " + employeeId);
    }

    public void work() {
        System.out.println("Employee is working.");
    }
}

class GoogleDeveloper extends GoogleEmployee {

    @Override
    public void work() {
        System.out.println("Developer is writing code.");
    }

    public void writeCode() {
        System.out.println("Developer is writing Java code.");
    }
}

class GoogleManager extends GoogleEmployee {

    @Override
    public void work() {
        System.out.println("Manager is managing the team.");
    }

    public void conductMeeting() {
        System.out.println("Manager is conducting a meeting.");
    }
}