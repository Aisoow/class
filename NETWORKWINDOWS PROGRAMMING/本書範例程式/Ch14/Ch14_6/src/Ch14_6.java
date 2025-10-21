/* 程式範例: Ch14_6.java */
// 生產者執行緒類別
class Producer extends Thread {
    public int count = 0;
    // 執行執行緒
    public void run() {
        int value;
        while (Ch14_6.isRunning) {
            value = (int)(Math.random()*100);
            Ch14_6.squeue.enqueue(value);  // 存入
            System.out.print(">" + value + "]");
            count++;
            try {  // 暫停一段時間
                Thread.currentThread().sleep(
                        (int)(Math.random()*100));
            }
            catch(InterruptedException e){ }
        }
        System.out.println();
        System.out.println(Thread.currentThread() +
                "生產者執行緒結束");
    }
}
// 消費者執行緒類別
class Consumer extends Thread {
    public int count = 0;
    // 執行執行緒
    public void run() {
        int data;
        while (Ch14_6.isRunning) {
            data = Ch14_6.squeue.dequeue(); // 取出
            System.out.print("[" + data + ">");
            count++;
            try {  // 暫停一段時間
                Thread.currentThread().sleep(
                        (int)(Math.random()*100));
            }
            catch(InterruptedException e){ }
        }
        System.out.println();
        System.out.println(Thread.currentThread() +
                "消費者執行緒結束");
    }
}
// 主類別
public class Ch14_6 {
    static SynchronizedQueue squeue =
            new SynchronizedQueue();
    static boolean isRunning = true;
    // 主程式
    public static void main(String[] args) {
        // 建立執行緒物件
        Producer producer = new Producer();
        Consumer consumer = new Consumer();
        // 啟動執行緒
        producer.start();
        consumer.start();
        try {  // 暫停一段時間
            Thread.currentThread().sleep(500);
        }
        catch(InterruptedException e){ }
        isRunning = false;
    }
}
