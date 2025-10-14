public class pr1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 1000; i++)
            if (i % 2 * i % 5 * i % 7 == 0) {
                sum += i;
                System.out.println("|" + i + "|");
            }

        System.out.println(sum);
    }
}
