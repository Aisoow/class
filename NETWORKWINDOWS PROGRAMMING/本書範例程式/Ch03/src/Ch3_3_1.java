/* 程式範例: Ch3_3_1.java */
public class Ch3_3_1 {
    // 主程式
    public static void main(String[] args) {
        // 變數宣告
        double rate = 0.04;
        double myBalance = 5000;
        double myInterest;
        int score1 = 35;
        int score2;
        int score3;
        score2 = 27;     // 指定敘述
        score3 = score2 + 2;
        myBalance = 10000;   // 計算本金與利息
        myInterest = myBalance * rate;
        myBalance = myBalance + myInterest; // 帳戶餘額
        // 顯示籃球前三節的得分
        System.out.println("第一節: " + score1);
        System.out.println("第二節: " + score2);
        System.out.println("第三節: " + score3);
        // 顯示帳戶餘額和利息
        System.out.println("利息: " + myInterest);
        System.out.println("餘額: " + myBalance);
    }
}
