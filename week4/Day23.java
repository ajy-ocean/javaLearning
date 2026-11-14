// Predict the output of this program without running it.

// String text = "Java Programming Java";
// System.out.println(text.contains("Programming"));
// What does contains("Programming") return?
// -> true
// System.out.println(text.startsWith("Java"));
// What does startsWith("Java") return?
// -> true
// System.out.println(text.endsWith("Java"));
// What does endsWith("Java") return?
// -> true
// System.out.println(text.indexOf("Java"));
// What does indexOf("Java") return?
// -> 0
// System.out.println(text.lastIndexOf("Java"));
// What does lastIndexOf("Java") return?
// -> 17
// System.out.println(text.indexOf('a', 2));
// What does indexOf('a', 2) return?
// -> 3
// System.out.println(text.replace("Java", "Python"));
// What is the output of replace("Java", "Python")?
// -> Python Programming Python
// String name = "   Rahul   ";
// System.out.println(name.trim().length());
// What is the output of name.trim().length()?
// ->The length of Rahul without spaces in leading & trailing i.e 5.
// String a = "";
// String b = " ";
// System.out.println(a.isEmpty());
// System.out.println(b.isEmpty());
// System.out.println(a.isBlank());
// System.out.println(b.isBlank());
// What does a.isEmpty() return?
// -> true
// What does b.isEmpty() return?
// -> false
// What does a.isBlank() return?
// -> true
// What does b.isBlank() return?
// -> true
// String first = "JAVA";
// String second = "java";
// System.out.println(first.equalsIgnoreCase(second));
// What does first.equalsIgnoreCase(second) return?
// -> true
public class Day23 {

    public static void main(String[] args) {
        String sentence = "   Java is an amazing programming language. Java is powerful.   ";

        System.out.println("Print the original sentence:- " + sentence);

        System.out.println("Check whether it contains 'programming':- " + sentence.contains("programming"));

        System.out.println("Check whether it starts with 'Java':- " + sentence.trim().startsWith("Java"));

        System.out.println("Check whether it ends with 'powerful':- " + sentence.trim().endsWith("powerful."));

        System.out.println("Find the first occurrence of 'Java':- " + sentence.indexOf("Java"));

        System.out.println("Find the last occurrence of 'Java':- " + sentence.lastIndexOf("Java"));

        System.out.println("Find the first occurrence of 'a' starting from index 5:- " + sentence.indexOf("a", 5));

        System.out.println("Replace 'Java' with 'Python' and print the result:- " + sentence.replace("Java", "Python"));

        System.out.println("Remove leading and trailing spaces using trim() and print the result:- " + sentence.trim());

        System.out.println("Print the length of the trimmed sentence:- " + sentence.trim().length());

        String empty = "";
        String spaces = " ";

        System.out.println("Is an empty String empty?:- " + empty.isEmpty());
        System.out.println("Is a String containing spaces empty?:- " + spaces.isEmpty());

        System.out.println("Is an empty String blank?:- " + empty.isBlank());
        System.out.println("Is a String containing spaces blank?:- " + spaces.isBlank());

        System.out.println("Compare 'JAVA' and 'java' using equalsIgnoreCase():- " + "Java".equalsIgnoreCase("java"));

        String fruit = "banana";
        int count = 0;
        for (int i = 0; i < fruit.length(); i++) {

            if (fruit.charAt(i) == 'a') {
                count++;
            }
        }

        System.out.println("Number of occurrences of a: " + count);

    }
}
