/* Java程式: Ch6_5_1.java */
public class Ch6_5_1 {
    // 主程式
    public static void main(String[] args) {
        int grade;    // 變數宣告\
        java.util.Scanner sc =
                new java.util.Scanner(System.in);
        System.out.print("請輸入成績=> ");
        grade = sc.nextInt(); // 取得成績值
        // if/else/if多選一條件敘述
        if ( grade >= 80 ) {
            System.out.println("甲等!");
        }
        else if ( grade >= 70 ) {
            System.out.println("乙等!");
        }
        else if ( grade >= 60 ) {
            System.out.println("丙等!");
        }
        else {
            System.out.println("丁等!");
        }
    }
}
