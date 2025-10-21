/* 程式範例: Ch12_2_2.java */
interface IArea {   // IArea介面宣告
    // 常數的宣告
    final double PI = 3.1415926;
    // 介面方法: 計算面積
    void area();
}
class Circle implements IArea { // Circle類別宣告
    public double x;   // X座標
    public double y;   // y座標
    private double r;  // 半徑
    // 建構子
    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
    // 實作IArea介面的方法area()
    public void area() {
        System.out.println("圓面積: " + PI*r*r);
    }
}
// 主程式類別
public class Ch12_2_2 {
    // 主程式
    public static void main(String[] args) {
        // 宣告類別型態的變數, 並且建立物件
        Circle c = new Circle(16.0, 15.0, 15.0);
        // 呼叫物件的介面方法area()
        c.area();
        // 顯示介面的常數值
        System.out.println("PI常數: " + IArea.PI);
    }
}