import java.util.HashMap;

public class Day50 {

    public static void main(String[] args) {

        HashMap<String, Integer> studentMarks = new HashMap<>();
        studentMarks.put("Rahul", 85);
        studentMarks.put("Amit", 90);
        studentMarks.put("Priya", 78);
        System.out.println(studentMarks.getOrDefault("Rahul", 0));
        System.out.println(studentMarks.getOrDefault("Sneha", 0));
        studentMarks.putIfAbsent("Sneha", 95);
        studentMarks.putIfAbsent("Rahul", 100);
        System.out.println(studentMarks);
        studentMarks.forEach((id, name) -> {
            System.out.println(id + " " + name);
        });

        studentMarks.replaceAll((name, marks) -> marks + 5);
        System.out.println(studentMarks);

        studentMarks.computeIfAbsent("karan", name -> 70);
        studentMarks.computeIfPresent("Amit", (name, marks) ->  marks + 10);
        studentMarks.computeIfPresent("Rohan", (name, marks) ->  marks + 10);
        studentMarks.computeIfPresent("Priya", (name, marks) ->  marks - 5);
        System.out.println(studentMarks);

        HashMap<String, Integer> wordCount = new HashMap<>();
        wordCount.merge("Rahul", 1, Integer::sum);
        wordCount.merge("Amit", 1, Integer::sum);
        wordCount.merge("Rahul", 1, Integer::sum);
        wordCount.merge("Rahul", 1, Integer::sum);
        System.out.println(wordCount);
    }

}

// getordefault
// get the value if not return the set default value
// computeifabsent
// add the key and values computed