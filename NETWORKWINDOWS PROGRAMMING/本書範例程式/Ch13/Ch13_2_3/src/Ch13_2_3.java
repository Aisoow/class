/* 程式範例: Ch13_2_3.java */
class Department { // Department類別宣告
    private String name;
    private int pos;
    private Department itsSub[] = new Department[2];
    // 建構子: 使用參數設定初始值
    public Department(String name) {
        this.name = name;
        itsSub[0] = null;
        itsSub[1] = null;
    }
    // 成員方法: 新增子科系
    public void addDepartment(Department item) {
        itsSub[pos] = item;
        pos++;
    }
    // 成員方法: 顯示科系資料
    public void printSubDepartment(int space) {
        for ( int i = 0 ; i < space; i++ )
            System.out.print(" "); // 新增空白
        System.out.println("+科系: " + name);
        space++;
        for ( int i = 0 ; i < pos; i++ )
            if ( itsSub[i] != null)
                itsSub[i].printSubDepartment(space);
    }
}
// 主程式類別
public class Ch13_2_3 {
    // 主程式
    public static void main(String[] args) {
        // 宣告Department類別型態的變數, 並且建立物件
        Department mathStat=new Department("統計數學系");
        Department statistics=new Department("統計系");
        Department math=new Department("數學系");
        Department applyMath=new Department("應用數學系");
        // 新增科系資料
        mathStat.addDepartment(statistics);
        mathStat.addDepartment(math);
        math.addDepartment(applyMath);
        // 呼叫物件的方法
        mathStat.printSubDepartment(0);
        System.out.println("--------------");
        math.printSubDepartment(0);
    }
}