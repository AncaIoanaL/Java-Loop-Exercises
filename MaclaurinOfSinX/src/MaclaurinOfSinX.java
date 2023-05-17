public class MaclaurinOfSinX {

    public static void main(String[] args) {

        int x = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        double result = 0;
        double a = 1;

        for(int f = 1; f <= n; f = f + 2) {
            result = result + ((double) power(x, f) / (double) factorial(f) * a);

            a = a * (-1);
        }

        System.out.println(result);
    }

    private static int power(int base, int power) {
        int resultPower = 1;

        for(int i = 1; i <= power; i++) {
            resultPower = resultPower * base;
        }

        return resultPower;
    }

    private static int factorial(int factor) {
        int resultFactorial = 1;

        for(int e = 1; e <= factor; e++) {
            resultFactorial = resultFactorial * e;
        }

        return resultFactorial;
    }
}
