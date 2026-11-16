import java.util.ArrayList;

public class Day42 {

    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();
        employees.add("Rahul");
        employees.add("Amit");
        employees.add("Priya");
        employees.add("Sneha");
        employees.add("Vikas");
        for (String employee : employees) {
            System.out.println(employee);
        }

        System.out.println("===========");
        employees.add(2, "Karan");
        System.out.println(employees);

        System.out.println("===========");
        employees.set(1, "Arjun");
        System.out.println(employees);

        System.out.println("===========");
        employees.remove("Priya");
        System.out.println(employees);

        System.out.println("===========");
        System.out.println(employees.contains("Sneha"));

        System.out.println("===========");
        System.out.println("Total Number of Employees:- " + employees.size());

        System.out.println("===========");
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }

        System.out.println("===========");
        System.out.println(employees.isEmpty());

        System.out.println("===========");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers);

        System.out.println("===========");
        numbers.remove(Integer.valueOf(30));
        System.out.println(numbers);

    }
}
