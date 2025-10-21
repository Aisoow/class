public class Ch2_3 {
    // 主程式
    public static void main(String[] args) {
        // 建立Scanner物件
        java.util.Scanner sc =
                new java.util.Scanner(System.in);
        System.out.print("請輸入姓名=> ");
        String name = sc.nextLine(); // 取得字串
        System.out.print("請輸入成績=> ");
        int grade = sc.nextInt(); // 取得整數
        System.out.print("請輸入身高=> ");
        double height = sc.nextDouble(); // 取得浮點數
        System.out.println("姓名:" + name);
        System.out.println("成績:" + grade);
        System.out.println("身高:" + height);
    }
}
