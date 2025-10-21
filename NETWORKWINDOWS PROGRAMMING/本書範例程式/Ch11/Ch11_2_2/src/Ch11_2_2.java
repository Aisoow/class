/* 程式範例: Ch11_2_2.java */
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
    public void setAge(int v) { age = v; }
    // 成員方法: 傳回姓名
    public String getName(){ return name; }
    // 成員方法: 傳回地址
    public String getAddress(){ return address; }
    // 成員方法: 傳回年齡
    public int getAge(){ return age; }
}
// 主程式類別
public class Ch11_2_2 {
    // 主程式
    public static void main(String[] args) {
        // 宣告Student物件變數且建立物件
        Student joe = new Student();
        Student jane = new Student();
        joe.setName("陳會安");  // 呼叫方法設定joe資料
        joe.setAddress("新北巿");
        joe.setAge(37);
        jane.setName("江小魚"); // 呼叫方法設定jane資料
        jane.setAddress("台北市");
        jane.setAge(30);
        jane.printNameCard();   // 呼叫方法顯示學生資料
        // 取得學生資料
        String name = joe.getName();
        String address = joe.getAddress();
        int age = joe.getAge();
        // 顯示學生資料
        System.out.println("[姓名]: " + name);
        System.out.println("[地址]: " + address);
        System.out.println("[年齡]: " + age);
    }
}
