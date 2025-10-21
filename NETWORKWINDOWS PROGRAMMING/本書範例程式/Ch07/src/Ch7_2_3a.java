/* 程式範例: Ch7_2_3a.java */
public class Ch7_2_3a {
    // 主程式
    public static void main(String[] args) {
        int i, sum;  // 變數宣告
        sum = 0; i = 1;
        while ( i < 10 ) {
            sum += i;
            System.out.print(i + " ");
            i = i + 1;
        }
        System.out.println("\nsum = " + sum);
        sum = 0; i = 3;
        while (i <= 12) {
            sum += i;
            System.out.print(i + " ");
            i = i + 3;
        }
        System.out.println("\nsum = " + sum);
        sum = 0; i = 2;
        do {
            sum += i;
            System.out.print(i + " ");
            i = i + 2;
        } while ( i > 6 );
        System.out.println("\nsum = " + sum);
        sum = 0; i = 2;
        do {
            sum += i;
            System.out.print(i + " ");
            i = i + 2;
        } while ( i <= 6 );
        System.out.println("\nsum = " + sum);
    }
}
