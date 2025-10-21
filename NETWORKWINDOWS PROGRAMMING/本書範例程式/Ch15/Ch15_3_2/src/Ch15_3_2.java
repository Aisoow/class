/* 程式範例: Ch15_3_2.java */
import java.io.*;
public class Ch15_3_2 {
    // 主程式
    public static void main(String[] args)
            throws Exception {
        String file = "Ch15_3_2.txt";
        int[] units = { 2, 3 };
        double[] prices = { 299.0, 199.0 };
        String[] items = { "PDA", "MP3" };
        // 建立DataOutputStream的輸出串流物件
        DataOutputStream output = new DataOutputStream(
                new FileOutputStream(file));
        System.out.println("正在寫入檔案..." + file);
        for ( int i = 0; i < units.length; i++ ) {
            output.writeInt(units[i]);   // 寫入資料
            output.writeChar('\t');
            output.writeDouble(prices[i]);
            output.writeChar('\t');
            output.writeChars(items[i]);
            output.writeChar('\n');
        }
        output.close();          // 關閉串流
        // 建立檔案物件
        File name = new File(file);
        char ch;
        int unit;
        double price;
        StringBuffer item;
        System.out.println("檔案路徑: " +
                name.getAbsolutePath());
        // 建立DataInputStream的輸入串流物件
        DataInputStream input = new DataInputStream(
                new FileInputStream(name));
        try {
            while (true) {
                unit = input.readInt();  // 讀取資料
                input.readChar();
                price = input.readDouble();
                input.readChar();
                item = new StringBuffer();
                while ( (ch = input.readChar()) != '\n' )
                    item.append(ch);
                System.out.println("數量: " + unit);
                System.out.println("單價: " + price);
                System.out.println("名稱: " + item);
            }
        } catch ( EOFException e ) {}
        input.close();          // 關閉串流
    }
}
