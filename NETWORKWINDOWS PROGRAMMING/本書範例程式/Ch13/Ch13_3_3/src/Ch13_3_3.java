/* 程式範例: Ch13_3_3.java */
class Time {   // Time類別宣告
    private int hour;
    private int minute;
    private int second;
    // 建構子(1): 沒有參數
    public Time() {
        hour = 10;        // 設定小時
        minute = 30;      // 設定分
        second = 50;      // 設定秒
    }
    // 建構子(2): 使用參數設定成員資料初始值
    public Time(int h, int m, int s) {
        hour = h;         // 設定小時
        minute = m;       // 設定分
        second = s;       // 設定秒
    }
    // 成員方法: 顯示時間資料
    public void printTime() {
        System.out.println(hour+":"+minute+":"+second);
    }
}
// 主程式類別
public class Ch13_3_3 {
    // 主程式
    public static void main(String[] args) {
        // 宣告Time類別型態的變數, 且建立物件
        Time open = new Time();
        Time close = new Time(21, 30, 50);
        System.out.print("開張時間: ");
        open.printTime();  // 呼叫物件的方法
        System.out.print("結束時間: ");
        close.printTime();
    }
}