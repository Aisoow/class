/* 程式範例: Triangle.java */
package MyShape;
public class Triangle extends Shape {  // Triangle類別宣告
    private double height;    // 高
    private double bottom;    // 三角形底
    // 建構子
    public Triangle(double x,double y,double h,double b) {
        this.x = x;
        this.y = y;
        height = h;
        bottom  = b;
    }
    // 成員方法: 實作抽象方法area()
    public void area() {
        System.out.println("三角形面積: "+height*bottom/2.0);
    }
}
