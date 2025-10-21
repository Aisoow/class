/* 程式範例: Ch12_6.java */
class Person {   // Person類別宣告
    public String name;   // 姓名
    public String address;// 地址
    // 成員方法: 傳回姓名
    public final String getName() { return name; }
    // 成員方法: 傳回地址
    public final String getAddress() { return address; }
    // 成員方法: 設定姓名
    public final void setName(String n) { name = n; }
    // 成員方法: 設定地址
    public final void setAddress(String a) {address = a;}
}
// Customer類別宣告
final class Customer extends Person {
    public String shippingAddress;  // 送貨地址
    // 建構子
    public Customer(String n,String a,String shipping) {
        setName(n);
        setAddress(a);
        shippingAddress = shipping;
    }
    // 成員方法: 顯示客戶資料
    public void customerInfo() {
        System.out.println("-------------------");
        System.out.println(" 姓名: " + getName());
        System.out.println(" 地址: " + getAddress());
        System.out.println(" 送貨地址: "+shippingAddress);
        System.out.println("-------------------");
    }
}
// 主程式類別
public class Ch12_6 {
    // 主程式
    public static void main(String[] args) {
        // 宣告Customer類別型態的變數, 並且建立物件
        Customer joe = new Customer("陳會安",
                "台北市","桃園市");
        joe.customerInfo();  // 呼叫物件的方法
    }
}
