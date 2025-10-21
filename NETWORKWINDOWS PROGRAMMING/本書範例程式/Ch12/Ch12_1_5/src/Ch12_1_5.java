/* 程式範例: Ch12_1_5.java */
class Person {  // Person類別宣告
    public static int count = 0; // 計算學生數
    public int id;               // 身份字號
    public String name;          // 姓名
    // 建構子
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
        count++;
    }
    // 成員方法: 顯示個人資料
    public void personInfo() {
        System.out.println("===[個人資料]=====");
    }
}
class Student extends Person {  // Student類別宣告
    private String id;    // 隱藏成員變數
    private String name;
    private int score;    // 成績
    // 建構子
    public Student(int id,String n,String no,int score) {
        super(id, n);      // 呼叫父類別的建構子
        name = "學生";
        this.id = no;
        this.score = score;
    }
    // 成員方法: 顯示學生資料
    public void personInfo() {
        super.personInfo();
        System.out.println("姓名(父): " + super.name);
        System.out.println("字號(父): " + super.id);
        System.out.println("職業(子): " + name);
        System.out.println("學號(子): " + id);
        System.out.println("學生數: " + count);
        System.out.println("成績: " + score);
    }
}
// 主程式類別
public class Ch12_1_5 {
    // 主程式
    public static void main(String[] args) {
        // 宣告Student類別型態的變數, 並且建立物件
        Student joe = new Student(1234,"陳會安","S102",85);
        Student tom = new Student(3467,"陳允傑","S222",75);
        // 顯示學生資料
        joe.personInfo();
        tom.personInfo();
    }
}