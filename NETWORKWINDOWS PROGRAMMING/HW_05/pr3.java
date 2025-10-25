
/* 程式範例: Ch11_3_2.java */
class Student {  // Student類別宣告
    // 成員變數
    private String name;   // 姓名
    private String address;// 地址
    private int age; // 年齡
    private int monthly_expense;
    // 建構子: 使用參數設定成員變數初始值
    public Student(String name, String address, int age,int monthly_expense) {
        this.name = name;          // 設定姓名
        this.address = address; // 設定地址
        this.monthly_expense = monthly_expense;
        if ( validAge(age) ) this.age = age; // 設定年齡
        else                 this.age = 20;  // 年齡初值
    }
    // 成員方法: 顯示學生名牌資料
    public void printNameCard() {
        System.out.println("\n姓名: " + name);
        System.out.println("\n地址: " + address);
        System.out.println("\n年齡: " + age);
        System.out.println("\n月花費: " + monthly_expense);
        rich_level();
        System.out.println("-------------------");
    }
    // 成員方法: 傳回姓名
    public String getName(){ return name; }
    // 成員方法: 傳回月份
    public String getAddress(){ return address; }
    // 成員方法: 傳回年齡
    public int getAge(){ return this.age; }
    // 成員方法: 檢查年齡資料
    private boolean validAge(int age) {
        // 合法年齡範圍：20 ~ 50（含）
        return age >= 20 && age <= 50;
    }

    public void rich_level()
    {
        System.out.println("\n經濟情況:");
        if(monthly_expense>=20000)
        {
            System.out.println("富有");
        }
        else if(monthly_expense >= 10000 && monthly_expense < 20000)
        {
            System.out.println("一般");
        }
        else
        {
            System.out.println("貧窮");
        }

    }
}
// 主程式類別
public class pr3 {
    // 主程式
    public static void main(String[] args) {
        // 宣告Student物件變數且建立物件
        Student chao = new Student("周傑輪",
                "台中市", 27,5000);
        Student lee = new Student("李小龍",
                "高雄巿", 26, 25000);
        Student me = new Student("鞠本瑄", "台北市", 19, 15000);
        chao.printNameCard();  // 顯示學生資料
        lee.printNameCard();
        me.printNameCard();
    }
}