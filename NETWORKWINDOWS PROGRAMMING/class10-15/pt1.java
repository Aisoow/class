public class pt1 {
    public static double f(double val) {
        return val * val - 4.2 * val + 3.6;
    }

    public static double bisection(double low, double upper) {
        double mid;
        while (true) {
            mid = (low + upper) / 2.0;
            if (Math.abs(f(mid)) < 1e-4) {
                break;
            }
            if (Math.signum(f(mid)) == Math.signum(f(low))) {
                low = mid;
            } else {
                upper = mid;
            }
        }
        return mid;
    }

    public static double bisection_for_g(double low, double upper) {
        double mid;
        while (true) {
            mid = (low + upper) / 2.0;
            if (Math.abs(mid) < 1e-4) {
                break;
            }
            if (Math.signum(mid) == Math.signum(mid)) {
                low = mid;
            } else {
                upper = mid;
            }
        }
        return mid;
    }

    public static double g(double val) {
        double h = 1e-5;
        return (f(val + h) - f(val)) / h;
    }

    public static void main(String[] args) {
        double ans;
        double min = -10000, max = 10000;
        double middle;
        middle = bisection_for_g(min, max);
        ans = bisection(min, middle);
        System.out.println("Root1 is: " + ans);
        ans = bisection(middle, max);
        System.out.println("Root2 is: " + ans);
    }
}
