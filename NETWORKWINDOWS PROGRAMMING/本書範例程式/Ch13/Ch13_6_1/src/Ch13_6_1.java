/* 程式範例: Ch13_6_1.java */
interface IArea {  // IArea介面宣告
    // 介面方法: 計算面積
    void area();
}
class Circle implements IArea { // Circle類別宣告
    private double r;     // 半徑
    // 建構子
    public Circle(double r) {
        this.r = r;
    }
    // 成員方法: 實作介面方法area()
    public void area() {
        System.out.println("圓形面積: " + 3.1416*r*r);
    }
}
class Rectangle implements IArea {  // Rectangle類別宣告
    private double width;     // 寬
    private double height;    // 高
    // 建構子
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    // 成員方法: 實作介面方法area()
    public void area() {
        System.out.println("長方形面積: "+(width*height));
    }
}
class Triangle implements IArea {   // Triangle類別宣告
    private double height;    // 高
    private double bottom;    // 三角形底長
    // 建構子
    public Triangle(double height, double bottom) {
        this.height = height;
        this.bottom = bottom;
    }
    // 成員方法: 實作介面方法area()
    public void area() {
        System.out.println("三角形面積: "+height*bottom/2.0);
    }
}
// 主程式類別
public class Ch13_6_1 {
    // 主程式
    public static void main(String[] args) {
        IArea a;    // 介面的物件變數
        // 宣告類別型態的變數, 並且建立物件
        Circle c = new Circle(6.0);
        Rectangle r=new Rectangle(10.0, 15.0);
        Triangle t=new Triangle(20.0, 15.0);
        // 呼叫介面的介面方法area()
        for ( int i = 1; i <= 3; i++ ) {
            if ( i == 1 )        a = c;  // 圓形
            else if ( i == 2 ) a = r;  // 長方形
            else          a = t;  // 三角形
            a.area();
        }
    }
}