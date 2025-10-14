import java.util.Scanner;

public class ans3  {
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        float R = scanner.nextFloat();
        
        double result = 4/3*Math.PI*Math.pow(R, 3);
        System.out.println(result);

    }
}