public class LeastCommonMultiple {

    public static void main(String[] args) {

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int lcm = 0;
        int i = Math.min(x, y);

        while (lcm == 0) {
           if (i % x == 0 && i % y == 0) {
               lcm = i;
           }

           i++;
        }

        System.out.println(lcm);

        for (int j = Math.min(x, y); j <= x * y; j++) {
            if (j % x == 0 && j % y == 0) {
                lcm = j;
                break;
            }
        }

        System.out.println(lcm);

        int d = 1;

        for (int e = 1; e < x; e++) {
            if (x % e == 0 && y % e == 0) {
                d = e;
            }
        }

        System.out.println(x * y / d);
    }
}
