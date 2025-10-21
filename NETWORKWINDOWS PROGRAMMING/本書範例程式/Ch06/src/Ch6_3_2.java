/* Java程式: Ch6_3_2.java */
public class Ch6_3_2 {
    // 主程式
    public static void main(String[] args) {
        char m;   // 變數宣告
        int hour;
        java.util.Scanner sc =
                new java.util.Scanner(System.in);
        System.out.print("請輸入時數=> ");
        hour = sc.nextInt(); // 取得小時數
        m = (hour >= 12) ? 'P' : 'A'; // 條件運算子
        hour = (hour >= 12) ? hour-12 : hour;
        System.out.println("目前時間為: " + hour + m);
    }
}
