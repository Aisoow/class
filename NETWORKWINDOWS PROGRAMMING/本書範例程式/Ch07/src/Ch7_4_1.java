/* 程式範例: Ch7_4_1.java */
public class Ch7_4_1 {
    // 主程式
    public static void main(String[] args) {
        int i = 1;   // 變數宣告
        do {
            System.out.print("|" + i + "|");
            i++;
            if ( i > 5 ) break; // 跳出迴圈
        } while ( true );
        System.out.print("\n");
    }
}
