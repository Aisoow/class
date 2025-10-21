/* Java程式: Ch6_5_2.java */
public class Ch6_5_2 {
    // 主程式
    public static void main(String[] args) {
        char GPA;   // 變數宣告
        java.util.Scanner sc =
                new java.util.Scanner(System.in);
        System.out.print("請輸入GPA=> ");
        GPA = sc.nextLine().charAt(0); // 取得GPA成績
        // switch多選一條件敘述
        switch ( GPA ) {
            case 'A':
                System.out.println("成績範圍超過80分");
                break;
            case 'B':
                System.out.println("成績範圍70~79分");
                break;
            case 'C':
                System.out.println("成績範圍60~69分");
                break;
            default:
                System.out.println("不及格");
                break;
        }
    }
}
