/* Java程式: Ch8_3_3.java */
public class Ch8_3_3 {
    // 類別方法: 判斷是否是閏年
    static boolean is_leap_year(int year) {
        if (year % 100 == 0) {    // 最後2位為00
            if (year % 400 == 0)  // 被400整除
                return true;    // 是
            else
                return false;   // 不是
        } else { // 最後2位不是00
            if (year % 4 == 0)    // 被4整除
                return true;    // 是
            else
                return false;   // 不是
        }
    }
    // 主程式
    public static void main(String[] args) {
        int year;  // 變數宣告
        java.util.Scanner sc = // 建立Scanner物件
                new java.util.Scanner(System.in);
        System.out.print("請輸入四位數年份==> ");
        year = sc.nextInt();  // 取得年份
        // 類別方法呼叫
        if (is_leap_year(year))
            System.out.println(year + "年是閏年");
        else
            System.out.println(year + "年不是閏年");
    }
}

