/* 程式範例: Ch13_1_2.java */
class Payment {   // Payment外層類別
    private String payNo;
    private double amount;
    class Card {   // Card內層類別
        public String type;
        public String number;
        // 成員方法: 顯示信用卡資料
        public void printCard() {
            // 呼叫外層方法
            System.out.println("編號: " + getNo());
            // 顯示外層的成員變數
            System.out.println("金額: " + amount);
            // 顯示內層的成員變數
            System.out.println("卡別: " + type);
            System.out.println("卡號: " + number);
        }
    }
    // 建構子: 外層Payment
    public Payment(String no, double amount) {
        payNo = no;
        this.amount = amount;
    }
    // 成員方法: 傳回付款編號
    private String getNo() { return payNo; }
}
// 主程式類別
public class Ch13_1_2 {
    // 主程式
    public static void main(String[] args) {
        // 宣告Payment類別型態的變數, 並且建立物件
        Payment p1 = new Payment("pay002", 5600.0);
        // 建立內層類別的物件
        Payment.Card master = p1.new Card();
        master.type = "MASTER";  // 存取內層物件變數
        master.number = "2433-4444-7890-1234";
        master.printCard();    // 呼叫內層物件方法
    }
}
