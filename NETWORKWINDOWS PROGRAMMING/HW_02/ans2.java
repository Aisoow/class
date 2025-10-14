import java.util.Scanner;

public class ans2 {
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;
        while (n / 2 > 10)
        {
            n /= 2;
            result++;
        }
        System.out.println(result);
        scanner.close();
    }
}

