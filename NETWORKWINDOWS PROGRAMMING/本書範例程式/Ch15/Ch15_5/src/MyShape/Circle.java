/* 程式範例: Circle.java */
package MyShape;
public class Circle extends Shape {  // Circle類別宣告
    private double r;     // 半徑
    // 建構子
    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
    // 成員方法: 實作抽象方法area()
    public void area() {
        System.out.println("圓形面積: " + 3.1416*r*r);
    }
}