/* Java程式: Ch17_6_4.java */
interface MyPerson {   // MyPerson介面宣告
    default void sayHi() {  // 預設方法
        System.out.println("大家好!");
    }
}
interface MyStudent {   // MyStudent介面宣告
    default void sayHi() {   // 預設方法
        System.out.println("Hi!");
    }
}
// Joe類別實作MyPerson和MyStudent介面
class Joe implements MyPerson, MyStudent {
    @Override
    public void sayHi() {   // 覆寫SayHi()方法
        MyStudent.super.sayHi();
    }
}
// 主類別
public class Ch17_6_4 {
    // 主程式
    public static void main(String[] args) {
        Joe j = new Joe();   // 建立Joe物件
        j.sayHi();           // 呼叫方法
    }
}
