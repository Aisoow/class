/* 程式範例: Ch11_5.java */
class Order {   // Order類別宣告
    private String orderNo;  // 成員變數
    private boolean status;
    private int pos = 0;
    private OrderItem[] itsItem = new OrderItem[5];
    // 建構子: 使用參數設定成員變數初始值
    public Order(String no, boolean s) {
        orderNo = no;  status = s;
    }
    // 成員方法: 新增至訂單項目
    public void addOrder(OrderItem item) {
        itsItem[pos] = item;  pos++;
    }
    // 成員方法: 取得訂單編號
    public String getNo() { return orderNo; }
    // 成員方法: 顯示訂單資料
    public void printOrder() {
        OrderItem temp;
        System.out.println("訂單編號: " + orderNo);
        System.out.println("訂單狀態: " + status);
        // 顯示訂單項目
        System.out.println("書號\t書名\t\t數量");
        for ( int i = 0 ; i < pos; i++ )
            System.out.println(itsItem[i].myBook.getNo()
                    + "\t" + itsItem[i].myBook.getTitle()
                    + "\t" + itsItem[i].getQuantity());
    }
}
class OrderItem {  // OrderItem類別宣告, 結合類別
    private int quantity;  // 成員變數
    public Order myOrder;
    public Book myBook;
    // 建構子: 使用參數設定成員資料初始值
    public OrderItem(int quantity,Order order,Book book) {
        this.quantity = quantity;   // 設定數量
        myOrder = order;            // 建立結合關係
        myBook = book;
        order.addOrder(this); // Order一對多OrderItem
        book.addBook(this);   // Book一對多OrderItem
    }
    // 成員方法: 傳回數量
    public int getQuantity() { return quantity; }
}
class Book {  // Book類別宣告
    private String bookNo;  // 成員變數
    private String title;
    private int pos = 0;
    private OrderItem[] itsItem = new OrderItem[5];
    // 建構子: 使用參數設定成員變數初始值
    public Book(String no, String title) {
        bookNo = no; this.title = title;
    }
    // 成員方法: 新增至訂單項目
    public void addBook(OrderItem item) {
        itsItem[pos] = item;  pos++;
    }
    // 成員方法: 取得書號
    public String getNo()  { return bookNo; }
    // 成員方法: 取得書名
    public String getTitle()  { return title; }
    // 成員方法: 顯示圖書銷售資料
    public void printBook() {
        OrderItem temp;
        System.out.println("書號: " + bookNo);
        System.out.println("書名: " + title);
        // 顯示訂單項目
        System.out.println("訂單編號\t數量");
        for ( int i = 0 ; i < pos; i++ )
            System.out.println(itsItem[i].myOrder.getNo()
                    + "\t" + itsItem[i].getQuantity());
    }
}
// 主程式類別
public class Ch11_5 {
    // 主程式
    public static void main(String[] args) {
        // 宣告物件變數且建立物件
        Order order1 = new Order("order001", false);
        Order order2 = new Order("order002", false);
        Book book1 = new Book("b001", "Java程式設計");
        Book book2 = new Book("b002", "C/C++程式設計");
        Book book3 = new Book("b003", "PHP網頁設計");
        // 新增訂單的項目
        OrderItem item1 = new OrderItem(4, order1, book1);
        OrderItem item2 = new OrderItem(6, order1, book2);
        OrderItem item3 = new OrderItem(8, order2, book3);
        OrderItem item4 = new OrderItem(5, order2, book2);
        order1.printOrder();  // 顯示訂單資料
        System.out.println("------------------");
        order2.printOrder();
        System.out.println("------------------");
        book2.printBook();
        System.out.println("------------------");
        book3.printBook();
        System.out.println("------------------");
    }
}