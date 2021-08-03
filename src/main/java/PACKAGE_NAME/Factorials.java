package PACKAGE_NAME;

public class Factorials {
    public static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
    //10* factorial of 9
    //1* factorial of 0
}
