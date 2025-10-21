/* Java程式: Ch8_3_4.java */
public class Ch8_3_4 {
    // 類別方法: 判斷是否是質數
    static boolean is_prime(int num) {
        int i;
        for (i = 2; i <= num - 1; i++)
            if (num % i == 0)  // 被i整除
                return false;  // 不是
        return true;           // 是
    }
    // 主程式
    public static void main(String[] args) {
        int num;  // 變數宣告
        java.util.Scanner sc = // 建立Scanner物件
                new java.util.Scanner(System.in);
        System.out.print("請輸入整數==> ");
        num = sc.nextInt();  // 取得整數值
        // 類別方法呼叫
        if (is_prime(num))
            System.out.println(num + "是質數");
        else
            System.out.println(num + "不是質數");
    }
}
