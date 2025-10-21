/* 程式範例: Ch3_4_1a.java */
public class Ch3_4_1a {
    // 主程式
    public static void main(String[] args) {
        int val = 46340;        // 宣告變數
        int result, result1, result2;
        // 沒有溢位的運算
        result = val * val;                    // 2147395600
        System.out.println("result(整數) = " + result);
        int overflowVal = 46341;
        // 整數溢位的運算
        result2 = overflowVal * overflowVal;   // -2147479015
        System.out.println("result2(溢位) = " + result2);
        long val1 = 46341L;   // 使用長整數和字尾型態字元
        long result3 =  val1 * val1;           // 2147488281
        System.out.println("result3(長整數) = " + result3);
        long result4, result5;
        // 整數溢位的運算
        result4 = 24 * 60 * 60 * 1000 * 1000;
        System.out.println("result4(溢位) = " + result4);
        // 沒有溢位的運算, 使用展整數
        result5 = 24L * 60L * 60L * 1000L * 1000L;
        System.out.println("result5(長整數) = " + result5);
    }
}
