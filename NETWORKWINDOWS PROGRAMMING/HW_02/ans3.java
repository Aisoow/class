import java.util.Scanner;

public class ans3 {
    
    public static long fun(int n) {
        if(n<=2)
        {
            return 1;
        }
        else {
            return fun(n-1)+fun(n-2);
        }
        
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long result = fun(n);
        System.out.println(result);
        scanner.close();

    }
}