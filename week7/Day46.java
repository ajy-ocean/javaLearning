import java.util.HashSet;

public class Day46 {

    public static void main(String[] args) {
        HashSet<String> students = new HashSet<>();
        students.add("Rahul");
        students.add("Amit");
        students.add("Priya");
        students.add("Sneha");
        students.add("Vikas");
        students.add("Rahul");
        System.out.println(students);
        System.out.println(students.size());
        System.out.println(students.contains("Priya"));
        System.out.println(students.contains("Karan"));
        students.remove("Amit");
        students.add("Karan");
        System.out.println(students);
        System.out.println(students.size());
        System.out.println(students.isEmpty());

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println(numbers.add(20));
        numbers.remove(30);
        System.out.println(numbers.contains(30));
        System.out.println(numbers);
        System.out.println(numbers.size());

        HashSet<String> names = new HashSet<>();
        names.add("Rahul");
        names.add("Amit");
        names.add("Priya");
        names.add(null);
        names.add(null);
        System.out.println(names);
        System.out.println(names.size());

        // Explain why only one null is stored.
        // Because internal hashset uses equal and hashcode
        // methods that check if the hashset element is duplicate or not
    }
}