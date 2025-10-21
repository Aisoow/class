/* 程式範例: Queue.java */
public class Queue {
    static final int MAXQUEUE = 3;
    int[] queue = new int[MAXQUEUE];
    int front, rear;
    // 建構子
    public Queue() {
        front = 0; rear = 0;
    }
    // 佇列是否是空的
    public boolean isEmpty() {
        return (front == rear);
    }
    // 佇列是否已滿
    public boolean isFull() {
        int index = rear+1 < MAXQUEUE ? rear+1 : 0;
        return (index == front);
    }
    // 存入資料
    public void enqueue(int value) {
        queue[rear] = value;
        rear = rear+1 < MAXQUEUE ? rear+1 : 0;
    }
    // 取出資料
    public int dequeue() {
        int data = queue[front];
        front = front+1 < MAXQUEUE ? front+1 : 0;
        return data;
    }
}
