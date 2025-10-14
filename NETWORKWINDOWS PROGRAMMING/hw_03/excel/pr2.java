public class pr2 {
    static void funcA(int c, boolean b) {
        c++;
        b = false;
        System.out.println("在funcA為 :" + c + "-" + b);
    }

    // 類別方法: 陣列與字串物件參數為傳址
    static void funcB(int temp[], String a) {
        temp[1] = 150;
        a = "江小魚";
        System.out.println("在funcB為 : " + temp[1] + "-" + a);
    }

    static void funcC(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            arr[j] = arr[j] * arr[j] + 1;
        }

    }

    // 主程式
    public static void main(String[] args) {
        // 變數宣告
        /*
         * int c = 1; // 數字
         * boolean b = true; // 布林
         * String str = "陳允傑"; // 字串
         */
        int arr[] = { 1, 2, 3 }; // 陣列
        /*
         * System.out.println("呼叫funcA前: " + c + "-" + b);
         * // 呼叫類別方法
         * funcA(c, b);
         * System.out.println("呼叫funcA後: " + c + "-" + b);
         * System.out.println("呼叫funcB前: " + arr[1] + "-" + str);
         * // 呼叫類別方法
         * funcB(arr, str);
         * System.out.println("呼叫funcB後: " + arr[1] + "-" + str);
         */
        funcC(arr);
        for (int j = 0; j < arr.length; j++)
            System.out.println(arr[j]);
    }
}
