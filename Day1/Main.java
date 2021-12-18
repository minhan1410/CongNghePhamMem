import java.util.Arrays;

public class Main {
    public static double[] PTBac2(double a, double b, double c) {
        if (a == 0) {
            if (b == 0)
                return c == 0 ? new double[] { Double.POSITIVE_INFINITY } : null;
            return c == 0 ? new double[] { 0 } : new double[] { -c / b };
        }

        if (a + b + c == 0) {
            return new double[] { 1, c / a };
        } else if (a - b + c == 0) {
            return new double[] { -1, -c / a };
        }

        double delta = b * b - 4 * a * c;
        if (delta < 0)
            return null;

        return delta == 0 ? new double[] { -b / (2 * a), -b / (2 * a) }
                : new double[] {
                        (-b + Math.sqrt(delta)) / (2 * a), (-b - Math.sqrt(delta)) / (2 * a) };
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(PTBac2(0, 0, 0)));
        System.out.println(Arrays.toString(PTBac2(0, 5, 0)));
        System.out.println(Arrays.toString(PTBac2(0, 0, 4)));
        System.out.println(Arrays.toString(PTBac2(2, -7, 3)));
        System.out.println(Arrays.toString(PTBac2(3, 2, 5)));
        System.out.println(Arrays.toString(PTBac2(1, -4, 4)));
        System.out.println(Arrays.toString(PTBac2(2, 0, -4)));
        System.out.println(Arrays.toString(PTBac2(1, 4, 0)));
        System.out.println(Arrays.toString(PTBac2(1, -5, 4)));
        System.out.println(Arrays.toString(PTBac2(Math.sqrt(Double.MAX_VALUE), Math.sqrt(Double.MAX_VALUE) / 3,
                Math.sqrt(Double.MAX_VALUE) / 3)));
    }
}
