/* Java程式: Ch8_2_3.java */
public class Ch8_2_3 {
    // 類別方法: 溫度轉換
    static double convertTemp(double c) {
        return (9.0 * c) / 5.0 + 32.0;
    }
    // 類別方法: 計算N到N的數字總和
    static int sumN2N(int start, int end) {
        int i, sum = 0;  // 變數宣告
        // for迴圈敘述
        for ( i = start; i <= end; i++ )
            sum += i;
        return sum;
    }
    // 主程式
    public static void main(String[] args) {
        java.util.Scanner sc = // 建立Scanner物件
                new java.util.Scanner(System.in);
        System.out.print("請輸入攝氏溫度=> ");
        double c = sc.nextDouble(); // 取得溫度
        System.out.print("請輸入開始值=> ");
        int s = sc.nextInt(); // 取得開始值
        System.out.print("請輸入結束值=> ");
        int e = sc.nextInt(); // 取得結束值
        // 類別方法的呼叫
        int total = sumN2N(s, e);
        System.out.println(s+"加到"+e+"的總和:"+total);
        double f = convertTemp(c);
        System.out.println(c + "度C=" + f + "度F");
    }
}
