/* 程式範例: Line.java */
package MyDraw;
public class Line extends Point {  // Line類別宣告
    private double x1;
    private double y1;
    // 建構子
    public Line(double x, double y, double x1, double y1) {
        super(x, y);
        this.x1 = x1;
        this.y1 = y1;
    }
    // 成員方法: 顯示座標
    public void show() {
        System.out.println("X座標: " + x);
        System.out.println("Y座標: " + y);
        System.out.println("X1座標: " + x1);
        System.out.println("Y1座標: " + y1);
    }
}
