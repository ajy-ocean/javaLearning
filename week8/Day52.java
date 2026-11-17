
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Day52 {

    public static void main(String[] args) {

        ArrayList<YoutubeEmployee> employees = new ArrayList<>();

        // Employee Test Data
        employees.add(new YoutubeEmployee(101, "Rahul", 45000));
        employees.add(new YoutubeEmployee(102, "Amit", 60000));
        employees.add(new YoutubeEmployee(103, "Priya", 50000));
        employees.add(new YoutubeEmployee(104, "Sneha", 60000));
        employees.add(new YoutubeEmployee(105, "Karan", 40000));

        // ==========================================
        // PART A: COMPARABLE
        // Sort employees by salary in ascending order
        // ==========================================
        Collections.sort(employees);

        System.out.println("\n========== PART A: COMPARABLE ==========");
        System.out.println("Employees Sorted by Salary Ascending:");
        employees.forEach(System.out::println);

        // ==========================================
        // PART B: COMPARATOR
        // ==========================================

        // 1. Sort employees by name alphabetically
        System.out.println("\n========== PART B: COMPARATOR ==========");
        System.out.println("\n1. Sorted by Name Alphabetically:");

        employees.sort(Comparator.comparing(e -> e.name));
        employees.forEach(System.out::println);

        // 2. Sort employees by salary in descending order
        System.out.println("\n2. Sorted by Salary Descending:");

        Comparator<YoutubeEmployee> salaryDescending =
                Comparator.comparingInt(
                        (YoutubeEmployee e) -> e.salary
                ).reversed();

        employees.sort(salaryDescending);
        employees.forEach(System.out::println);

        // 3. Sort employees by salary ascending,
        // then name alphabetically when salaries are equal
        System.out.println("\n3. Salary Ascending, Then Name Alphabetically:");

        employees.sort(
                Comparator.comparingInt(
                        (YoutubeEmployee e) -> e.salary
                ).thenComparing(e -> e.name)
        );
        employees.forEach(System.out::println);

        // ==========================================
        // PART C: CONCEPTUAL QUESTIONS
        // ==========================================

        /*
        1. Why do we use Comparator when Comparable already exists?
        -> Comparable defines the natural/default sorting order
           inside a class, whereas Comparator allows us to define
           multiple custom sorting strategies without modifying
           the original class.

        2. Can one class have multiple Comparator sorting strategies?
        -> Yes, we can create multiple Comparator objects for
           different sorting requirements.

        3. What happens if compareTo() returns zero for two
           different Employee objects?
        -> It means both objects are considered equal in terms
           of the comparison criteria. It does not necessarily
           mean both objects are identical or equals() returns true.

        4. Why is Integer.compare() safer than
           this.salary - other.salary?
        -> Subtraction can cause integer overflow and produce
           incorrect comparison results. Integer.compare()
           avoids this problem.
        */
    }
}


// ==========================================
// EMPLOYEE CLASS IMPLEMENTING COMPARABLE
// ==========================================

class YoutubeEmployee implements Comparable<YoutubeEmployee> {

    int id;
    String name;
    int salary;

    YoutubeEmployee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Comparable: Natural sorting by salary ascending
    @Override
    public int compareTo(YoutubeEmployee other) {
        return Integer.compare(this.salary, other.salary);
    }

    // Display employee details
    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }
}
