/* Java程式: Ch6_6_1.java */
public class Ch6_6_1 {
    // 主程式
    public static void main(String[] args) {
        int a = 3;  // 變數宣告
        int b = 5;
        int c = 2;
        // if/else巢狀條件敘述
        if (a > b && a > c) {
            System.out.println("變數 a 最大!");
        }
        else {
            if (b > c) {
                System.out.println("變數 b 最大!");
            } else {
                System.out.println("變數 c 最大!");
            }
        }
    }
}
