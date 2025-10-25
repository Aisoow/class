/* 程式範例: Ch9_5_2.java */
public class pr1 {
    // 類別方法: 線性搜尋法
    static int sequential(int[] data, int target) {
        int i; // 變數宣告
        for (i = 0; i < data.length; i++) { // 搜尋迴圈
            // 比較是否是目標值
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static void bubble(int[] data) {
        int i, j, temp; /* 變數宣告 */
        for (j = data.length; j > 1; j--) { // 第一層迴圈
            for (i = 0; i < j - 1; i++) { // 第二層迴圈
                // 比較相鄰的陣列元素
                if (data[i + 1] < data[i]) {
                    temp = data[i + 1]; // 交換兩元素
                    data[i + 1] = data[i];
                    data[i] = temp;
                }
            }
        }
    }
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
        int[] data = { 9, 25, 33, 74, 90, 15, 1, 8, 42, 66, 81 };
        
        int k ,m , i, index, target;
        java.util.Scanner sc =
                new java.util.Scanner(System.in);
        System.out.print("原始陣列: ");
        for ( i = 0; i < data.length; i++ )
            System.out.print("[" + data[i] + "]");

        bubble(data);
        System.out.print("\n排序結果: ");
        for (k = 0; k < data.length; k++) {
            System.out.print("[" + data[k] + "]");
        }
        
        System.out.print("\n請輸入搜尋值 => ");
        target = sc.nextInt(); // 取得整數
        // 呼叫搜尋方法
        index = sequential(data, target);
        m = binary(data, target);
        if (index != -1) {
            System.out.println("搜尋到值: " + target +"\n位置: " + index+"\nm: " + m);
        }
        else {
            System.out.println("沒有搜尋到值: " + target);
        }
    }
}
