import java.util.Scanner;

public class ans2 {
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double V = scanner.nextDouble();
        
        double result = 3*Math.pow(V, 2)+4*V+5;
        System.out.println(result);

    }
}

