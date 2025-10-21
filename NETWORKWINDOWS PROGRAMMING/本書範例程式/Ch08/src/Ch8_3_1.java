/* Java程式: Ch8_3_1.java */
public class Ch8_3_1 {
    // 類別方法: 計算絕對值
    static int abs(int n) {
        if ( n < 0 )
            return -n;
        else
            return n;
    }
    // 主程式
    public static void main(String[] args) {
        int number;  // 變數宣告
        java.util.Scanner sc = // 建立Scanner物件
                new java.util.Scanner(System.in);
        System.out.print("請輸入整數==> ");
        number = sc.nextInt();  // 取得值
        // 類別方法呼叫
        System.out.println("abs(" + number + ") = " + abs(number));
    }
}
