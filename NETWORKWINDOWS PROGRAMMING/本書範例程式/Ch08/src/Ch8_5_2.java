/* Java程式: Ch8_5_2.java */
public class Ch8_5_2 {
    // 類別方法: 計算n!的值
    static int factorial(int n) {
        if ( n == 1 )  // 終止條件
            return 1;
        else
            return n * factorial(n-1);
    }
    // 主程式
    public static void main(String[] args) {
        int level = -1;  // 變數宣告
        java.util.Scanner sc = // 建立Scanner物件
                new java.util.Scanner(System.in);
        do {
            System.out.print("請輸入階層數==> ");
            level = sc.nextInt();  // 取得階層數
            if ( level > 0 )      // 類別方法的呼叫
                System.out.println(level + "!=" + factorial(level));
        } while( level != -1 );
    }
}
