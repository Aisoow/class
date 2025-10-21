/* 程式範例: Ch14_2_1.java */
public class Ch14_2_1 {
    // 主程式
    public static void main(String[] args) {
        int i;
        // 例外處理程式敘述
        try {
            // 產生除以零的例外
            for ( i = 2; i > -1; i-- )
                System.out.println("計算結果: "+10/i);
        }
        catch( ArithmeticException e ) {
            // 顯示例外資訊
            System.out.println("例外說明: "+e.getMessage());
            System.out.print("例外原因: ");
            e.printStackTrace();
        }
        finally {
            System.out.println("例外處理結束");
        }
        System.out.println("Java程式執行結束!");
    }
}
