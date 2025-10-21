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
    // 主程式
    public static void main(String[] args) {
        // 宣告二維陣列
        int[][] grades = {{ 74, 56, 33, 65, 89 },
                          { 37, 68, 44, 78, 92 },
                          { 33, 83, 77, 66, 88 }};
        maxGrades(grades);   // 呼叫類別方法
    }
}
