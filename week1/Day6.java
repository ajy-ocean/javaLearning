public class Day6{
    public static void main(String[] args) {
        int marks = 69;

        if (marks > 100) {
            System.out.println("marks cannot be greater than 100");
        } else if (marks >= 90) {
            System.out.println("A Grade");
        } else if (marks >= 80) {
            System.out.println("B Grade");
        } else if (marks >= 70) {
            System.out.println("C Grade");
        } else {
            System.out.println("Need Improvement");
        }
    }
}
