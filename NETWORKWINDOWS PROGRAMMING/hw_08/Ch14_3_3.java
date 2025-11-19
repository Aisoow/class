/* 程式範例: Ch14_3_3.java */
// 自訂Exception類別
class UserException extends Exception {
    // 變數宣告
    int data;

    // 建構子
    public UserException(int data) {
        this.data = data;
    }

    // 覆寫getMessage()方法
    public String getMessage() {
        return ("出價次數太多: " + data);
    }
}

class lowpriceException extends Exception {
    int data;

    public lowpriceException(int data) {
        this.data = data;
    }

    public String getMessage() {
        return ("出價過低" + data);
    }
}

// 主程式類別
public class Ch14_3_3 {
    // 主程式
    public static void main(String[] args) {
        try {
            int i;
            for (i = 0; i < 10; i++) {
                int price = (int) (Math.random() * 100);
                if (price < 50) {
                    throw new lowpriceException(price);
                }

                if (i == 5) {
                    // 丟出自訂的例外
                    throw new UserException(5);
                }
                System.out.println("出價次數: " + i);
            }
        } catch (UserException e) {
            // 處理自訂的例外
            System.out.println("例外說明: " + e.getMessage());
            // System.out.print("例外原因: ");
            // e.printStackTrace();
            return;
        } catch (lowpriceException l) {
            System.out.println("例外說明: " + l.getMessage());
            return;
        } finally {
            System.out.println("例外處理結束!");
        }
    }
}
