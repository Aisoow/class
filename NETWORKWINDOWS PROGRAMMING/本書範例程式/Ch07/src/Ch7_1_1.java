/* 程式範例: Ch7_1_1.java */
public class Ch7_1_1 {
    // 主程式
    public static void main(String[] args) {
        int i, max, sum = 0; // 變數宣告
        java.util.Scanner sc =
                new java.util.Scanner(System.in);
        System.out.print("請輸入最大值=> ");
        max = sc.nextInt(); // 取得最大值
        // for遞增迴圈敘述
        for ( i = 1; i <= max; i++ ) {
            System.out.print("|" + i + "|");
            sum += i;
        }
        System.out.println(" ==>從1加到" + max + "的總和=" + sum);
    }
}
