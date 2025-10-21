/* Java程式: Ch6_4.java */
public class Ch6_4 {
    // 主程式
    public static void main(String[] args) {
        int height;   // 變數宣告
        java.util.Scanner sc =
                new java.util.Scanner(System.in);
        System.out.print("請輸入身高=> ");
        height = sc.nextInt(); // 取得身高值
        if ( height > 120 ) {
            System.out.println("購買全票!");
        }
        else {
            System.out.println("購買半票!");
        }
    }
}
