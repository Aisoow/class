/* 程式範例: Ch12_4_2.java */
interface IArea {  // IArea介面宣告
    // 常數的宣告
    final double PI = 3.1415926;
    // 介面方法: 計算面積
    void area();
}
interface IShow {  // IShow介面宣告
    // 介面方法: 顯示基本資料
    void show();
}
// IShape介面宣告, 繼承IArea和IShow
interface IShape extends IArea, IShow {
    // 介面方法: 計算周長
    void perimeter();
}
class Circle implements IShape { // Circle類別宣告
    public double x;   // X座標
    public double y;   // y座標
    private double r;  // 半徑
    // 建構子
    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
    // 實作IShape介面的方法area()
    public void area() {
        System.out.println("圓面積: " + PI*r*r);
    }
    // 實作IShape介面的方法perimeter()
    public void perimeter() {
        System.out.println("圓周長: " + 2.0*PI*r);
    }
    // 實作IShape介面的方法show()
    public void show() {
        System.out.println("圓心X座標: " + x);
        System.out.println("圓心Y座標: " + y);
        System.out.println("圓半徑: " + r);
    }
}
// 主程式類別
public class Ch12_4_2 {
    // 主程式
    public static void main(String[] args) {
        // 宣告類別型態的變數, 並且建立物件
        Circle c = new Circle(16.0, 15.0, 16.0);
        c.area();       // 呼叫介面方法area()
        c.perimeter();  // 呼叫介面方法perimeter()
        c.show();       // 呼叫介面方法show()
    }
}