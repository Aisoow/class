/* 程式範例: Ch7_3_2a.java */
public class Ch7_3_2a {
    // 主程式
    public static void main(String[] args) {
        int year = 0;     // 變數宣告
        double amount = 10000;
        double interest, rate = 0.12;
        // 計算本利和的do/while迴圈
        do {
            interest = amount * rate;
            amount = amount + interest;
            year = year + 1;
        } while ( amount > 2000 );
        System.out.println(year + "年 本利和 = " + amount);
    }
}
