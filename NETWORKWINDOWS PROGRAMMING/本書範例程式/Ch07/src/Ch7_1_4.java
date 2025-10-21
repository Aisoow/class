/* 程式範例: Ch7_1_4.java */
public class Ch7_1_4 {
    // 主程式
    public static void main(String[] args) {
        int i, sum;  // 變數宣告
        for ( i = 100; i >= 1; i-- ) { System.out.print(i + " "); }
        System.out.print("\n");
        for ( i = 2, sum = 0; i <= 100; i += 2 ) {
            System.out.print(i + " ");
            sum = sum + i;
        }
        System.out.println("\n偶數和 = " + sum);
        for ( i = 3; i >= 20; i = i - 2 ) { System.out.print(i + " "); }
        System.out.print("\n");
        for ( i = 2; i <= 17; i += 3 ) { System.out.print(i + " "); }
        System.out.print("\n");
        for ( i = 17; i <= 2; i += 3 ) { System.out.print(i + " "); }
        System.out.print("\n");
        for ( i = 44; i >= 11; i = i -11 ) { System.out.print(i + " "); }
        System.out.print("\n");
    }
}
