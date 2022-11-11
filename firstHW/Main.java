public class Main {
    public static void main(String[] args) {
        //FizzBuzz();
        //fibonacci(11);
        //factorial(8);
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100);
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        bubbleSort(nums);
        String string = "Hello, World!";
        vowelConsonantCounter(string);
    }

    static void FizzBuzz() {
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    static void fibonacciArr(int num) {
        int[] F = new int[num + 1];
        F[0] = 0;
        F[1] = 1;
        System.out.print(F[0] + " " + F[1]);
        for (int i = 2; i < num + 2; i++) {
            F[i] = F[i - 1] + F[i - 2];
            System.out.print(" " + F[i]);
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
        int f1 = 0;
        int f2 = 1;
        int tmp = 0;
        System.out.print(f1 + " " + f2);
        for (int i = 2; i < num + 1; i++) {
            tmp = f2;
            f2 = f1 + f2;
            f1 = tmp;
            System.out.print(" " + f2);
        }
        System.out.println();
    }

    static void factorial(int num) {
        int fac = 1;
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

    static void bubbleSort(int[] nums) {
        int len = nums.length;
        int tmp = 0;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    tmp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    static void vowelConsonantCounter(String string) {
        String[] strArr = string.toLowerCase().split("");
        int vowel = 0;
        String[] vowelLetters = {"a", "e", "i", "u", "y", "o"};
        int consonant = 0;
        String[] consonantLetters = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "z"};
        for (int i = 0; i < strArr.length; i++) {

            for (int j = 0; j < 20; j++) {
                if (j < 6 && strArr[i].equals(vowelLetters[j])) {
                    vowel++;
                    break;
                }
                if (strArr[i].equals(consonantLetters[j])) {
                    consonant++;
                    break;
                }
            }

        }
        System.out.println("number of vowel letters: " + vowel);
        System.out.println("number of consonant letters: " + consonant);
    }

}