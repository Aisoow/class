/* 程式範例: Ch4_4_4.java */
public class Ch4_4_4 {
    // 主程式
    public static void main(String[] args) {
        double f, c;  // 宣告變數
        java.util.Scanner sc =
                new java.util.Scanner(System.in);
        System.out.print("請輸入攝氏溫度=> ");
        c = sc.nextDouble(); // 取得浮點數
        // 建立數學公式
        f = (9.0 * c) / 5.0 + 32.0;
        System.out.println("攝氏" + c + "=華氏" + f + "度");
        System.out.print("請輸入華氏溫度=> ");
        f = sc.nextDouble(); // 取得浮點數
        // 建立數學公式
        c = (5.0 / 9.0) * (f - 32);
        System.out.println("華氏" + f + "=攝氏" + c + "度");
    }
}
