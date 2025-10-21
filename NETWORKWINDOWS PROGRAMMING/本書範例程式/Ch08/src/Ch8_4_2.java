/* Java程式: Ch8_4_2.java */
public class Ch8_4_2 {
    // 類別變數宣告
    static int a = 1;
    static double b = 2.0;
    // 類別方法: 區域變數的範圍
    static void funcA() {
        System.out.println("funcA變數宣告前: "+a+" - "+b);
        // 區域變數宣告
        int a = 3;
        double b = 4.0;
        System.out.println("funcA變數宣告後: "+a+" - "+b);
    }
    // 類別方法: 方法參數的範圍
    static void funcB(int a, double b) {
        System.out.println("funcB參數設定前: "+a+" - "+b);
        a = 3;   // 設定參數變數
        b = 4.0; // 設定參數變數
        System.out.println("funcB參數設定後: "+a+" - "+b);
    }
    // 類別方法: 類別變數的範圍
    static void funcC() {
        a = 3;   // 設定類別變數
        b = 4.0; // 設定類別變數
    }
    // 主程式
    public static void main(String[] args) {
        System.out.println("呼叫funcA前: "+a+" - "+b);
        funcA();        // 呼叫類別方法
        System.out.println("呼叫funcA後: "+a+" - "+b);
        System.out.println("呼叫funcB前: "+a+" - "+b);
        funcB(5, 6.0);  // 呼叫類別方法
        System.out.println("呼叫funcB後: "+a+" - "+b);
        System.out.println("呼叫funcC前: "+a+" - "+b);
        funcC();        // 呼叫類別方法
        System.out.println("呼叫funcC後: "+a+" - "+b);
    }
}
