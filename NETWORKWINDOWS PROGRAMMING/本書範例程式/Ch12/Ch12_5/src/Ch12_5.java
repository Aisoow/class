/* 程式範例: Ch12_5.java */
abstract class Account {      // Account類別宣告
    public String accountid;   // 帳戶編號
    private double amount;     // 帳戶餘額
    public double interest;    // 利息
    // 抽象方法: 計算利息
    public abstract void calInterest();
    // 成員方法: 指定帳戶餘額
    public void setBalance(double a) { amount = a; }
    // 成員方法: 取得帳戶餘額
    public double getBalance() { return amount; }
}
// SavingAccount類別宣告
class SavingAccount extends Account {
    public boolean haveCard;
    // 建構子
    public SavingAccount(String id, double amount,
                         double interest, boolean haveCard) {
        accountid = id;
        setBalance(amount);
        this.interest = interest;
        this.haveCard = haveCard;
    }
    // 成員方法: 實作抽象方法calInterest()
    public void calInterest() {
        double amount = getBalance();
        System.out.println("利息: " + (amount*interest));
    }
}
// 主程式類別
public class Ch12_5 {
    // 主程式
    public static void main(String[] args) {
        SavingAccount s;   // SavingAccount類別的物件變數
        // 宣告SavingAccount類別型態的變數, 並且建立物件
        SavingAccount s1 = new SavingAccount(
                "002-10-222-345", 5000.00, 0.015, true);
        Account s2 = new SavingAccount("002-10-333-123",
                15000.00, 0.02, false);
        // 顯示帳戶s1的資料
        System.out.println("存款帳戶s1的資料 =====");
        System.out.println("帳號: " + s1.accountid);
        System.out.println("餘額: " + s1.getBalance());
        System.out.println("利率: " + s1.interest);
        System.out.println("是否有ATM卡: " + s1.haveCard);
        s1.calInterest();  // 呼叫物件的方法
        // 顯示帳戶s2的資料, 檢查是否為SavingAccount物件
        if ( s2 instanceof SavingAccount)
            System.out.println("->s2是SavingAccount物件");
        System.out.println("存款帳戶s2的資料 =====");
        s = (SavingAccount) s2;   // 型態轉換
        System.out.println("帳號: " + s2.accountid);
        System.out.println("餘額: " + s2.getBalance());
        System.out.println("利率: " + s.interest);
        System.out.println("是否有ATM卡: " + s.haveCard);
        s2.calInterest();  // 呼叫物件的方法
    }
}