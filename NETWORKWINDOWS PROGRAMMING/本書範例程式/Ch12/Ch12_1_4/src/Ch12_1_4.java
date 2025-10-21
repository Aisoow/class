/* 程式範例: Ch12_1_4.java */
class Person {  // Person類別宣告
    public int id;          // 身份字號
    private String name;    // 姓名
    private double height;  // 身高
    // 成員方法: 取得姓名
    public String getName() { return name; }
    // 成員方法: 取得身高
    public double getHeight() { return height; }
    // 成員方法: 設定姓名
    public void setName(String n) { name = n; }
    // 成員方法: 設定身高
    public void setHeight(double h) { height = h; }
}
class Student extends Person {  // Student類別宣告
    private String id;     // 隱藏成員變數
    private int score;     // 成績
    // 建構子
    public Student(String id,String n,double h,int score) {
        setName(n);  // 呼叫父類別的成員方法
        setHeight(h);
        this.id = id;
        this.score = score;
    }
    // 成員方法: 顯示學生資料
    public void studentInfo() {
        System.out.println("[學生資料]=====");
        System.out.println("字號: " + id);
        System.out.println("姓名: " + getName());
        System.out.println("身高: " + getHeight());
        System.out.println("成績: " + score);
    }
}
// 主程式類別
public class Ch12_1_4 {
    // 主程式
    public static void main(String[] args) {
        // 宣告Student類別型態的變數, 並且建立物件
        Student mary =
                new Student("A2255","小龍女",165.0,65);
        // 顯示學生資料
        mary.studentInfo();
    }
}