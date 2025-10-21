/* 程式範例: Ch13_2_2.java */
class Student {   // Student類別宣告
    private String stdno;
    private String name;
    private int pos = 0;
    private Phone[] itsPhone = new Phone[3];
    // 建構子: 使用參數設定成員資料初始值
    public Student(String no, String name) {
        stdno = no;         // 設定學號
        this.name = name;   // 設定姓名
    }
    // 成員方法: 新增地址
    public void addPhone(Phone item) {
        itsPhone[pos] = item;
        pos++;
    }
    // 成員方法: 取得學號
    public String getNo() { return stdno; }
    // 成員方法: 顯示學生資料
    public void studentInfo() {
        System.out.println("學號: " + stdno);
        System.out.println("姓名: " + name);
        // 顯示電話資料
        for ( int i = 0 ; i < pos; i++ )
            System.out.println(itsPhone[i].getPhone());
    }
}
class Phone {   // Phone類別宣告
    private String type;     // 種類
    private String number;   // 號碼
    // 建構子: 使用參數設定成員資料初始值
    public Phone(String type, String number) {
        this.type = type;     // 設定種類
        this.number = number; // 設定號碼
    }
    // 成員方法: 傳回號碼
    public String getPhone() { return type+": "+number; }
}
// 主程式類別
public class Ch13_2_2 {
    // 主程式
    public static void main(String[] args) {
        // 宣告物件變數且建立物件
        Student joe = new Student("s001", "陳會安");
        Phone phone1 = new Phone("住宅", "02-22222222");
        Phone phone2 = new Phone("手機", "0999-4567-199");
        // 新增電話資料
        joe.addPhone(phone1);
        joe.addPhone(phone2);
        // 顯示學生資料
        joe.studentInfo();
    }
}
