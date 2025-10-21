/* 程式範例: Ch9_5_2.java */
public class Ch9_5_2 {
    // 類別方法: 線性搜尋法
    static int sequential(int[] data, int target) {
        int i;     // 變數宣告
        for ( i = 0; i < data.length; i++ ) { // 搜尋迴圈
            // 比較是否是目標值
            if ( data[i] == target ) {
                return i;
            }
        }
        return -1;
    }
    // 主程式
    public static void main(String[] args) {
        // 宣告變數
        int[] data = {9,25,33,74,90,15,1,8,42,66,81};
        int i, index, target;
        java.util.Scanner sc =
                new java.util.Scanner(System.in);
        System.out.print("原始陣列: ");
        for ( i = 0; i < data.length; i++ )
            System.out.print("[" + data[i] + "]");
        System.out.print("\n請輸入搜尋值 => ");
        target = sc.nextInt(); // 取得整數
        // 呼叫搜尋方法
        index = sequential(data, target);
        if (index != -1) {
            System.out.println("搜尋到值: " + target + "-" + index);
        }
        else {
            System.out.println("沒有搜尋到值: " + target);
        }
    }
}
