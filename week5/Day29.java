
public class Day29 {

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Rahul", 101, 85.5);
        Student student3 = new Student("Amit", 102, 92.0);

        student1.displayDetails();
        System.out.println();
        student2.displayDetails();
        System.out.println();
        student3.displayDetails();
        
        System.out.println();
        student2.marks = 90.0;
        student2.displayDetails();
    }
}

class Student {

    String name;
    int rollNumber;
    double marks;

    Student() {
        this.name = "Not Assigned";
        this.rollNumber = 0;
        this.marks = 0.0;
    }

    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    void displayDetails() {
        System.out.println("Name:- " + name);
        System.out.println("RollNumber:- " + rollNumber);
        System.out.println("Marks:- " + marks);
    }
}
