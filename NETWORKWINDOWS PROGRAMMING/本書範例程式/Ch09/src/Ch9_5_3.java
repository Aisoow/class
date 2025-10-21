/* 程式範例: Ch9_5_3.java */
public class Ch9_5_3 {
    // 類別方法: 二元搜尋法
    static int binary(int[] data, int t) {
        int l = 0, n = data.length - 1, m, index = -1;
        while ( l <= n ) {
            m = (l + n) / 2;    // 計算中間索引
            if ( data[m] > t ){ // 在前半部
                n = m - 1;  // 重設範圍為前半部
            }  // 在後半部
            else if ( data[m] < t ) {
                l = m + 1;  // 重設範圍為後半部
            }
            else {
                index = m;  // 找到鍵值
                break;      // 跳出迴圈
            }
        }
        return index;
    }
    // 主程式
    public static void main(String[] args) {
        // 宣告變數
        int[] data = {1,8,9,15,25,33,42,66,74,81,90};
        int i, index, target;
        java.util.Scanner sc =
                new java.util.Scanner(System.in);
        System.out.print("原始陣列: ");
        for ( i = 0; i < data.length; i++ )
            System.out.print("[" + data[i] + "]");
        System.out.print("\n請輸入搜尋值 => ");
        target = sc.nextInt(); // 取得整數
        // 呼叫搜尋方法
        index = binary(data, target);
        if (index != -1) {
            System.out.println("搜尋到值: " + target + "-" + index);
        }
        else {
            System.out.println("沒有搜尋到值: " + target);
        }
    }
}
