/* 程式範例: Ch15_2_3.java */
import java.io.*;
public class Ch15_2_3 {
    // 主程式
    public static void main(String[] args)
            throws Exception {
        String sour_path = "Ch15_2_1.txt";
        String dest_path = "Ch15_2_3.txt";
        File sour = new File(sour_path);  // 建立File物件
        File dest = new File(dest_path);
        if ( sour.exists() ) {
            // 建立BufferedReader的輸入串流物件
            BufferedReader input = new BufferedReader(
                    new FileReader(sour));
            // 建立BufferedWriter的輸出串流物件
            BufferedWriter output = new BufferedWriter(
                    new FileWriter(dest));
            int ch;
            System.out.println("正在複製檔案..." + dest);
            // 複製檔案內容
            while ( (ch = input.read()) != -1 )
                output.write(ch);
            input.close();    // 關閉串流
            output.close();
            System.out.println("複製檔案成功..." + dest);
        }
        else
            System.out.println("來源檔案["+sour+"不存在!");
    }
}