/* Java程式: Ch6_6_2.java */
public class Ch6_6_2 {
    // 主程式
    public static void main(String[] args) {
        int choice, grade;  // 變數宣告
        java.util.Scanner sc =
                new java.util.Scanner(System.in);
        System.out.print("請輸入成績=> ");
        grade = sc.nextInt(); // 取得成績
        // 顯示文字模式的選單
        System.out.print("[1]GPA成績\n[2]是否及格\n");
        System.out.print("[3]成績加分\n[4]成績扣分\n==> ");
        choice = sc.nextInt(); // 讀入選項
        // switch 條件敘述
        switch ( choice ) {
            case 1: if ( grade >= 80 )
                       System.out.println("學生成績:A");
                    else if ( grade >= 70 )
                       System.out.println("學生成績:B");
                    else if ( grade >= 60 )
                       System.out.println("學生成績:C");
                    else
                       System.out.println("學生成績:D");
                    break;
            case 2: if ( grade >= 60 )
                       System.out.println("成績及格!");
                    else
                       System.out.println("成績不及格!");
                    break;
            case 3: grade += 10;
                    System.out.println("加分後成績: " + grade);
                    break;
            case 4: grade -= 10;
                    System.out.println("扣分後成績: " + grade);
                    break;
            default:  System.out.println("輸入成績: " + grade);
                    break;
        }
    }
}
