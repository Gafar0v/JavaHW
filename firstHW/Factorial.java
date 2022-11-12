public class Factorial {
    static void factorial(int num) {
        long fac = 1;
        System.out.print(fac);
        for (int i = 2; i < num + 1; i++) {
            fac *= i;
            System.out.print(" " + fac);
        }
    }

    static int factorialRec(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * factorialRec(num - 1);
        }
    }
}
