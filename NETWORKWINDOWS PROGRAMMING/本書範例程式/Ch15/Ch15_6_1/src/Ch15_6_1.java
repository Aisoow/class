/* 程式範例: Ch15_6_1.java */
import MyDraw.Point;
import MyDraw.Line;
class ColorPoint extends Point {
    private int color;
    // 建構子
    public ColorPoint(double x, double y, int color) {
        super(x, y);
        this.color = color;
    }
    // 成員方法: 顯示座標
    public void show() {
        System.out.println("X座標: " + x);
        System.out.println("Y座標: " + y);
        System.out.println("色彩: " + color);
    }
}
// 主程式類別
public class Ch15_6_1 {
    // 主程式
    public static void main(String[] args) {
        // 宣告類別型態的變數, 並且建立物件
        Point p = new Point(4.0, 3.0);
        Line l = new Line(5.0, 10.0, 4.0, 20.0);
        ColorPoint cp = new ColorPoint(5.0, 5.0, 10);
        // 呼叫物件的方法
        l.show();
        cp.show();
        // System.out.println("X座標: " + p.x);
        // System.out.println("Y座標: " + p.y);
    }
}
