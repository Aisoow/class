/* 程式範例: Ch7_1_3a.java */
public class Ch7_1_3a {
    // 主程式
    public static void main(String[] args) {
        int n, result = 1, maxLevel; // 變數宣告
        java.util.Scanner sc =
                new java.util.Scanner(System.in);
        System.out.print("請輸入階層數=> ");
        maxLevel = sc.nextInt(); // 取得最大階層數
        for (n = 1; n <= maxLevel; n++ ) {
            result = result * n;
        }
        System.out.println(maxLevel + "!=" + result);
    }
}
