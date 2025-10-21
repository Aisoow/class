/* 程式範例: SynchronizedQueue.java */
public class SynchronizedQueue {
    Queue queue;
    // 建構子
    public SynchronizedQueue() {
        queue = new Queue();
    }
    // 存入資料
    public synchronized void enqueue(int value) {
        try {    // 如果佇列已滿
            while (queue.isFull()) {
                System.out.println();
                System.out.println("佇列已滿, 稍等....");
                wait();  // 等待
            }
        }
        catch (InterruptedException e) { }
        queue.enqueue(value);  // 存入
        notify();  // 通知dequeue()
    }
    // 取出資料
    public synchronized int dequeue() {
        try {    // 如果佇列已空
            while (queue.isEmpty()) {
                System.out.println();
                System.out.println("佇列已空, 稍等....");
                wait(); // 等待
            }
        }
        catch (InterruptedException e) { }
        int data = queue.dequeue();  // 取出
        notify();  // 通知enqueue()
        return data;
    }
}
