/* Java程式: AppA_2.java */
public class AppA_2 {
    // 主程式
    public static void main(String[] args) {
        int age;   // 變數宣告
        // 建立Scanner物件
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("請輸入年齡 => ");
        age = sc.nextInt(); // 取得年齡
        System.out.println("年齡 = " + age);
        if ( age > 18 && age < 65 ) { // if/else條件敘述
            System.out.print("購買全票!\n");
        }
        else {
            System.out.print("購買優待票!\n");
        }
    }
}
