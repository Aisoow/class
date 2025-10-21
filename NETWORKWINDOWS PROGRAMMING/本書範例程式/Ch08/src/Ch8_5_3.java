/* Java程式: Ch8_5_3.java */
public class Ch8_5_3 {
    // 類別方法: 計算費氏數列的值
    static int fib(int n) {
        if ( n == 0 || n == 1 )  // 終止條件
            return n;
        else
            return fib(n - 1) + fib(n - 2);
    }
    // 主程式
    public static void main(String[] args) {
        int number;  // 變數宣告
        int result;
        java.util.Scanner sc = // 建立Scanner物件
                new java.util.Scanner(System.in);
        do {
            System.out.print("請輸入費氏數列的級數==> ");
            number = sc.nextInt();  // 取得級數
            if (number >= 0 ) {
                result = fib(number); // 類別方法的呼叫
                System.out.println("fib(" + number + ") = " + result);
            }
        } while( number != -1 );
    }
}