/* Java程式: Ch8_6_1.java */
public class Ch8_6_1 {
    // 主程式
    public static void main(String[] args) {
        // 最大值和最小值
        System.out.print("最大值max(34, 78): ");
        System.out.println(Math.max(34,78));
        System.out.print("最小值min(34, 78): ");
        System.out.println(Math.min(34,78));
        System.out.print("四捨五入round(34.567):");
        System.out.println(Math.round(34.567));
        System.out.print("四捨五入round(34.467):");
        System.out.println(Math.round(34.467));
        System.out.print("亂數random(): ");
        System.out.println(Math.random());
        // 0-10的亂數
        int no = (int)(Math.random()*10);
        System.out.println("0-10亂數: " + no);
        // 1-100的亂數
        no = (int)(Math.random()*100 + 1);
        System.out.println("1-100亂數: " + no);
    }
}
