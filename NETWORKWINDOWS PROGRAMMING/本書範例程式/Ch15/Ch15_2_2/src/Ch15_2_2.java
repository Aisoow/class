/* 程式範例: Ch15_2_2.java */
import java.io.*;
public class Ch15_2_2 {
    // 主程式
    public static void main(String[] args)
            throws Exception {
        String file = "Ch15_2_1.txt";
        File name = new File(file);  // 建立File物件
        if ( name.exists() ) {
            // 建立BufferedReader的輸入串流物件
            BufferedReader input = new BufferedReader(
                    new FileReader(name));
            String str;
            // 讀取資料
            while ( (str = input.readLine()) != null )
                System.out.println(str);
            input.close();      // 關閉串流
        }
        else
            System.out.println("檔案[" + name + "不存在!");
    }
}
