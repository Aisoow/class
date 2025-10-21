/* Java程式: Ch8_2_2.java */
public class Ch8_2_2 {
    // 類別方法: 轉換溫度
    static void convertTemp(double c) {
        double f;  // 變數宣告
        System.out.println("攝氏\t華氏");
        f = (9.0 * c) / 5.0 + 32.0;
        System.out.println(c + "\t" + f);
    }
    // 類別方法: 計算N到N的數字總和
    static void sumN2N(int start, int end) {
        int i, sum = 0;  // 變數宣告
        // for迴圈敘述
        for ( i = start; i <= end; i++ ) {
            System.out.print("|" + i);
            sum += i;
        }
        System.out.print("\n"+ start + "到" + end);
        System.out.println("的總和: " + sum);
    }
    // 主程式
    public static void main(String[] args) {
        java.util.Scanner sc = // 建立Scanner物件
                new java.util.Scanner(System.in);
        System.out.print("請輸入攝氏溫度=> ");
        double c = sc.nextDouble(); // 取得溫度
        System.out.print("請輸入最大值=> ");
        int max = sc.nextInt(); // 取得最大值
        convertTemp(c);   // 類別方法的呼叫
        sumN2N(1, max);
        Ch8_2_2.sumN2N(6, 10);
    }
}
