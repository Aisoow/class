class Queue {
    private int maxSize; // Maximum size of the queue
    private int front;   // Index of the front element
    private int rear;    // Index of the rear element
    private int[] queueArray; // Array to hold queue elements

    // Constructor to initialize the queue
    public Queue(int size) {
        this.maxSize = size;
        this.queueArray = new int[maxSize];
        this.front = -1;
        this.rear = -1;
    }

    // add an element
    public void add(int value) {
        if ((rear + 1) % maxSize == front) {
            System.out.println("Queue is full! Cannot add " + value);
            return;
        }
        rear = (rear + 1) % maxSize;
        queueArray[rear] = value;
        //System.out.println(value + " added to queue.");
    }

    // del an element
    public int del() {
        if (q_empty()) {
            System.out.println("Queue is empty! Cannot del.");
            return -1;
        }
        front = (front + 1) % maxSize;
        int value = queueArray[front];
        //System.out.println(value + " deleted from queue.");
        return value;
    }

    // Peek at the front element
    public int peek() {
        if (q_empty()) {
            System.out.println("Queue is empty! Nothing to peek.");
            return -1;
        }
        return queueArray[(front+1)% maxSize];
    }

    // Check if the queue is empty
    public boolean q_empty() {
        return(rear == front);
    }

    // Check if the queue is full
    public boolean q_full() {
        return ((rear + 1) % maxSize == front);
    }
}
public class QueueExample {
    // Main method for testing
    public static void pr1()
    {
        int sum = 0;
        Queue test_q = new Queue(200);
        for(int i=0;i<=100;i++)
        {
            test_q.add(i);
        }
        while(!test_q.q_empty())
        {
            sum+=test_q.del();
        }
        System.out.println("the result is:"+sum);
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);

        pr1();
        // Perform queue operations
        /*
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println("Front element is: " + q.peek());
        q.del();
        System.out.println("Front element after del: " + q.peek());
        q.add(40);
        q.add(50);
        q.add(60); // Queue should be full here
        q.del();
        q.del();
        q.del();
        q.del();
        q.del(); // Attempt to del from empty queue
        */
    }
}
