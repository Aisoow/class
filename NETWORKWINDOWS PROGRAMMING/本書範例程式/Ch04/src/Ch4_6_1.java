/* 程式範例: Ch4_6_1.java */
public class Ch4_6_1 {
    // 主程式
    public static void main(String[] args) {
        // 變數宣告
        int a = 123;
        float b = 15.5F;
        long c = 345678L;
        int r;      long r1;
        float r2;   double r3;
        // 寬基本型態轉換
        System.out.print("a(i)=" + a + " b(f)=" + b);
        System.out.println(" c(l)=" + c);
        r = a + 134;
        System.out.println("r(i)=a(i)+134(i)=" + r);
        r1 = a + c;
        System.out.println("r1(l)=a(i)+c(l)=" + r1);
        r2 = a * b;
        System.out.println("r2(f)=a(i)*b(f)=" + r2);
        r3 = c * b;
        System.out.println("r3(d)=c(l)*b(f)=" + r3);
    }
}
