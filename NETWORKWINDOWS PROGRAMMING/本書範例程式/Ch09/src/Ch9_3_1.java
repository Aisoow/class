/* 程式範例: Ch9_3_1.java */
public class Ch9_3_1 {
    // 主程式
    public static void main(String[] args) {
        int i, id, sum;   // 宣告變數
        double average;
        java.util.Scanner sc =
                new java.util.Scanner(System.in);
        // 建立int的二維陣列
        int[][] grades = {{ 74, 56 },
                          { 37, 68 },
                          { 33, 83 } };
        System.out.print("請輸入學號0~2 ==> ");
        id = sc.nextInt(); // 取得整數
        /* 檢查索引是否在範圍內 */
        if ( id >= 0 && id <= 2 ) {
            /* 使用迴圈顯示陣列值和計算平均 */
            for ( sum = 0, i = 0; i < 2; i++) {
                sum += grades[id][i];
                System.out.println("成績: " + grades[id][i]);
            }
            System.out.println("學號: " + id + "的總分: " + sum);
            average = sum / 2.0;
            System.out.println("平均成績: " + average);
        }
    }
}

