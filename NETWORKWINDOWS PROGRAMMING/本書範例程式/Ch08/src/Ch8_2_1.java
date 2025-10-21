/* Java程式: Ch8_2_1.java */
public class Ch8_2_1 {
    // 類別方法: 顯示星號三角形
    private static void drawTriangle() {
        int i, j;  // 變數宣告
        // for巢狀迴圈
        for ( i = 1; i <= 5; i++ ) {
            for ( j = 1; j <= i; j++ )
                System.out.print("*");
            System.out.print("\n");
        }
    }
    // 類別方法: 計算1加到10的總和
    public static void sumOne2Ten() {
        int i, sum = 0;;  // 變數宣告
        // for迴圈敘述
        for ( i = 1; i <= 10; i++ ) {
            System.out.print("|" + i);
            sum += i;
        }
        System.out.println("\n總和: " + sum);
    }
    // 主程式
    public static void main(String[] args) {
        // 類別方法的呼叫
        drawTriangle();
        // 另一種類別方法的呼叫
        Ch8_2_1.sumOne2Ten();
    }
}
