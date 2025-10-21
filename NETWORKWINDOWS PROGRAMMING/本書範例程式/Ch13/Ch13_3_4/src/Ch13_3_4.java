/* 程式範例: Ch13_3_4.java */
class Time {   // Time類別宣告
    private int hour;
    private int minute;
    private int second;
    // 建構子(1): 沒有參數
    public Time() { this(10, 30, 50); }
    // 建構子(2): 只有日期參數
    public Time(int h) { this(h, 30, 50); }
    // 建構子(3): 只有日期和月份參數
    public Time(int h, int m) { this(h, m, 50); }
    // 建構子(4): 使用參數設定成員資料的初始值
    public Time(int hour, int minute, int second) {
        this.hour = hour;          // 設定小時
        this.minute = minute;      // 設定分
        this.second = second;      // 設定秒
    }
    // 成員方法: 顯示時間資料
    public void printTime() {
        System.out.println(hour+":"+minute+":"+second);
    }
}
// 主程式類別
public class Ch13_3_4 {
    // 主程式
    public static void main(String[] args) {
        // 宣告Time類別型態的變數, 並且建立物件
        Time open = new Time();
        Time close = new Time(22);
        Time teaTime = new Time(15, 30);
        Time breakTime = new Time(12, 30, 20);
        System.out.print("開張時間: ");
        open.printTime();  // 呼叫物件的方法
        System.out.print("結束時間: ");
        close.printTime();
        System.out.print("午茶時間: ");
        teaTime.printTime();
        System.out.print("午休時間: ");
        breakTime.printTime();
    }
}