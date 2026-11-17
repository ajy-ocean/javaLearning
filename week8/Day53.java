public class Day53 {

    public static void main(String[] args) {

        GenericBox<String> names = new GenericBox<>();
        names.setValue("Rahul");
        System.out.println(names.getValue());
        System.out.println("=======");

        GenericBox<Integer> numbers = new GenericBox<>();
        numbers.setValue(12);
        System.out.println(numbers.getValue());
        System.out.println("=======");

        GenericBox<Double> salaries = new GenericBox<>();
        salaries.setValue(3423.34);
        System.out.println(salaries.getValue());
        System.out.println("=======");

        GenericPair<Integer, String> employee = new GenericPair<>(23, "Ocean");
        employee.display();
        System.out.println("=======");

        GenericPair<Integer, String> employee2 = new GenericPair<>(3, "Randy");
        employee2.display();
        System.out.println("=======");

        GenericPair<String, Double> employeeDetails = new GenericPair<>("John", 23.23);
        employeeDetails.display();

    }
}

class GenericBox<T> {
    T value;

    void setValue(T value) {
        this.value = value;
    }

    T getValue() {
        return this.value;
    }

    void display() {
        System.out.println(getValue());
    }

}

class GenericPair<K, V> {
    K key;
    V value;

    GenericPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    void display() {
        System.out.println("Key:- " + this.key);
        System.out.println("Value:- " + this.value);
    }
}

/*
Conceptual questions
Answer these four questions:
1. Why are generics better than using Object as a field type?
-> You can store different types, but when retrieving a value, you may need explicit type casting in Object. This creates a risk of ClassCastException if you cast to the wrong type.
With generics:
You get:
- Compile-time type safety.
- No unnecessary type casting.
- Reusable code for different reference types.
Remember: Generics catch many type-related mistakes during compilation rather than waiting for runtime.

2. Can we use int, double, or boolean directly as generic type arguments? Why?
-> No, since generic do not support primitive types It only works with reference types we can wrapper classes

3. What is the difference between T and Object?
-> Object is a specific obj type where T can be any reference object

4. Why is Box<Integer> not assignable to Box<Number> even though Integer extends Number?
->
Remember this rule
- Integer is a subtype of Number.
- Box<Integer> is not a subtype of Box<Number>.
This behavior is called invariance.
 */