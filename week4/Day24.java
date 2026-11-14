// Prediction exercise

//         StringBuilder text = new StringBuilder("Java");

//         text.append(" Programming");
//         System.out.println(text);

//         text.insert(5, "Full Stack ");
//         System.out.println(text);

//         text.delete(5, 16);
//         System.out.println(text);

//         StringBuilder word = new StringBuilder("Hello");
//         word.reverse();
//         System.out.println(word);

//         StringBuilder name = new StringBuilder("Java");
//         System.out.println(name.length());
//         System.out.println(name.charAt(1));

//         name.replace(0, 4, "Python");
//         System.out.println(name);

//         String original = "Java";
//         original.concat(" Developer");
//         System.out.println(original);
    

// What is printed after text.append(" Programming")?
// -> Java Programming

// What is printed after text.insert(5, "Full Stack ")?
// -> Java Full Stack Programming

// What is printed after text.delete(5, 16)?
// -> Java Programming

// What is printed after word.reverse()?
// -> olleH

// What does name.length() return?
// -> 4

// What does name.charAt(1) return?
// -> a

// What is printed after name.replace(0, 4, "Python")?
// -> Python

// What is printed by System.out.println(original)?
// -> Java

// Explain why StringBuilder can modify its contents, whereas String cannot.
// -> Because string is immutable when the java language was created string was made immutable which means it can not be changes once created and also it returns new string on everytime you perform operation on it where StringBuilder is mutable we can modify Stringbuilder content it can be changed later 

public class Day24 {
    
    public static void main(String[] args) {

        StringBuilder message = new StringBuilder("Java");
        System.out.println(message);
        
        message.append(" Developer");
        message.insert(5, "Full Stack ");

        System.out.println(message);
        System.out.println(message.length());
        System.out.println(message.charAt(5));
        System.out.println(message.replace(5, 15, "Backend"));
        System.out.println(message.delete(12, message.length()));
        System.out.println(message.reverse());
        System.out.println(message.toString());

        String first = "Hello";
        first = first.concat(" World");
        System.out.println(first);

        StringBuilder second = new StringBuilder("Hello");
        second.append(" World");
        System.out.println(second);
    }
}
