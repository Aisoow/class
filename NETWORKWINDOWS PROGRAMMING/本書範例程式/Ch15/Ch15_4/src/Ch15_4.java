/* 程式範例: Ch15_4.java */
import java.io.*;
public class Ch15_4 {
    // 主程式
    public static void main(String[] args)
            throws Exception {
        String file = "Ch15_4.txt";
        // 建立DataOutputStream的輸出串流物件
        DataOutputStream output = new DataOutputStream(
                new FileOutputStream(file));
        System.out.println("正在寫入檔案..." + file);
        output.writeBytes("Pen\n");
        output.writeBytes("FootBall\n");
        output.close();     // 關閉串流
        // 建立RandomAccessFile的輸入串流物件
        RandomAccessFile input;
        input = new RandomAccessFile(file,"rw");
        int ch;
        // 顯示檔案內容
        while ( (ch = input.read()) != -1 )
            System.out.print((char)ch);
        // 取得目前的檔案指標
        long filePointer = input.getFilePointer();
        // 設定檔案指標
        input.seek(filePointer - 4);
        // 讀取3個字元
        for ( int i = 0; i < 3; i++ )
            System.out.print((char)input.read());
        System.out.println();
        // 取得目前的檔案指標
        filePointer = input.getFilePointer();
        input.seek(filePointer - 3);
        input.write('o');   // 寫入資料
        input.write('o');
        // 顯示所有的檔案內容, 重設檔案指標
        input.seek(0);
        while ( (ch = input.read()) != -1 )
            System.out.print((char)ch);
        input.close();      // 關閉串流
    }
}
