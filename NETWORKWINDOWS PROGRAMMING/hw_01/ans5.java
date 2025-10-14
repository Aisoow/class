import java.util.Scanner;

public class ans5 {
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        if(n<4)
        {
            double result = Math.pow(n, 3) + 8 * n;
            System.out.println(result);
        }
        else
        {
            System.out.println(n);
        }
    }
} 