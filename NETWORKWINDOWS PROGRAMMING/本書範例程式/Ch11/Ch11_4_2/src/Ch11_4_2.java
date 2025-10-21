/* 程式範例: Ch11_4_2.java */
class Customer {  // Customer類別宣告
    private String id;  // 成員變數
    private String name;
    private MyOrder itsOrder;
    // 建構子: 使用參數設定成員變數初始值
    public Customer(String id, String name) {
        this.id = id;             // 設定ID
        this.name = name;         // 設定姓名
    }
    // 成員方法: 指定所屬的訂單
    public void setOrder(MyOrder myOrder) {
        itsOrder = myOrder;
    }
    // 成員方法: 顯示客戶資料
    public void printCustomer() {
        System.out.println("ID: " + id);
        System.out.println("姓名: " + name);
        System.out.println("訂單編號: "+itsOrder.getNo());
        System.out.println("-------------------");
    }
}
class MyOrder {   // MyOrder類別宣告
    private String orderNo;  // 成員變數
    private boolean status;
    // 建構子: 使用參數設定成員變數初始值
    public MyOrder(String no, boolean s) {
        orderNo = no;                // 設定編號
        status = s;                  // 設定狀態
    }
    // 成員方法: 取得訂單編號
    public String getNo() { return orderNo; }
    // 成員方法: 顯示訂單資料
    public void printOrder() {
        System.out.println("->編號: " + orderNo);
        System.out.println("->狀態: " + status);
    }
}
// 主程式類別
public class Ch11_4_2 {
    // 主程式
    public static void main(String[] args) {
        // 宣告物件變數且建立物件
        Customer joe = new Customer("A1234", "陳會安");
        MyOrder myOrder = new MyOrder("2012", false);
        joe.setOrder(myOrder);  // 指定結合關係
        joe.printCustomer();    // 顯示客戶和訂單資料
        myOrder.printOrder();
    }
}
