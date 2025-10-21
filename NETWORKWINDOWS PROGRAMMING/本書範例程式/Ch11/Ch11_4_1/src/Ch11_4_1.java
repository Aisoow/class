/* 程式範例: Ch11_4_1.java */
class Salesperson {  // Salesperson類別宣告
    private String salesNo;   // 成員變數
    private String name;
    private Order itsOrder;
    // 建構子: 使用參數設定成員變數初始值
    public Salesperson(String no, String name) {
        salesNo = no;          // 業務編號
        this.name = name;      // 設定業務姓名
    }
    // 成員方法: 指定所屬訂單
    public void setOrder(Order myOrder) {
        itsOrder = myOrder;
    }
    // 成員方法: 顯示業務資料
    public void printSalesperson() {
        System.out.println("->編號:" + salesNo);
        System.out.println("->姓名:" + name);
        System.out.println("->訂單編號:"+itsOrder.getNo());
    }
}
class Order {  // Order類別宣告
    private String orderNo;  // 成員變數
    private boolean status;  // 目前處理狀態
    private Salesperson itsPerson;
    // 建構子: 使用參數設定成員變數初始值
    public Order(String no, boolean s) {
        orderNo = no;         // 設定編號
        status = s;           // 設定狀態
    }
    // 成員方法: 指定所屬業務
    public void setPerson(Salesperson myPerson) {
        itsPerson = myPerson;
    }
    // 成員方法: 取得訂單編號
    public String getNo() { return orderNo; }
    // 成員方法: 顯示訂單資料
    public void printOrder() {
        System.out.println("編號:" + orderNo);
        System.out.println("狀態:" + status);
        System.out.println("所屬業務員: ");
        itsPerson.printSalesperson();
        System.out.println("-------------------");
    }
}
// 主程式類別
public class Ch11_4_1 {
    // 主程式
    public static void main(String[] args) {
        // 宣告物件變數且建立物件
        Salesperson joe = new Salesperson("p101","陳會安");
        Order myOrder = new Order("2011", false);
        joe.setOrder(myOrder);  // 指定結合關係
        myOrder.setPerson(joe);
        myOrder.printOrder();   // 顯示訂單資料
    }
}
