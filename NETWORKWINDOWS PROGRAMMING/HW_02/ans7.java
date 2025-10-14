import java.util.Scanner;

public class ans7 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int maxvalue = scanner.nextInt();
        scanner.close();
        int n = 1;
        while(n*n<=maxvalue)
        {
            n++;
        }
        System.out.println(n);
    }
} 