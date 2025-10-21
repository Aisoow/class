/* 程式範例: Ch13_1_1.java */
class Order {          // Order外層類別
    private String orderNo;
    private OrderStatus itsStatus;
    class OrderStatus { // OrderStatus內層類別
        private boolean isShipped;
        private boolean isPaid;
        // 建構子: OrderStatus內層類別
        public OrderStatus(boolean shipped,boolean paid) {
            isShipped = shipped;
            isPaid = paid;
        }
        // 成員方法: 顯示訂單狀態
        public void printStatus() {
            System.out.println("->[內層類別]");
            System.out.println("->是否送貨: " + isShipped);
            System.out.println("->是否付款: " + isPaid);
        }
    }
    // 建構子: Order外層類別
    public Order(String no,boolean shipped,boolean paid) {
        this.orderNo = no;
        itsStatus = new OrderStatus(shipped,paid);
    }
    // 成員方法: 顯示訂單資料
    public void printOrder() {
        System.out.println("====[訂單資料]====");
        System.out.println("編號: " + orderNo);
        System.out.println("送貨: "+itsStatus.isShipped);
        System.out.println("付款: "+itsStatus.isPaid);
        itsStatus.printStatus(); // 呼叫內層類別的成員方法
    }
}
// 主程式類別
public class Ch13_1_1 {
    // 主程式
    public static void main(String[] args) {
        // 宣告物件變數且建立物件
        Order order1 = new Order("order001",false,false);
        Order order2 = new Order("order002",true,false);
        order1.printOrder();  // 顯示訂單資料
        order2.printOrder();
    }
}