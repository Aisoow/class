/* 程式範例: Ch11_6.java */
class Student {   // Student類別宣告
    // 類別變數: 老師編號
    public static String teacherNo = "T100";
    // 類別變數: 學生人數
    private static int count = 0;
    private int stdno;
    private double test1, test2, test3;
    // 建構子: 使用參數設定初始值
    public Student(int no,double t1,double t2,double t3) {
        stdno = no;
        this.test1 = t1;  // 設定成績
        this.test2 = t2;
        this.test3 = t3;
        count++;          // 學生人數加一
    }
    // 類別方法: 傳回學生的個數
    public static int getStudentCount() { return count; }
    // 成員方法: 計算平均
    private double getAverage() {
        return (test1 + test2 + test3) / 3;
    }
    // 成員方法: 顯示學生資料
    public void printStudent() {
        // 顯示學生的基本和成績資料
        System.out.println("===學生資料============== ");
        System.out.println("學生學號 : " + stdno);
        System.out.println("學生成績(1) : " + test1);
        System.out.println("學生成績(2) : " + test2);
        System.out.println("學生成績(3) : " + test3);
        System.out.println("成績平均 : " + getAverage());
    }
}
// 主程式類別
public class Ch11_6 {
    // 主程式
    public static void main(String[] args) {
        // 宣告Student05類別型態的變數, 並且建立物件
        Student std1 = new Student(1, 68.0, 88.0, 56.0);
        Student std2 = new Student(2, 75.0, 46.0, 90.0);
        System.out.println("老師編號(Student): " +
                   Student.teacherNo);
        // 呼叫物件的方法
        std1.printStudent();
        std2.printStudent();
        // 顯示學生人數
        System.out.println("學生人數(std1): " +
                std1.getStudentCount());
        System.out.println("學生人數(std2): " +
                std2.getStudentCount());
        System.out.println("學生人數(Student): " +
                Student.getStudentCount());
        Student.teacherNo = "T101";    // 更新老師編號
        std1.teacherNo = "T102";
        // 顯示老師編號
        System.out.println("老師編號(std1): " +
                std1.teacherNo);
        System.out.println("老師編號(std2): " +
                std2.teacherNo);
        System.out.println("老師編號(Student): " +
                Student.teacherNo);
    }
}
