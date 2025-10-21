/* 程式範例: Ch13_5.java */
abstract class Shape {   // Shape抽象類別宣告
    public double x;   // X座標
    public double y;   // y座標
    // 抽象方法: 計算面積
    public abstract void area();
}
class Circle extends Shape {  // Circle類別宣告
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
class Rectangle extends Shape {  // Rectangle類別宣告
    private double width;     // 寬
    private double height;    // 高
    // 建構子
    public Rectangle(double x,double y,
                     double w,double h) {
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
class Triangle extends Shape {  // Triangle類別宣告
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
// 主程式類別
public class Ch13_5 {
    // 主程式
    public static void main(String[] args) {
        Shape s;    // 抽象類別的物件變數
        // 宣告類別型態的變數, 並且建立物件
        Circle c = new Circle(5.0, 10.0, 5.0);
        Rectangle r=new Rectangle(10.0,10.0,15.0,15.0);
        Triangle t=new Triangle(10.0,10.0,20.0,5.0);
        // 呼叫抽象類型物件的抽象方法area()
        for ( int i = 1; i <= 3; i++ ) {
            if ( i == 1 )        s = c;  // 圓形
            else if ( i == 2 ) s = r;  // 長方形
            else          s = t;  // 三角形
            s.area();
        }
    }
}