/* 程式範例: Ch13_3_1.java */
public class Ch13_3_1 {
    // 類別方法: 計算立方
    static int cube(int num) {
        return num*num*num;  // 傳回值
    }
    // 類別方法: 計算立方
    static double cube(double num) {
        return num*num*num;  // 傳回值
    }
    // 類別方法: 取得最小值
    static int getMin(int a, int b) {
        if ( a < b ) return a;
        else         return b;
    }
    // 類別方法: 取得最小值
    static int getMin(int a, int b, int c) {
        int temp;  // 變數宣告
        if ( a < b ) temp = a;
        else         temp = b;
        if ( temp < c ) return temp;
        else            return c;
    }
    // 主程式
    public static void main(String[] args) {
        int num1 = 10;  // 變數宣告
        double num2 = 15.2;
        // 類別方法的呼叫
        System.out.println(num1 + "*" + num1 + "*" + num1
                + " = " + cube(num1));
        System.out.println(num2 + "*" + num2 + "*" + num2
                + " = " + cube(num2));
        System.out.println("45 和 60 => " +
                getMin(45, 60) + "比較小");
        System.out.println("48 ,34 和 25 => " +
                getMin(48, 34, 25) + "比較小");
    }
}