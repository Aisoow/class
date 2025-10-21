/* 程式範例: Ch9_2_2.java */
public class Ch9_2_2 {
    // 主程式
    public static void main(String[] args) {
        int total;   // 宣告變數
        // 建立int陣列
        int[] scores = { 23, 32, 16, 22 };
        // 計算籃球比賽4節的總分
        total = scores[0]+scores[1]+scores[2]+scores[3];
        System.out.println("籃球比賽總分: " + total);
        System.out.println("平均各節分數: " + total/4.0);
    }
}