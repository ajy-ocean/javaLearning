import java.util.ArrayList;
import java.util.List;

public class Day54 {

    public static <T> void display(T value) {
        System.out.println(value);
    }

    public static <T extends Number> double calculateSquare(T number) {
        return number.doubleValue() * number.doubleValue();
    }

    public static void printNumbers(List<? extends Number> numbers) {
        for (Number number : numbers) {
            System.out.println(number);
        }
    }

    public static void addNumbers(List<? super Integer> numbers) {
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
    }

    public static void main(String[] args) {
        Day54.<String>display("Rahul");
        Day54.<Integer>display(100);
        Day54.<Double>display(85.0);
        Day54.<Boolean>display(true);

        System.out.println("============");
        System.out.println(calculateSquare(5));
        System.out.println(calculateSquare(4.5));
        System.out.println(calculateSquare(10.0));
//        System.out.println(calculateSquare("hello"));

        System.out.println("============");
        ArrayList<Integer> numbers = new ArrayList<>(List.of(10, 20, 30));
        ArrayList<Double> values = new ArrayList<>(List.of(10.5, 20.5, 30.5));
        printNumbers(numbers);
        printNumbers(values);

        System.out.println("============");
        ArrayList<Integer> numberValues = new ArrayList<>();
        ArrayList<Number> numValues = new ArrayList<>();
        ArrayList<Object> objValues = new ArrayList<>();
        addNumbers(numberValues);
        addNumbers(numValues);
        addNumbers(objValues);

        System.out.println(numberValues);
        System.out.println(numValues);
        System.out.println(objValues);
    }

}

/*

What is the difference between a generic class and a generic method?
-> the scope of type parameter for generic class its for the entire class and for method its inside the method only

What does <T extends Number> restrict, and why is it useful?
-> so it restrict to number and its subclass lets we only want number type data like in case of salary but if someone put string then that a problem

Why can List<Integer> and List<Double> both be passed to List<? extends Number>?
-> because they are child of number type, here the restricts says number class or its child type

Why can't we add an Integer directly to List<? extends Number>?
-> because we don't know the actual list could of number, double, float so it might break the list

Explain the difference between ? extends Integer and ? super Integer.
-> extends we can read but not add where super one we can add but not read directly

Explain the PECS rule with one practical example of each:
- Producer Extends
- Consumer Super
-> same answer as above

 */
