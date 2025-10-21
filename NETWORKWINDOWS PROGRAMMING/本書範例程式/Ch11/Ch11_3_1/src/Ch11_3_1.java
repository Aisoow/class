/* 程式範例: Ch11_3_1.java */
class Student {  // Student類別宣告
    // 成員變數
    private String name;   // 姓名
    private String address;// 地址
    private int age;       // 年齡
    // 建構子: 使用參數設定成員變數初始值
    public Student(String n, String a, int v) {
        name = n;            // 設定姓名
        address = a;         // 設定地址
        if ( validAge(v) ) age = v;  // 設定年齡
        else               age = 20; // 年齡初值
    }
    // 成員方法: 顯示學生名牌資料
    public void printNameCard() {
        System.out.println("姓名: " + name);
        System.out.println("地址: " + address);
        System.out.println("年齡: " + age);
        System.out.println("-------------------");
    }
    // 成員方法: 傳回姓名
    public String getName(){ return name; }
    // 成員方法: 傳回月份
    public String getAddress(){ return address; }
    // 成員方法: 傳回年齡
    public int getAge(){ return age; }
    // 成員方法: 檢查年齡資料
    private boolean validAge(int a) {
        // 檢查年齡資料是否在範圍內
        if ( a < 20 || a > 50 ) return false;
        else  return true;   // 合法的年齡資料
    }
}
// 主程式類別
public class Ch11_3_1 {
    // 主程式
    public static void main(String[] args) {
        // 宣告Student物件變數且建立物件
        Student tom = new Student("楊過",
                "台中市", 27);
        Student mary = new Student("小龍女",
                "高雄巿", 25);
        tom.printNameCard();  // 顯示學生資料
        mary.printNameCard();
    }
}
