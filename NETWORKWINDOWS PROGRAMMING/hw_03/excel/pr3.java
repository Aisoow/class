public class pr3 {
    public static void main(String[] args) {
        int year = 5; // 變數宣告
        float a = 10000f, rate = 0.12f;
        float m = amount(a, rate, year);
        System.out.println("本利和 = " + m);
        System.out.format("amount is: %8.0f", m);
        System.out.println("\nnow hanoi tower demon:");
        hanoi(3, 'a', 'b', 'c');
        System.out.println("result of search: " + bin_search(14, 0, 10)); // 應該印出Z
    }

    static float amount(float m, float ir, int y) {
        float rate, interest, amount;
        int year = y;
        amount = m;
        rate = ir;
        for (year = 1; year <= 5; year++) {
            interest = amount * rate;
            amount = amount + interest;
        }
        return amount;
    }

    static void hanoi(int d, char a, char b, char c) {
        if (d == 1)
            System.out.println("move " + a + " to " + b);
        else {
            hanoi(d - 1, a, c, b);
            hanoi(1, a, b, c);
            hanoi(d - 1, c, b, a);
        }
    }

    // 比如 input v = 14 就會return 'F'
    static char bin_search(int v, int l, int u) {
        int key[] = { 3, 8, 13, 14, 17, 19, 20, 24, 25, 28, 33 };
        char val[] = { 'Z', 'Q', 'A', 'F', 'S', 'I', 'Q', 'B', 'X', 'H', 'R' };
        int m;
        
        // 如果搜尋範圍無效，返回 '0' 表示找不到
        if (l > u)
            return '0';
            
        m = (l + u) / 2; // 計算中間位置
        
        if (key[m] == v)
            return val[m]; // 找到了，返回對應的字元
        else if (key[m] > v)
            return bin_search(v, l, m - 1); // 在左半部繼續搜尋
        else
            return bin_search(v, m + 1, u); // 在右半部繼續搜尋
    }
}
