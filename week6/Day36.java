public class Day36 {

    public static void main(String[] args) {
        AlphabetDeveloper alphabetDeveloper = new AlphabetDeveloper("Ajay");
        alphabetDeveloper.displayDetails();
        alphabetDeveloper.showWork();
    }
}

class AlphabetEmployee {
    String name;
    String company = "Google";

    AlphabetEmployee(String name) {
        this.name = name;
        System.out.println("Employee constructor called.");
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Company: " + company);
    }

    public void work() {
        System.out.println("Employee is working.");
    }
}

class AlphabetDeveloper extends AlphabetEmployee {
    String company = "Microsoft";

    AlphabetDeveloper(String name) {
        super(name);
        System.out.println("Developer constructor called.");
    }

    @Override
    public void work() {
        System.out.println("Developer is writing Java code.");
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Company: " + this.company);
        System.out.println("Company: " + super.company);
    }

    public void showWork(){
        super.work();
        this.work();
    }
}