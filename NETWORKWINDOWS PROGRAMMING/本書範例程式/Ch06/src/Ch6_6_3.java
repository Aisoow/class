/* Java程式: Ch6_6_3.java */
public class Ch6_6_3 {
    // 主程式
    public static void main(String[] args) {
        int value;  // 變數宣告
        java.util.Scanner sc =
                new java.util.Scanner(System.in);
        System.out.print("請輸入整數值=> ");
        value = sc.nextInt(); // 取得整數
        // 沒有大括號的巢狀條件敘述
        if (value >= 0)
            if (value <=5)
                System.out.println("0~5之間!");
            else
                System.out.println("大於5!");
        // 有大括號的巢狀條件敘述
        if (value >= 0) {
            if (value <=5)
                System.out.println("0~5之間!");
        }
        else
            System.out.println("小於0!");
    }
}
