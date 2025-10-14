public class pr4 {
    public static void main(String[] args) {
        // Find the roots
        // Find the root of f(x).
        // f(x) = x^2 - 4.2x + 3.6 = 0
        // g(x) = f'(x) = 2x - 4.2
        // g(x) = 0, then x = 2.1
        
        System.out.println("root 1 = " + bisection(-1, 2));
    }
    
    // 定義函數 f(x) = x^2 - 4.2x + 3.6
    static double f(double x) {
        return x * x - 4.2 * x + 3.6;
    }
    
    // 二分法求根
    static double bisection(double a, double b) {
        double mid;
        double epsilon = 0.0001; // 精確度
        
        // 持續二分直到達到精確度
        while ((b - a) >= epsilon) {
            // 計算中間點
            mid = (a + b) / 2;
            
            // 檢查中間點是否為根
            if (Math.abs(f(mid)) < epsilon)
                return mid;
            
            // 決定要在哪一半繼續搜尋
            if (f(mid) * f(a) < 0)
                b = mid; // 根在左半部
            else
                a = mid; // 根在右半部
        }
        
        return (a + b) / 2;
    }
}   