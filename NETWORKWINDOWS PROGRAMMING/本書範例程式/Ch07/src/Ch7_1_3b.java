/* 程式範例: Ch7_1_3b.java */
public class Ch7_1_3b {
    // 主程式
    public static void main(String[] args) {
        int year;   // 變數宣告
        double amount = 10000;
        double interest, rate = 0.12;
        for ( year = 1; year <= 5; year++ ) {
            interest = amount * rate;
            amount=amount + interest;
        }
        System.out.println("本利和 = " + amount);
    }
}
