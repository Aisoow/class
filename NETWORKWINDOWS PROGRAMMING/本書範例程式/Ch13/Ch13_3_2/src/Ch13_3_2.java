/* 程式範例: Ch13_3_2.java */
class Time {   // Time類別宣告
    private int hour;
    private int minute;
    private int second;
    // 成員方法(1): 設定時間資料
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;          // 設定小時
        this.minute = minute;      // 設定分
        this.second = second;      // 設定秒
    }
    // 成員方法(2): 設定時間資料
    public void setTime(int hour, int minute) {
        this.hour = hour;          // 設定小時
        this.minute = minute;      // 設定分
        second = 19;               // 設定秒
    }
    // 成員方法: 顯示時間資料
    public void printTime() {
        System.out.println(hour+":"+minute+":"+second);
    }
}
// 主程式類別
public class Ch13_3_2 {
    // 主程式
    public static void main(String[] args) {
        // 宣告Time類別型態的變數, 並且建立物件
        Time open = new Time();
        Time close = new Time();
        // 指定時間資料
        open.setTime(9, 30, 50);
        close.setTime(21, 30);
        System.out.print("開張時間: ");
        open.printTime();  // 呼叫物件的方法
        System.out.print("結束時間: ");
        close.printTime();
    }
}
