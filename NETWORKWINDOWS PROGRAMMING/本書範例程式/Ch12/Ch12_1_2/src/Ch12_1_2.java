/* 程式範例: Ch12_1_2.java */
class Person {  // Person類別宣告
    private int id;         // 身份字號
    private String name;    // 姓名
    private double height;  // 身高
    // 成員方法: 設定身份字號
    public void setID(int id) { this.id = id; }
    // 成員方法: 設定姓名
    public void setName(String n) { name = n; }
    // 成員方法: 設定身高
    public void setHeight(double h) { height = h; }
    // 成員方法: 顯示個人資料
    public void personInfo() {
        System.out.println("字號: " + id);
        System.out.println("姓名: " + name);
        System.out.println("身高: " + height);
    }
}
class Student extends Person {  // Student類別宣告
    private int score;     // 成績
    // 建構子
    public Student(int id,String n,double h, int score) {
        setID(id);      // 呼叫父類別的成員方法
        setName(n);
        setHeight(h);
        this.score = score;
    }
    // 成員方法: 顯示學生資料
    public void studentInfo() {
        System.out.println("[學生資料]=====");
        personInfo();       // 呼叫父類別的成員方法
        System.out.println("成績: " + score);
    }
}
// 主程式類別
public class Ch12_1_2 {
    // 主程式
    public static void main(String[] args) {
        // 宣告Student類別型態的變數, 並且建立物件
        Student joe = new Student(1234,"陳會安",175.0,85);
        Student jane = new Student(3456,"江小魚",150.0,65);
        // 更改身高 - 呼叫繼承的方法
        jane.setHeight(158.0);
        // 顯示學生資料
        joe.studentInfo();
        jane.studentInfo();
    }
}