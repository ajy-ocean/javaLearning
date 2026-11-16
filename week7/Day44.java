import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Day44 {

    public static void main(String[] args) {

        LinkedList<String> students = new LinkedList<>();
        students.add("Rahul");
        students.add("Amit");
        students.add("Priya");
        students.add("Sneha");
        students.add("Vikas");
        students.addFirst("Karan");
        students.addLast("Anjali");
        System.out.println(students);
        System.out.println(students.getFirst());
        System.out.println(students.getLast());
        System.out.println("===============");

        students.removeFirst();
        students.removeLast();
        System.out.println(students);
        System.out.println("===============");

        System.out.println("===============");
        students.add("Rohit");
        System.out.println("students.contains 'Priya' " + students.contains("Priya"));
        System.out.println("Print the size. " + students.size());
        System.out.println("Print the element at index 2. " + students.get(2));

        ArrayList<String> newStudentsList = new ArrayList<>();
        newStudentsList.add("Rahul");
        newStudentsList.add("Priya");
        newStudentsList.add("Sneha");
        newStudentsList.add("Vikas");
        System.out.println("ArrayList: " + newStudentsList);

        // ArrayList provides faster index-based access: O(1).
// LinkedList provides faster insertion at the beginning: O(1).
// ArrayList may need to shift elements when inserting at the beginning.
// LinkedList only needs to update node connections when inserting at the beginning.

        LinkedList<String> demo = new LinkedList<>();

        System.out.println("Peek: " + demo.peekFirst());

        try {
            System.out.println("Get: " + demo.getFirst());
        } catch (NoSuchElementException e) {
            System.out.println("List is empty!");
        }


    }
}
