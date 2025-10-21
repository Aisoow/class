/* Java程式: Ch6_3_1.java */
public class Ch6_3_1 {
    // 主程式
    public static void main(String[] args) {
        int grade;    // 變數宣告
        java.util.Scanner sc =
                new java.util.Scanner(System.in);
        System.out.print("請輸入成績=> ");
        grade = sc.nextInt(); // 取得成績值
        if ( grade >= 60 ) { // if/else條件敘述
            System.out.println("成績及格!" + grade);
        }
        else {
            System.out.println("成績不及格!" + grade);
        }
    }
}
