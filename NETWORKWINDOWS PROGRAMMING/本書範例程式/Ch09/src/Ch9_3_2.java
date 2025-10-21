/* 程式範例: Ch9_3_2.java */
public class Ch9_3_2 {
    // 主程式
    public static void main(String[] args) {
        int i, j;  // 宣告變數
        // 建立3個int的二維陣列
        int[][] A = {{1, 3, 5}, {7, 9, 2}, {4, 6, 8}};
        int[][] B = {{2, 4, 6}, {8, 1, 3}, {5, 7, 9}};
        int[][] C = new int[3][3];
        // 矩陣相加和顯示二維陣列的元素值
        for ( i=0; i < 3; i++) {
            for ( j=0; j < 3; j++) {
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
