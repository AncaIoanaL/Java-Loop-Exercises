public class Prime {

    public static void main(String[] args) {

        int x = Integer.parseInt(args[0]);
        boolean ePrim = true;

        for (int i = 2; i < x / i; i++) {
            if (x % i == 0) {
                ePrim = false;
            }
        }

        if (ePrim) {
            System.out.println(x + " is prime.");
        } else {
            System.out.println(x + " is not prime.");
        }
    }
}
