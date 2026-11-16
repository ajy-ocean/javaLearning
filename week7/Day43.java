import java.util.ArrayList;
import java.util.Collections;

public class Day43 {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        students.add("Rahul");
        students.add("Amit");
        students.add("Priya");
        students.add("Sneha");
        students.add("Vikas");
        students.add("Amit");
        students.add("Karan");
        System.out.println(students);

        System.out.println("==========");
        System.out.println("First Index of Amit:- " + students.indexOf("Amit"));

        System.out.println("==========");
        System.out.println("Last Index of Amit:- " + students.lastIndexOf("Amit"));

        System.out.println("==========");
        System.out.println("Check whether 'Rohit' exists:- " + students.contains("Rohit"));

        System.out.println("==========");
        Collections.sort(students);
        System.out.println("Sort the students alphabetically and print the list. " + students);

        System.out.println("==========");
        Collections.sort(students, Collections.reverseOrder());
        System.out.println("Task 4 – Reverse sorting " + students);

        System.out.println("==========");
        students.removeIf(student -> student.length() <= 3);
        System.out.println("Task 5 – Remove duplicates by condition. " + students);

        System.out.println("==========");
        ArrayList<String> backupStudents = new ArrayList<>(students);
        backupStudents.add("Anjali");
        System.out.println(students);
        System.out.println(backupStudents);

        System.out.println("==========");
        ArrayList<String> newStudents = new ArrayList<>();
        newStudents.add("Rohit");
        newStudents.add("Meena");
        students.addAll(newStudents);
        System.out.println("final list. " + students);

        System.out.println("==========");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(15);
        numbers.add(40);
        numbers.add(10);
        numbers.add(80);
        numbers.add(25);
        numbers.add(60);
        System.out.println(numbers);
        System.out.println("Max:- " + Collections.max(numbers));
        System.out.println("Min:- " + Collections.min(numbers));
        Collections.sort(numbers);
        System.out.println("Asc:- " + numbers);
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Dec:- " + numbers);

    }
}
