/* 程式範例: Ch11_4_4.java */
class Server {   // Server類別宣告
    // 成員變數
    public int x = 150;
    public int y = 120;
}
class Client { // Client類別宣告
    // 成員方法: 傳回值
    public int getX(Server s) { return s.x; }
    public int getY(Server s) { return s.y; }
}
// 主程式類別
public class Ch11_4_4 {
    // 主程式
    public static void main(String[] args) {
        // 宣告物件變數且建立物件
        Server server = new Server();
        Client client = new Client();
        // 顯示變數值
        System.out.println("x= " + client.getX(server));
        System.out.println("y= " + client.getY(server));
    }
}
