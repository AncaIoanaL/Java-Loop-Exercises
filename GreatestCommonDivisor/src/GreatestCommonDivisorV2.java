public class GreatestCommonDivisorV2 {

    public static void main(String[] args) {

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int max = 1;

        if (y % x == 0) {
            max = x;
        } else if (x % y == 0) {
            max = y;
        } else if (x < y) {
            for (int i = 2; i <= x / i; i++) {
                if (x % (x / i) == 0 && y % (x / i) == 0) {
                    max = x / i;
                }
            }
        } else {
            for (int i = 2; i <= y / i; i++) {
                if (x % (y / i) == 0 && y % (y / i) == 0) {
                    max = y / i;
                }
            }
        }


        System.out.println(max);
    }
}