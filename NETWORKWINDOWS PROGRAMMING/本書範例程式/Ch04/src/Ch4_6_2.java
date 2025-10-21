/* 程式範例: Ch4_6_2.java */
public class Ch4_6_2 {
    // 主程式
    public static void main(String[] args) {
        // 變數宣告
        int a = 27;      int b = 5;
        float r;
        // 寬基本型態轉換
        System.out.println("a = " + a + " b = " + b);
        r = a / b;
        System.out.println("r = a / b = " + r);
        // 強迫型態轉換
        r = (float)a / (float)b;
        System.out.println("r = (float)a/(float)b = "+r);
    }
}
