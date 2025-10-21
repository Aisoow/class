/* Java程式: Ch8_6_2.java */
public class Ch8_6_2 {
    // 主程式
    public static void main(String[] args) {
        // 顯示數學常數
        System.out.println("E: " + Math.E);
        System.out.println("PI: " + Math.PI);
        // 數學函數
        double no = -19.536;
        System.out.println("測試值no: "+no);
        System.out.println("abs(no): "+Math.abs(no));
        System.out.println("ceil(no): "+Math.ceil(no));
        System.out.println("floor(no): "+Math.floor(no));
        System.out.println("rint(no): "+Math.rint(no));
        // 指數和對數函數
        double x = 13.536;
        double y = 3.57;
        System.out.println("測試值x/y: " + x + "/" +y);
        System.out.println("exp(x): " + Math.exp(x));
        System.out.println("log(x): " + Math.log(x));
        System.out.println("pow(x,y): " + Math.pow(x,y));
        System.out.println("sqrt(x): " + Math.sqrt(x));
        // 三角函數
        double deg = 60.0;
        double rad = Math.toRadians(deg);
        System.out.println("測試值deg/rad: "+deg+"/"+rad);
        System.out.println("sin(rad): " + Math.sin(rad));
        System.out.println("cos(rad): " + Math.cos(rad));
        System.out.println("tan(rad): " + Math.tan(rad));
    }
}
