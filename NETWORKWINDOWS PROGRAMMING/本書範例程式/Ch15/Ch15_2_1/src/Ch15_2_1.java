/* 程式範例: Ch15_2_1.java */
import java.io.*;
public class Ch15_2_1 {
    // 主程式
    public static void main(String[] args)
            throws Exception {
        String file = "Ch15_2_1.txt";
        String str1 = "學習Java程式設計\n";
        String str2 = "This is a pen.\n";
        // 建立BufferedWriter的輸出串流物件
        BufferedWriter output = new BufferedWriter(
                new FileWriter(file));
        System.out.println("正在寫入檔案..." + file);
        output.write(str1);     // 寫入字串
        output.write(str2);     // 寫入字串
        output.close();         // 關閉串流
        System.out.println("寫入檔案成功..." + file);
    }
}