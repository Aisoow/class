/* 程式範例: Ch14_3_2.java */
public class Ch14_3_2 {
    // 類別方法: 計算a*b/c的值
    static int cal(int a, int b, int c)
            throws IllegalArgumentException,
            ArrayIndexOutOfBoundsException {
        int index;
        int[] data = {22, 14, 36, 68, 87};
        if ( c <= 0 ) { // 丟出IllegalArgumentException例外
            throw new IllegalArgumentException("c等於0!");
        }
        else {
            index = a*b/c;
            if ( index >= 5 ) {
                // 丟出ArrayIndexOutOfBoundsException例外
                throw new ArrayIndexOutOfBoundsException(
                        "陣列索引值大於等於5!");
            }
        }
        return data[index];
    }
    // 主程式
    public static void main(String[] args) {
        int result;
        try {
            // 取得亂數值
            int a = (int)(Math.random()*10);
            int b = (int)(Math.random()*10);
            int c = (int)(Math.random()*10);
            result = cal(a, b, c);  // 呼叫方法
            System.out.println("計算結果: " + result);
        }
        catch ( IllegalArgumentException e ) {
            // 處理IllegalArgumentException例外
            System.out.println("例外說明: "+e.getMessage());
            System.out.print("例外原因: ");
            e.printStackTrace();
        }
        catch ( ArrayIndexOutOfBoundsException e ) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
