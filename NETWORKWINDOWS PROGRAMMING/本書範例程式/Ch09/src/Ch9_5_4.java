/* 程式範例: Ch9_5_4.java */
public class Ch9_5_4 {
    // 類別方法: 二元搜尋法
    static int binary(int[] data, int low, int high, int t) {
        int middle; // 宣告變數
        if (low > high) return -1; // 終止條件
        else {  // 取得中間索引
            middle = (low + high) / 2;
            if ( t == data[middle] ) // 找到
                return middle;   // 傳回索引值
            else if ( t < data[middle] )// 前半部分
                return binary(data, low, middle-1, t);
            else   // 後半部分
                return binary(data, middle+1, high, t);
        }
    }
    // 主程式
    public static void main(String[] args) {
        // 宣告變數
        int[] data = {12, 13, 24, 35, 44, 67, 78, 98};
        int i, index, target;
        java.util.Scanner sc =
                new java.util.Scanner(System.in);
        System.out.print("原始陣列: ");
        for ( i = 0; i < data.length; i++ )
            System.out.print("[" + data[i] + "]");
        System.out.print("\n請輸入搜尋值 => ");
        target = sc.nextInt(); // 取得整數
        // 呼叫搜尋方法
        index = binary(data, 0, data.length-1, target);
        if (index != -1) {
            System.out.println("搜尋到值: " + target + "-" + index);
        }
        else {
            System.out.println("沒有搜尋到值: " + target);
        }
    }
}
