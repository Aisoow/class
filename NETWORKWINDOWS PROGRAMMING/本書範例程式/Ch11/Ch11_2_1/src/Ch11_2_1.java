/* 程式範例: Ch11_2_1.java */
class Student {  // Student類別宣告
    // 成員變數
    public String name;   // 姓名
    public String address;// 地址
    public int age;       // 年齡
    // 成員方法: 顯示學生名牌資料
    public void printNameCard() {
        System.out.println("姓名: " + name);
        System.out.println("地址: " + address);
        System.out.println("年齡: " + age);
        System.out.println("-------------------");
    }
}
// 主程式類別
public class Ch11_2_1 {
    // 主程式
    public static void main(String[] args) {
        // 宣告Student類別型態的變數
        Student joe, jane, current, empty;
        // 建立物件實例
        joe = new Student();
        jane = new Student();
        current = joe;
        empty = null;  // 指定成null參考
        joe.name = "陳會安";  // 設定joe物件的變數
        joe.address = "新北巿";
        joe.age = 37;
        jane.name = "江小魚"; // 設定jane物件的變數
        jane.address = "台北市";
        jane.age = 30;
        joe.printNameCard();  // 呼叫物件的方法
        jane.printNameCard();
        current.printNameCard();
    }
}
