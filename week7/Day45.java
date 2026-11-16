import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Day45 {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("Login");
        stack.push("Open Dashboard");
        stack.push("View Profile");
        System.out.println(stack);

        System.out.println("==========");
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println("==========");
        Queue<String> queue = new LinkedList<>();
        queue.offer("Rahul");
        queue.offer("Amit");
        queue.offer("Priya");
        queue.offer("Sneha");
        System.out.println(queue);

        System.out.println("==========");
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);

        System.out.println("==========");
        Queue<String> secondQueue = new LinkedList<>();
        System.out.println("Poll: " + secondQueue.poll());
        System.out.println("Peek: " + secondQueue.peek());

        Stack<String> secondStack = new Stack<>();

        try {
            secondStack.pop();
        } catch (EmptyStackException e) {
            System.out.println("Error EmptyStackException");
        }
    }
}
