/* 程式範例: Ch13_2_1.java */
class Student {   // Student類別宣告
    public String stdno;
    private double test1, test2;
    private Date birthday;  // Date物件
    // 建構子: 使用參數設定初始值
    public Student(String stdno, int d, int m, int y) {
        this.stdno = stdno;
        birthday = new Date(d, m, y, this); // 建立Date物件
    }
    // 成員方法: 設定考試成績
    public void setTest(double t1, double t2) {
        test1 = t1;    // 設定成績
        test2 = t2;
    }
    // 成員方法: 計算平均
    private double getAverage() {
        return (test1+test2)/2;
    }
    // 成員方法: 顯示學生資料
    public void studentInfo() {
        System.out.println("==[學生資料]==== ");
        System.out.println("學號: " + stdno);
        System.out.println("生日: " + birthday.getDate());
        System.out.println("成績(1): " + test1);
        System.out.println("成績(2): " + test2);
        System.out.println("成績平均: " + getAverage());
    }
}
class Date {  // Date類別宣告
    private int day;
    private int month;
    private int year;
    private Student student;
    // 建構子: 使用參數設定成員資料初始值
    public Date(int d, int m, int y, Student std) {
        day = d;        // 設定日期
        month = m;      // 設定月份
        year = y;       // 設定年份
        student = std;  // 指定學生
    }
    // 成員方法: 取得日期資料
    public String getDate() {
        return student.stdno+":"+month+"/"+day+"/"+year;
    }
}
// 主程式類別
public class Ch13_2_1 {
    // 主程式
    public static void main(String[] args) {
        // 宣告Student類別型態的變數, 並且建立物件
        Student std1 = new Student("s001", 12, 3, 1978);
        Student std2 = new Student("s002", 24, 5, 1975);
        std1.setTest(78.0, 65.0);  // 設定考試成績
        std2.setTest(97.0, 55.0);
        std1.studentInfo();  // 呼叫物件的方法
        std2.studentInfo();
    }
}