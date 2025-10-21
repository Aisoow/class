/* Java程式: Ch6_2_1.java */
public class Ch6_2_1 {
    // 主程式
    public static void main(String[] args) {
        int value;   // 變數宣告
        if ( 3 <= 4 )   // 沒有程式區塊的if條件
            System.out.println("3<=4成立!");
        if ( 3 == 4 ) System.out.println("3==4成立!");
        java.util.Scanner sc =
                new java.util.Scanner(System.in);
        System.out.print("請輸入整數值=> ");
        value = sc.nextInt(); // 取得整數
        // 絕對值處理
        if ( value < 0 ){   // 程式區塊的if條件
            value = -value;
        }
        System.out.println("絕對值: " + value);
    }
}
