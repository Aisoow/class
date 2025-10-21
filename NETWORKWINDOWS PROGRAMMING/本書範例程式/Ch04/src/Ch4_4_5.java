/* 程式範例: Ch4_4_5.java */
public class Ch4_4_5 {
    // 主程式
    public static void main(String[] args) {
        int a, b;  // 宣告變數
        // 算術與指定運算式的組合
        a = 4 + 5;
        b = 6 + a;
        System.out.println("a = " + a + "  b = " + b);
        a = b = 0;
        b = 6 + (a = 4 + 5);
        System.out.println("a = " + a + "  b = " + b);
    }
}
