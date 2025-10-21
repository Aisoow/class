/* 程式範例: Ch4_3.java */
public class Ch4_3 {
    // 主程式
    public static void main(String[] args) {
        int age, offset = 3;  // 宣告變數
        age = 18;       // 使用指定敘述指定age變數值
        age = age + 1;  // 將變數age的值加1後
        System.out.println("age = " + age);
        age += offset; // 右邊是運算式且是簡潔寫法
        System.out.println("age = " + age);
    }
}
