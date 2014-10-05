package main;

public class GCDCalculator {

    public static long calculate(long num1, long num2) {
        if(num1 == num2) {
            return num1;
        }

        long a = num2;
        long b = num1;

        if(num1 > num2) {
            a = num1;
            b = num2;
        }

        while(b > 0) {
            long q = (long) Math.floor(a / b);
            long r = a - (b * q);
            a = b;
            b = r;
        }
        
        return a;
    }

    public static void main(String[] args) {
        System.out.println(GCDCalculator.calculate(225277L, 178794L));
    }

}
