import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int r = sumOfNumbers(n);
        System.out.println("The sum is: " + r);
        scanner.close();
    }

    public static int sumOfNumbers(int n)
    {
        if (n <= 0)
        {
            return 0;
        }
        else if (n == 1)
        {
            return 1;
        }
        else
        {
            return n + sumOfNumbers(n-1);
        }
    }
    
};