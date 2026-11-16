import java.util.HashMap;
import java.util.Map;

public class Day48 {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        students.put(101, "Rahul");
        students.put(102, "Amit");
        students.put(103, "Priya");
        students.put(104, "Sneha");
        System.out.println(students);
        System.out.println(students.size());
        System.out.println(students.get(102));
        System.out.println(students.containsKey(103));
        System.out.println(students.containsValue("Karan"));
        students.put(102, "Arjun");
        System.out.println(students);
        students.remove(104);
        System.out.println(students);
        System.out.println(students.size());
        students.put(105, "Rahul");

        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(
                    entry.getKey() + " " + entry.getValue()
            );
        }

        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Rahul", 85);
        marks.put("Amit", 90);
        marks.put("Priya", 78);
        System.out.println(marks.get("Rahul"));
        marks.replace("Priya", 88);

        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println(
                    entry.getKey() + " " + entry.getValue()
            );
        }
    }
}
