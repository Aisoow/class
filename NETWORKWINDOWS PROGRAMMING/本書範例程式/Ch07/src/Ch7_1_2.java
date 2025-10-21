/* 程式範例: Ch7_1_2.java */
public class Ch7_1_2 {
    // 主程式
    public static void main(String[] args) {
        int i, j, max, sum = 0; // 變數宣告
        java.util.Scanner sc =
                new java.util.Scanner(System.in);
        System.out.print("請輸入最大值=> ");
        max = sc.nextInt(); // 取得最大值
        // for遞減迴圈敘述
        for ( i = max; i >= 1; i-- ) {
            System.out.print("|" + i + "|");
            sum += i;
        }
        System.out.println(" ==>從" + max + "加到1的總和=" + sum);
        // 在for迴圈語法初始和更新變數值
        for ( i = max, j = 1, sum = 0; i >= 1;
              i--, j++, System.out.print("\n") ) {
            System.out.print("|" + i + "-" + j + "|");
            sum += i;
            sum += j;
        }
        System.out.println(" ==>總和=" + sum);
    }
}
