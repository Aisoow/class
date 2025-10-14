import java.util.Scanner;

public class ans6 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int maxvalue = scanner.nextInt();
        scanner.close();
        long fact = 1;
        int n = 1;
        while(fact<=maxvalue)
        {
            n++;
            fact *= n;
        }
        System.out.println(n);
    }
} 