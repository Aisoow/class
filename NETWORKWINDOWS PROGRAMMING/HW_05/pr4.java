class Stack {
    private int maxSize; // Maximum size of the stack
    private int[] stackArray; // Array to hold stack elements
    private int top; // Index of the top element

    // Constructor to initialize the stack
    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1; // Stack is empty initially
    }

    // Push an element onto the stack
    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value; // Increment top and add value
            System.out.println(value + " pushed to stack.");
        } else {
            System.out.println("Stack is full! Cannot push " + value);
        }
    }

    // Pop an element from the stack
    public int pop() {
        if (top >= 0) {
            int value = stackArray[top--]; // Return top value and decrement top
            System.out.println(value + " popped from stack.");
            return value;
        } else {
            System.out.println("Stack is empty! Cannot pop.");
            return -1; // Return -1 if stack is empty
        }
    }

    // Peek at the top element of the stack
    public int peek() {
        if (top >= 0) {
            return stackArray[top]; // Return the top element
        } else {
            System.out.println("Stack is empty! Nothing to peek.");
            return -1; // Return -1 if stack is empty
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }
}

// Main class to test the Stack implementation
public class pr4 {
    public static void main(String[] args) {
        Stack stack = new Stack(20); // Create a stack of size 20

        // Add 1~20 to the stack
        System.out.println("=== Pushing 1~20 to stack ===");
        for (int i = 1; i <= 20; i++) {
            stack.push(i);
        }

        // Pop all elements and print until the stack is empty
        System.out.println("\n=== Popping all elements ===");
        while (!stack.isEmpty()) {
            int value = stack.pop();
        }
        
        System.out.println("\nStack is now empty!");
    }
}