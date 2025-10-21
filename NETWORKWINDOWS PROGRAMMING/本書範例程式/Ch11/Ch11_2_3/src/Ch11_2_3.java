/* 程式範例: Ch11_2_3.java */
class Student {  // Student類別宣告
    // 成員變數
    private String name;   // 姓名
    private String address;// 地址
    private int age;       // 年齡
    // 成員方法: 顯示學生名牌資料
    public void printNameCard() {
        System.out.println("姓名: " + name);
        System.out.println("地址: " + address);
        System.out.println("年齡: " + age);
        System.out.println("-------------------");
    }
    // 成員方法: 設定姓名資料
    public void setName(String n){ name = n; }
    // 成員方法: 設定地址資料
    public void setAddress(String a){ address = a; }
    // 成員方法: 設定年齡資料
    public boolean setAge(int v) {
        if ( validAge(v) ) { // 檢查是否合法
            age = v;          // 設定年齡
            return true;      // 設定成功
        }
        else return false;   // 設定失敗
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
public class Ch11_2_3 {
    // 主程式
    public static void main(String[] args) {
        int age;   // 變數宣告
        String name, address;
        // 宣告Student物件變數且建立物件
        Student joe = new Student();
        joe.setName("陳允傑");  // 呼叫方法設定joe資料
        joe.setAddress("新北巿");
        joe.setAge(21);
        joe.printNameCard();    // 顯示學生資料
        // 取得學生資料
        name = joe.getName();
        address = joe.getAddress();
        age = joe.getAge();
        // 顯示學生資料
        System.out.println("[姓名]: " + name);
        System.out.println("[地址]: " + address);
        System.out.println("[年齡]: " + age);
    }
}
