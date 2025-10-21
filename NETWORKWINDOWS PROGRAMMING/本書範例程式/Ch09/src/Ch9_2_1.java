/* 程式範例: Ch9_2_1.java */
public class Ch9_2_1 {
    // 主程式
    public static void main(String[] args) {
        int total = 0;    // 宣告變數
        int[] grades = new int[4];    // 宣告int陣列
        grades[0] = 81;   // 指定陣列值
        grades[1] = 93;
        grades[2] = 77;
        grades[3] = 59;
        System.out.println("成績1: " + grades[0]);   // 顯示陣列值
        System.out.println("成績2: " + grades[1]);
        System.out.println("成績3: " + grades[2]);
        System.out.println("成績4: " + grades[3]);
        total = grades[0]+grades[1]+grades[2]+grades[3];
        System.out.println("成績總分: " + total);
        System.out.println("成績平均: " + total/4.0);
    }
}
