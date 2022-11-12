public class Fibonacci {
    static void fibonacciArr(int num) {
        int[] fibSequence = new int[num + 1];
        fibSequence[0] = 0;
        fibSequence[1] = 1;
        System.out.print(fibSequence[0] + " " + fibSequence[1]);
        for (int i = 2; i < num + 2; i++) {
            fibSequence[i] = fibSequence[i - 1] + fibSequence[i - 2];
            System.out.print(" " + fibSequence[i]);
        }
        System.out.println();
    }

    static int fibonacciRec(int num) {
        if (num == 1 || num == 0) {
            return num;
        } else {
            return fibonacciRec(num - 1) + fibonacciRec(num - 2);
        }
    }

    static void fibonacci(int num) {
        int firstNum = 0;
        int secondNum = 1;
        int tmp = 0;
        String str = String.format("%s, %s, ",firstNum,secondNum);

        for (int i = 2; i < num + 1; i++) {
            tmp = secondNum;
            secondNum = firstNum + secondNum;
            firstNum = tmp;
            System.out.print(" " + secondNum);
        }
        System.out.println();
    }

}
