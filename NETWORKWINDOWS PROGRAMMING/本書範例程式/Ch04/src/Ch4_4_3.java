/* 程式範例: Ch4_4_3.java */
public class Ch4_4_3 {
    // 主程式
    public static void main(String[] args) {
        int a, b, c, d;  // 宣告變數
        b = 10;    c = 5;
        System.out.println("b = " + b + "  c = " + c);
        // 括號運算式
        a = b * c + 10;
        System.out.println("b * c + 10 = " + a);
        a = b * (c + 10);
        System.out.println("b * (c + 10) = " + a);
        // 巢狀括號運算式
        d = 2;
        System.out.println("d = " + d);
        a = (b * 2) + (c * (d + 10));
        System.out.println("(b * 2) + (c * (d + 10)) = " + a);
    }
}
