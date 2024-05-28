// Main class for testing the stack implementation
public class Main {
    public static void main(String[] args) {
        // Using Stack class
        Stack stack = new Stack();
        stack.push(5);
        stack.push(10);
        stack.push(15);
        System.out.println("Stack after pushes:");
        stack.display();

        System.out.println("Top element is: " + stack.peek());

        stack.pop();
        System.out.println("Stack after one pop:");
        stack.display();
    }
}