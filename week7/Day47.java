import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Day47 {

    public static void main(String[] args) {
        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.add("Ajay");
        names.add("Ajay");
        names.add("Jcole");
        System.out.println(names);
        names.removeFirst();
        System.out.println(names);
        System.out.println(names.contains("Jcole"));

        TreeSet<Integer> marks = new TreeSet<>();
        marks.add(10);
        marks.add(40);
        marks.add(90);
        System.out.println(marks);
        marks.removeFirst();
        System.out.println(marks);
        System.out.println(marks.contains(34));
        System.out.println(marks.ceiling(45));
        System.out.println(marks.floor(45));
    }
}
