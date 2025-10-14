import java.util.Scanner;

public class no3 {
    public static int sumFromOne(int num) {
        int i, sum = 0;;  // 霈𦠜彍摰���
        for ( i = 1; i <= num; i++ ) {
            sum += i;
        }
        return sum;
    }
    static double convertTemp(double c) {
        double f;  // 霈𦠜彍摰���
        f = (9.0 * c) / 5.0 + 32.0;
        return f;
    }
    static boolean is_leap_year(int year) {
        if (year % 100 == 0) {    // ��敺�2雿滨��00
            if (year % 400 == 0)  // 鋡�400�㟲�膄
                return true;    // �糓
            else
                return false;   // 銝齿糓
        } else { // ��敺�2雿滢�齿糓00
            if (year % 4 == 0)    // 鋡�4�㟲�膄
                return true;    // �糓
            else
                return false;   // 銝齿糓
        }
    }
    static int factorial(int n) {
        if ( n == 1 )  // 蝯�甇Ｘ�苷辣
            return 1;
        else
            return n * factorial(n-1);
    }
    static boolean is_prime(int num) {
        int i;
        for (i = 2; i <= num - 1; i++)
            if (num % i == 0)  // 鋡勇�㟲�膄
                return false;  // 銝齿糓
        return true;           // �糓
    }
    // 銝餌�见��
    public static void main(String[] args) {
        int N;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("enter a number:");
        N = sc.nextInt();
        
        // 找出1949到N的所有閏年，將它們全部相加
        int sum = 0;
        for (int year = 1949; year <= N; year++) {
            if (is_leap_year(year)) {
                sum += year;
            }
        }
        System.out.println(sum);
    }
}