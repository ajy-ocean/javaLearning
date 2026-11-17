import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class Day51 {

    public static void main(String[] args) {
        Hashtable<Integer, String> employees = new Hashtable<>();
        employees.put(101, "Rahul");
        employees.put(102, "Amit");
        employees.put(103, "Priya");

        System.out.println(employees);
        System.out.println(employees.get(102));

        try {
            employees.put(null, "Sandy");
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Null key Insertion");
        }

        try {
            employees.put(104, null);
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Null Value Insertion");
        }

        ConcurrentHashMap<Integer, String> students = new ConcurrentHashMap<>();
        students.put(201, "Rahul");
        students.put(202, "Amit");
        students.put(203, "Priya");
        System.out.println(students);
        System.out.println(students.putIfAbsent(201, "Arjun"));
        System.out.println(students);

        try {
            students.put(null, "Sandy");
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Null key Insertion");
        }

        try {
            students.put(104, null);
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Null Value Insertion");
        }

        ConcurrentHashMap<String, Integer> marks = new ConcurrentHashMap<>();

        Thread t1 = new Thread(() -> {
            marks.put("Rahul", 85);
            marks.put("Amit", 90);
            marks.put("Sneha", 95);
        });

        Thread t2 = new Thread(() -> {
            marks.put("Priya", 78);
            marks.put("Karan", 88);
            marks.put("Arjun", 92);
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println(marks);
        System.out.println(marks.size());

        marks.merge("Rahul", 5, Integer::sum);
        System.out.println(marks);
    }
}

/*
    Write answers in comments in your Java code.

    1. Why is ConcurrentHashMap preferred over Hashtable in modern multithreaded applications?
    -> Because hashtable first of all is a legacy class so it should not be used in modern java application and secondly in hashtable all the methods are synchronized which increase the time and whereas the concurrent hashmap is implemented in a such a way that it can work in multithreaded environment easily

    2. Why do we use join()?
    -> In multithreaded condition if one thread is working the other thread can modify the same values and we don't want that to happen so using join one thread can wait untilt the other threads work is completed or not.

    3. Can two threads safely insert different keys into the same ConcurrentHashMap?
    -> yes

    4. Does ConcurrentHashMap allow null keys or values?
    -> NO
 */