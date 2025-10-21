/* 程式範例: Ch12_2_4.java */
interface IPrint {  // IPrint介面宣告
    // 介面方法: 顯示基本資料
    void print();
}
class Vehicle implements IPrint { // Vehicle類別宣告
    public int engineNo;   // 引擎號碼
    public String name;    // 型號名稱
    public double price;   // 價格
    // 介面方法: 顯示交通工具資料
    public void print() {
        System.out.println("型號: " + name);
        System.out.println("引擎號碼: " + engineNo);
        System.out.println("價格: " + price);
    }
}
// Car類別宣告
class Car extends Vehicle implements IPrint {
    private int doors;     // 幾門車
    // 建構子
    public Car(String name,int n,double price,int doors) {
        engineNo = n;
        this.name = name;
        this.price = price;
        this.doors = doors;
    }
    // 介面方法: 顯示轎車資料
    public void print() {
        System.out.println("====轎車資料====");
        super.print();     // 呼叫父類別的成員方法
        System.out.println("車有幾門: " + doors);
    }
}
// 主程式類別
public class Ch12_2_4 {
    // 主程式
    public static void main(String[] args) {
        // 宣告Car類別型態的變數, 並且建立物件
        Car bmw = new Car("318i",1234567,160.0,4);
        Car audi = new Car("TT Coupe", 5678924, 200, 4);
        bmw.print();  // 顯示轎車資料
        audi.print();
    }
}
