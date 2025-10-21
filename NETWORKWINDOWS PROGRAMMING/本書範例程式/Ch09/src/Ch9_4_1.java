/* 程式範例: Ch9_4_1.java */
public class Ch9_4_1 {
    // 類別方法: 找出陣列的最小值
    static void minElement(int[] eles) {
        int i, minValue = 100, index = -1;  // 變數宣告
        // 使用for迴圈找尋最小值
        for ( i = 0; i < eles.length; i++ ) {
            if ( eles[i] < minValue ) {
                minValue = eles[i]; // 目前最小值
                index = i;
            }
        } // 與第一個陣列元素交換
        eles[index] = eles[0];
        eles[0] = minValue;
    }
    // 主程式
    public static void main(String[] args) {
        int i;
        int[] data = { 81,13,27,39,69 }; // 宣告變數
        System.out.print("呼叫函數前: ");
        for ( i=0; i < data.length; i++)   // 使用迴圈顯示陣列值
            System.out.print("[" + i + ":" + data[i] + "] ");
        minElement(data); // 呼叫類別方法
        System.out.print("\n呼叫函數後: ");
        for ( i=0; i < data.length; i++)   // 使用迴圈顯示陣列值
            System.out.print("[" + i + ":" + data[i] + "] ");
        System.out.println("\n陣列最小值: " + data[0]);
    }
}
