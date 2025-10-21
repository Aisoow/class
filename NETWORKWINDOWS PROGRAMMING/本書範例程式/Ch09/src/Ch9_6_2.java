/* 程式範例: Ch9_6_2.java */
public class Ch9_6_2 {
    // 主程式
    public static void main(String[] args) {
        // 陣列宣告
        char[] charArr = { ' ', 'J', 'a', 'v', 'a', ' ' };
        String str = " JAVA "; // 使用String類別宣告字串
        // 使用建構子建立字串物件
        String str1, str2, str3, str4;
        str1 = new String(charArr);  // 使用字元陣列
        str2 = new String("程式語言的程式設計");
        str3 = new String("How to use computer!");
        str4 = "use";
        System.out.println("str字串:\"" + str + "\"");
        System.out.println("str1字串:\"" + str1 + "\"");
        System.out.println("str2字串:\"" + str2 + "\"");
        System.out.println("str3字串:\"" + str3 + "\"");
        System.out.println("str4字串:\"" + str4 + "\"");
        // 顯示字串長度和大小寫轉換
        System.out.print("str1長度:"+str1.length());
        System.out.println("/str2長度:"+str2.length());
        System.out.print("轉小寫:"+str1.toLowerCase());
        System.out.println("/轉大寫:"+str1.toUpperCase());
        // 搜尋字元和子字串
        System.out.print("英-字元indexOf(\'a\', 2): ");
        System.out.println(str1.indexOf('a', 2));
        System.out.print("英-字元lastIndexOf(\'b\',2): ");
        System.out.println(str1.lastIndexOf('b', 2));
        System.out.print("中-字串indexOf(\"語言\"): ");
        System.out.println(str2.indexOf("語言"));
        System.out.print("中-字串lastIndexOf(\"語言\"):");
        System.out.println(str2.lastIndexOf("語言"));
        // 子字串和字元的處理
        System.out.print("英文str1.charAt(4): ");
        System.out.println(str1.charAt(3));
        System.out.print("中文str2.substring(2, 6): ");
        System.out.println(str2.substring(2, 6));
        System.out.print("取代-英str1.replace('a','b'):");
        System.out.println(str1.replace('a','b'));
        System.out.print("刪除空白字元str1.trim(): ");
        System.out.println(str1.trim());
        String str0 = str1.concat(str2); // 連接兩字串
        System.out.println("連接str1.concat(str2): "+str0);
        // 顯示字串str和str1的比較結果
        System.out.print("比較str與str1字串: ");
        System.out.println(str.compareTo(str1));
        System.out.print("比較str與str1字串-不分大小寫: ");
        System.out.println(str.compareToIgnoreCase(str1));
        // 字串str與str1是否相等
        System.out.print("str與str1字串是否相等: ");
        System.out.println(str.equals(str1));
        System.out.print("str與str1是否相等-不分大小寫: ");
        System.out.println(str.equalsIgnoreCase(str1));
        // 檢查字串的字頭和字尾
        System.out.print("str4的結尾是否為\"s\": ");
        System.out.println(str4.endsWith("s"));
        System.out.print("str4的字頭是否為\"u\": ");
        System.out.println(str4.startsWith("u"));
    }
}
