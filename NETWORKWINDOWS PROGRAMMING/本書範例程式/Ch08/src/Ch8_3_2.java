/* Java程式: Ch8_3_2.java */
public class Ch8_3_2 {
    // 類別方法: 計算次方值
    static int power(int base, int n) {
        int i;   // 變數宣告
        int result = 1;
        for( i = 1; i <= n; i++ )
            result *= base;
        return result;
    }
    // 主程式
    public static void main(String[] args) {
        int base, n;  // 變數宣告
        java.util.Scanner sc = // 建立Scanner物件
                new java.util.Scanner(System.in);
        System.out.print("請輸入底數==> ");
        base = sc.nextInt();  // 取得底數值
        System.out.print("請輸入指數==> ");
        n = sc.nextInt();  // 取得指數值
        // 類別方法呼叫
        System.out.println(base + "^" + n + "=" + power(base, n));
    }
}
