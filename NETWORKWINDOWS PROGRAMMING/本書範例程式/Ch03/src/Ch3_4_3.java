/* 程式範例: Ch3_4_3.java */
public class Ch3_4_3 {
    // 主程式
    public static void main(String[] args) {
        // 宣告變數
        boolean isRateHigh, isRateLow;
        float rate = 0.1F;
        isRateHigh = (rate >= .02);
        isRateLow = (rate < .02);
        // 顯示變數值/
        System.out.println("isRateHigh = " + isRateHigh);
        System.out.println("isRateLow = " + isRateLow);
    }
}
