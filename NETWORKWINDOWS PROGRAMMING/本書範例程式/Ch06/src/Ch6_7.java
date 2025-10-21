/* Java程式: Ch6_7.java */
public class Ch6_7 {
    // 主程式
    public static void main(String[] args) {
        int guess;   // 變數宣告
        int target = 75;
        java.util.Scanner sc =
                new java.util.Scanner(System.in);
        System.out.print("請輸入猜測值=> ");
        guess = sc.nextInt(); // 取得整數
        if ( guess == target ) {
            System.out.println("猜中數字!");
        }
        else {
            if ( guess > target ) {
                System.out.println("數字太大!");
            }
            else {
                System.out.println("數字太小!");
            }
        }
    }
}
