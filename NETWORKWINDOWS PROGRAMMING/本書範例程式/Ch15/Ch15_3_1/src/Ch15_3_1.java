/* 程式範例: Ch15_3_1.java */
import java.io.*;
public class Ch15_3_1 {
    // 主程式
    public static void main(String[] args)
            throws Exception {
        String file = "Ch15_3_1.txt";
        // 建立FileOutputStream的輸出串流物件
        FileOutputStream output;
        output = new FileOutputStream(file);
        System.out.println("正在寫入檔案..." + file);
        output.write('J');  // 寫入字元
        output.write('a');
        output.write('v');
        output.write('a');
        output.write(' ');
        output.write('S');
        output.write('E');
        output.close();     // 關閉串流
        // 建立檔案物件
        File name = new File(file);
        int ch;
        System.out.println("檔案路徑: " +
                name.getAbsolutePath());
        // 建立FileInputStream的輸入串流物件
        FileInputStream input = new FileInputStream(name);
        while ( (ch = input.read()) != -1 ) // 讀取字元
            System.out.print((char) ch);
        input.close();     // 關閉串流
    }
}
