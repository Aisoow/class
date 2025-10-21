/* 程式範例: Ch9_1_2.java */
public class Ch9_1_2 {
    // 主程式
    public static void main(String[] args) {
        // 宣告各次成績的變數
        int i,t1=71,t2=83,t3=67,t4=49,t5=59;
        int[] t = { 71, 83, 67, 49, 59 };
        double sum, average;          // 總分與平均
        sum = t1 + t2 + t3 + t4 + t5; // 計算總分
        average = sum / 5.0;          // 計算平均
        System.out.println("變數計算5次成績的總分:" + sum);
        System.out.println("5次成績的平均:" + average);
        for ( sum=0, i=0; i < 5; i++ )/* 計算總分 */
            sum += t[i];
        average = sum / 5.0;          /* 計算平均 */
        System.out.println("陣列計算5次成績的總分:" + sum);
        System.out.println("5次成績的平均:" + average);
    }
}
