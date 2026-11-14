// Prediction exercise

//         String text = "Java Programming";
//         System.out.println(text.length());
//         System.out.println(text.charAt(5));
//         System.out.println(text.substring(0, 4));
//         System.out.println(text.toUpperCase());
//         System.out.println(text);
//         String a = new String("Java");
//         String b = new String("Java");
//         System.out.println(a == b);
//         System.out.println(a.equals(b));
// 1. What is the output of text.length()?
// -> 16
// 2. What character does text.charAt(5) return?
// -> P
// 3. What is the output of text.substring(0, 4)?
// -> Java
// 4. What is the output of text.toUpperCase()?
// -> JAVA PROGRAMMING
// 5. What is printed by System.out.println(text) after calling toUpperCase()?
// -> Java Programming
// 6. What is the output of a == b?
// -> false
// 7. What is the output of a.equals(b)?
// -> true
// Also explain why questions 6 and 7 have different results.
// -> because == does not check the content but check the location or the reference like both of the variable are pointing to same reference since we created string using new keyword both the string are stored i n different location though the content might be same whereas equals method checks the content of the string that's it return true

// Explain why this code prints the original String:
// String word = "Hello";
// word.concat(" World");
// System.out.println(word);

// -> because even though we get Hello World but we didn't stored that in a variable and since string in immutable that's why we get the original string back but if we need to get the new string we have to store the new string in that same variable

public class Day22 {

    public static void main(String[] args) {

        String sentence = "Java is an amazing Programming Language";

        System.out.println("Print the original sentence:- " + sentence);
        System.out.println("Print the total number of characters using length():- " + sentence.length());
        System.out.println("Print the character at index 10:- " + sentence.charAt(10));
        System.out.println("Extract and print 'Java' using substring():- " + sentence.substring(0, 4));
        System.out.println("Print the entire sentence in uppercase:- " + sentence.toUpperCase());
        System.out.println("Print the entire sentence in lowercase:- " + sentence.toLowerCase());
        System.out.println("Check whether the sentence contains 'Programming' using contains():- " + sentence.contains("Programming"));
        System.out.println("Check whether the sentence equals 'Java is an amazing Programming Language' using equals():- " + sentence.equals("Java is an amazing Programming Language"));

        sentence = sentence.toUpperCase();
        System.out.println("Convert the sentence to uppercase and store the result back in the same variable. Print the variable afterward:- " + sentence);

        System.out.println("Create two String objects using new String('Hello'). Compare them using both == and .equals().");
        String first = new String("Hello");
        String second = new String("Hello");
        System.out.println("Comparing using == operator:- " + (first == second));
        System.out.println("Comparing using equals method:- " + (first.equals(second)));

    }
}
