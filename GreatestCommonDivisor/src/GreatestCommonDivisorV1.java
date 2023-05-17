public class GreatestCommonDivisorV1 {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int gcf = 1;

        if (y % x == 0) {
            gcf = x;
        } else if (x % y == 0) {
            gcf = y;
        } else {
            int min = Math.min(x, y);

            for (int i = 2; i <= min / i; i++) {
                if (x % (min / i) == 0 && y % (min / i) == 0) {
                    gcf = min / i;
                }
            }
        }

        System.out.println(gcf);
    }
}
