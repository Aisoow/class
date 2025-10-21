/* 程式範例: Ch7_2_3.java */
public class Ch7_2_3 {
    // 主程式
    public static void main(String[] args) {
        int upper, step, c; // 變數宣告
        double f;
        c = 100;   // 指定初值
        upper = 300;
        step = 20;
        System.out.println("攝氏\t華氏");
        while ( c <= upper ) {   // 結束條件
            f = (9.0 * c) / 5.0 + 32.0;
            System.out.println(c + "\t" + f);
            c += step;  // 增減計數器變數值
        }
    }
}
