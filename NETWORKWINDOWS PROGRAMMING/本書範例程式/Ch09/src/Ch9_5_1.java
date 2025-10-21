/* 程式範例: Ch9_5_1.java */
public class Ch9_5_1 {
    // 類別方法: 泡沫排序法
    static void bubble(int[] data) {
        int i, j, temp;  /* 變數宣告 */
        for ( j = data.length; j > 1; j-- ) { // 第一層迴圈
            for ( i = 0; i < j-1; i++ ) { // 第二層迴圈
                // 比較相鄰的陣列元素
                if ( data[i+1] < data[i] ) {
                    temp = data[i+1]; // 交換兩元素
                    data[i+1] = data[i];
                    data[i] = temp;
                }
            }
        }
    }
    // 主程式
    public static void main(String[] args) {
        int k;  // 宣告變數
        int[] data = {11,12,10,15,1,2};
        bubble(data); // 呼叫排序方法
        System.out.print("排序結果: ");
        for ( k = 0; k < data.length; k++ ) {
            System.out.print("[" + data[k] + "]");
        }
        System.out.print("\n");
    }
}

