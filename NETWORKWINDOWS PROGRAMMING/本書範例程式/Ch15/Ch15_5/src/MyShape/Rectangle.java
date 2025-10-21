/* 程式範例: Rectangle.java */
package MyShape;
public class Rectangle extends Shape {  // Rectangle類別宣告
    private double width;     // 寬
    private double height;    // 高
    // 建構子
    public Rectangle(double x,double y,double w,double h) {
        this.x = x;
        this.y = y;
        width = w;
        height = h;
    }
    // 成員方法: 實作抽象方法area()
    public void area() {
        System.out.println("長方形面積: "+(height*width));
    }
}
