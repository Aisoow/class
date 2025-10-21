/* 程式範例: Ch9_2_3.java */
public class Ch9_2_3 {
    // 主程式
    public static void main(String[] args) {
        int i;                // 宣告變數
        final int LENGTH = 4; // 宣告常數
        double average, amount = 0.0;
        java.util.Scanner sc =
                new java.util.Scanner(System.in);
        double[] sales = new double[LENGTH];  // 宣告double陣列
        // 使用for迴圈輸入陣列元素值
        for ( i = 0; i < LENGTH; i++ ) {
            System.out.print("請輸入第"+(i+1)+"季的業績 => ");
            sales[i] = sc.nextDouble(); // 取得浮點數
        }
        // 使用for迴圈計算業績總和
        for ( i = 0; i < LENGTH; i++ ) {
            amount += sales[i];
            System.out.println("sales[" + i + "] = " + sales[i]);
        }
        average = amount / LENGTH;  // 計算平均
        System.out.println("業績總和: " + amount);
        System.out.println("業績平均: " + average);
    }
}
