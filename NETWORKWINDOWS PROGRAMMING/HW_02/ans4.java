import java.util.Scanner;

public class ans4  {
    
    public static long fun(int i) {
        if(i<=2)
        {
            return 1;
        }
        else {
            return fun(i-1)*2;
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