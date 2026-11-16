import java.util.Objects;

public class Day38 {

    public static void main(String[] args) {
        BaseStudent baseStudent1 = new BaseStudent("Rahul", 101);
        BaseStudent baseStudent2 = new BaseStudent("Rahul", 101);
        BaseStudent baseStudent3 = new BaseStudent("Sandy", 103);

        System.out.println(baseStudent1);
        System.out.println(baseStudent2);
        System.out.println(baseStudent3);

        System.out.println();

        System.out.println(baseStudent1.equals(baseStudent2));
        System.out.println(baseStudent1.equals(baseStudent3));

        System.out.println();

        System.out.println(baseStudent1 == baseStudent2);
        System.out.println(baseStudent1 == baseStudent3);

        System.out.println();
        System.out.println(baseStudent1.hashCode());
        System.out.println(baseStudent2.hashCode());
        System.out.println(baseStudent3.hashCode());
    }
}

class BaseStudent {

    String name;
    int rollNumber;

    BaseStudent(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student Name:- " + name + "\n" +
                "Student Roll Number:- " + rollNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof BaseStudent)) {
            return false;
        }

        BaseStudent baseStudent = (BaseStudent) obj;

        return (this.name.equals(baseStudent.name)
                && (this.rollNumber == baseStudent.rollNumber)
        );

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNumber);
    }
}