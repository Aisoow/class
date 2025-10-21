/* 程式範例: Ch7_4_2.java */
public class Ch7_4_2 {
    // 主程式
    public static void main(String[] args) {
        int i = 1;   // 變數宣告
        for ( i = 1; i <= 6; i++ ) {
            // 繼續迴圈
            if ( (i % 2) == 1 ) continue;
            System.out.print("|" + i + "|");
        }
        System.out.print("\n");
    }
}
