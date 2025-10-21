/* Java程式: Ch8_4_1.java */
public class Ch8_4_1 {
    // 類別變數宣告
    static int no = 1;
    // 類別方法
    static void funcA() {
        no = 3;    // 指定類別變數值
    }
    // 主程式
    public static void main(String[] args) {
        System.out.println("類別變數初值 : " + no);
        no = 2;   // 指定類別變數值
        System.out.println("呼叫funcA 前 : " + no);
        funcA();  // 呼叫類別方法
        System.out.println("呼叫funcA 後 : " + no);
    }
}
