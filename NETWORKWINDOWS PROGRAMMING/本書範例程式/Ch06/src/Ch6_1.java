/* Java程式: Ch6_1.java */
public class Ch6_1 {
    // 主程式
    public static void main(String[] args) {
        int a = 5, b = 10;  // 變數宣告
        System.out.println("交換變數前: a= " + a + " b= " + b);
        {   // 在程式區塊交換a和b
            int temp;  /* 在區塊宣告變數 */
            temp = a;
            a = b;
            b = temp;
            System.out.println("區塊變數: temp= " + temp);
        }
        System.out.println("交換變數後: a= " + a + " b= " + b);
        // System.out.println("區塊變數: temp= " + temp);
    }
}
