/* 程式範例: Ch7_2_1.java */
public class Ch7_2_1 {
    // 主程式
    public static void main(String[] args) {
        int maxValue;  // 變數宣告
        int n = 1;
        int result = 1;
        java.util.Scanner sc =
                new java.util.Scanner(System.in);
        System.out.print("請輸入N!階層值需超過=> ");
        maxValue = sc.nextInt(); // 取得最大階層值
        // while迴圈敘述
        while (result <= maxValue){
            result = result * n;
            n = n + 1;  // while迴圈的計數器
        }
        n = n - 1;
        System.out.println(n + "!= " + result);
    }
}
