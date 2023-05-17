public class MaclaurinOfCosX {

    public static void main(String[] args) {

        int x = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        double result = 1;
        int a  = -1;

        System.out.println("x = " + x);
        System.out.println("n = " + n);

        for(int i = 2; i <= n; i = i + 2) {
            System.out.println("power = " + power(x, i));
            System.out.println("factorial = " + factorial(i));
            System.out.println("a = " + a);

            result = result + ((double) power(x, i) / (double) factorial(i) * a);
            a = a * (-1);

            System.out.println("result = " + result);
        }

        System.out.println(result);
    }


    private static int power(int base, int power) {
        int resultPower = 1;

        for(int p = 1; p <= power; p++) {
            resultPower = resultPower * base;
        }
        return resultPower;
    }

    private static int factorial(int factor) {
        int resultFactorial = 1;

        for(int f = 1; f <= factor; f++) {
            resultFactorial = resultFactorial * f;
        }
        return resultFactorial;
    }
}

