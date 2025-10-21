/* 程式範例: Ch7_5.java */
public class Ch7_5 {
    // 主程式
    public static void main(String[] args) {
        int target, guess;  // 變數宣告
        java.util.Scanner sc =
                new java.util.Scanner(System.in);
        target = (int)(Math.random()*100 + 1); // 產生1~100
        // do while迴圈敘述
        do {   // 無窮迴圈
            System.out.print("請輸入猜測值=> ");
            guess = sc.nextInt(); // 取得整數
            if ( guess == target ) {
                break;    // 跳出迴圈
            }
            else {
                if ( guess > target )
                    System.out.println("數字太大!");
                else
                    System.out.println("數字太小!");
            }
        } while ( true );
        System.out.println("猜中數字: " + target);
    }
}
