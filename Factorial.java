package nadiatests;

/**
 * Created with IntelliJ IDEA.
 * User: nadhami
 * Date: 1/6/18
 * Time: 3:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class Factorial {
    public static int factor(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return n * factor(n-1);
        }
    }
    public static void main(String args[]) {
        int n = 5;
        int f = factor(n);
        System.out.println("Factorial of "+n+" is "+f);
        n = 123456;
        double p = lastNdigits(n,3);
        System.out.println("lastNDigits of ("+n+","+"3) is "+(int)p);
        System.out.println("powerOfTwo ("+4+") = "+powerOfTwo(4));
        System.out.println("powerOfTwo ("+6+") = "+powerOfTwo(6));

    }
    public static double lastNdigits(int number, int position) {
        double power = Math.pow (10,position);
        return number % power;
    }
    public static boolean powerOfTwo(int x) {
        return ((x & (x-1))  == 0);
    }
}
