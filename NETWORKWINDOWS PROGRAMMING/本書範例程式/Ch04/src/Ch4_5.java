/* 程式範例: Ch4_5.java */
public class Ch4_5 {
    // 主程式
    public static void main(String[] args) {
        // 變數宣告
        int a = 0x3c;   // 00111100
        int b = 0x0f;   // 00001111
        int c = 0x03;   // 00000011
        int d = 0x78;   // 01111000
        int f = 0x03;   // 00000011
        int g = 120;    // 01111000
        int r;
        System.out.println("a/b的值 = " + a + "/" + b);
        System.out.println("c/d的值 = " + c + "/" + d);
        r = ~a;       // NOT運算
        System.out.println("NOT運算: ~a = " + r);
        r = a & b;    // AND運算
        System.out.println("AND運算: a & b = " + r);
        r = a | c;    // OR運算
        System.out.println("OR運算:  a | c = " + r);
        r = a ^ d;    // XOR運算
        System.out.println("XOR運算: a ^ d = " + r);
        // 左移與右移位元運算子
        System.out.println("f/g的值=" + f + "/" + g);
        System.out.println("左移運算: f<<1 = " +(f<<1));
        System.out.println("左移運算: f<<2 = " +(f<<2));
        System.out.println("右移運算: g>>1 = " +(g>>1));
        System.out.println("右移運算: g>>2 = " +(g>>2));
    }
}
