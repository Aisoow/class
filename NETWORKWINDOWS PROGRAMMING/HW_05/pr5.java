// Circular Queue implementation
class Queue {
    private int maxSize; // Maximum size of the queue
    private int[] queueArray; // Array to hold queue elements
    private int front; // Front pointer
    private int rear; // Rear pointer
    private int count; // Current number of elements

    // Constructor to initialize the queue
    public Queue(int size) {
        this.maxSize = size;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.count = 0;
    }

    // Add an element to the queue
    public void add(int value) {
        if (!q_full()) {
            rear = (rear + 1) % maxSize; // Circular increment
            queueArray[rear] = value;
            count++;
            System.out.println(value + " added to queue.");
        } else {
            System.out.println("Queue is full! Cannot add " + value);
        }
    }

    // Delete an element from the queue
    public int del() {
        if (!q_empty()) {
            int value = queueArray[front];
            front = (front + 1) % maxSize; // Circular increment
            count--;
            System.out.println(value + " deleted from queue.");
            return value;
        } else {
            System.out.println("Queue is empty! Cannot delete.");
            return -1;
        }
    }

    // Check if the queue is empty
    public boolean q_empty() {
        return (count == 0);
    }

    // Check if the queue is full
    public boolean q_full() {
        return (count == maxSize);
    }

    // Peek at the front element
    public int peek() {
        if (!q_empty()) {
            return queueArray[front];
        } else {
            System.out.println("Queue is empty! Nothing to peek.");
            return -1;
        }
    }

    // Get current size
    public int size() {
        return count;
    }
}

// Main class to test the Queue implementation
public class pr5 {
    public static void main(String[] args) {
        Queue queue = new Queue(5); // Create a circular queue of size 5

        // Perform queue operations
        System.out.println("=== Adding elements to queue ===");
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        
        System.out.println("\nFront element is: " + queue.peek());
        System.out.println("Queue is full? " + queue.q_full());
        
        System.out.println("\n=== Deleting elements from queue ===");
        queue.del();
        queue.del();
        
        System.out.println("\nQueue is empty? " + queue.q_empty());
        System.out.println("Current size: " + queue.size());
        
        System.out.println("\n=== Adding more elements (circular) ===");
        queue.add(60);
        queue.add(70);
        
        System.out.println("\n=== Deleting all remaining elements ===");
        while (!queue.q_empty()) {
            queue.del();
        }
        
        System.out.println("\nQueue is now empty? " + queue.q_empty());
    }
}