import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Day49 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> students = new LinkedHashMap<>();
        students.put(103, "Priya");
        students.put(101, "Rahul");
        students.put(102, "Amit");
        students.put(104, "Sneha");
        System.out.println(students);
        students.replace(102, "Arjun");
        System.out.println(students);
        students.remove(103);
        System.out.println(students.containsKey(104));
        System.out.println(students);

        TreeMap<Integer, String> employeeNames = new TreeMap<>();
        employeeNames.put(30, "Rahul");
        employeeNames.put(10, "Amit");
        employeeNames.put(40, "Priya");
        employeeNames.put(20, "Sneha");
        System.out.println(employeeNames);

        System.out.println(employeeNames.firstKey());
        System.out.println(employeeNames.lastKey());
        System.out.println(employeeNames.higherKey(20));
        System.out.println(employeeNames.lowerKey(30));
        System.out.println(employeeNames.ceilingKey(25));
        System.out.println(employeeNames.floorKey(35));
        employeeNames.remove(20);
        System.out.println(employeeNames);

        TreeMap<String, Integer> marks = new TreeMap<>();
        marks.put("Rahul", 85);
        marks.put("Amit", 90);
        marks.put("Priya", 78);
        marks.put("Sneha", 95);
        System.out.println(marks);
    }
}

// LinkedHashMap is used when we want insertion order to
// maintained whereas Treemap if we want sorted keys
// LinkedHashMap
// TreeMap
