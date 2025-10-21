/* 程式範例: Ch9_4_2.java */
public class Ch9_4_2 {
    // 類別方法: 找出二維陣列中成績最高
    static void maxGrades(int[][] data) {
        // 變數宣告
        int i, j, maxValue = 0, lIndex = -1, rIndex = -1;
        // 巢狀迴圈找尋最大值
        for ( i = 0; i < data.length; i++ )
            for ( j = 0; j < data[i].length; j++ )
                if ( data[i][j] > maxValue ) {
                    maxValue = data[i][j]; // 目前最大值
                    lIndex = i;
                    rIndex = j;
                }
        // 顯示成績最高的學生資料
        System.out.println("班級編號: " + lIndex);
        System.out.println("學生編號: " + rIndex);
        System.out.println("學生成績: " + data[lIndex][rIndex]);
    }

    // 類別方法: 依規則為所有分數加分
    // 規則：加分 = sqrt(原分數) * 10，最後四捨五入為整數再加到原分數
    static void addBonus(int[][] data) {
        for (int[] row : data) {
            for (int j = 0; j < row.length; j++) {
                int bonus = (int) Math.round(Math.sqrt(row[j]) * 10.0);
                row[j] += bonus;
            }
        }
    }

    // 類別方法: 印出二維整數陣列
    static void printArray(int[][] data) {
        for (int[] row : data) {
            for (int j = 0; j < row.length; j++) {
                System.out.print(row[j] + (j == row.length - 1 ? "" : " \t"));
            }
            System.out.println();
        }
    }
    // 主程式
    public static void main(String[] args) {
        // 宣告二維陣列
        int[][] grades = {{ 74, 56, 33, 65, 89 },
                          { 37, 68, 44, 78, 92 },
                          { 33, 83, 77, 66, 88 }};
        // 在副程式中為所有分數加分
        addBonus(grades);
        // 在 main 裡面重新印出整個陣列
        System.out.println("加分後的成績陣列:");
        printArray(grades);
        // 也可再次找出加分後的最高分
        System.out.println("\n加分後的最高分資訊:");
        maxGrades(grades);   // 呼叫類別方法
    }
}
