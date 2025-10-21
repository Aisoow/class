/* Java程式: Ch6_2_2.java */
public class Ch6_2_2 {
    // 主程式
    public static void main(String[] args) {
        int value, h;   // 變數宣告
        if ( 8 + 5 > 10 % 3 )   // 沒有程式區塊的if條件
            System.out.println("8 + 5 > 10 % 3成立!");
        if ( (( 9 % 4 ) > 2) && (8 >= 3) )
            System.out.println("(( 9 % 4 ) > 2) && (8 >= 3)成立!");
        java.util.Scanner sc =
                new java.util.Scanner(System.in);
        System.out.print("請輸入整數值=> ");
        value = sc.nextInt(); // 取得整數
        if (value >= -100 && value <= 100) { // && 運算子
            System.out.println("顯示數值: " + value);
        }
        System.out.print("請輸入身高=> ");
        h = sc.nextInt(); // 取得整數
        if (h < 50 || h > 200) {   // || 運算子
            System.out.println("身高不符合範圍: " + h);
        }
    }
}
