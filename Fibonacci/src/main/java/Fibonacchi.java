import java.text.NumberFormat;

public class Fibonacchi {

    public static void main(String[] args) {
        //util
        Util util = new Util();
        System.out.println(util);

        Runtime runtime = Runtime.getRuntime();
        NumberFormat format = NumberFormat.getInstance();

        StringBuilder sb = new StringBuilder();
        long maxMemory = runtime.maxMemory();
        long allocatedMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();

        sb.append("free memory: " + format.format(freeMemory / 1024));
        sb.append(", allocated memory: " + format.format(allocatedMemory / 1024));
        sb.append(", max memory: " + format.format(maxMemory / 1024));
        System.out.println(sb.append(", total free memory: " + format.format((freeMemory + (maxMemory - allocatedMemory)) / 1024)));

        Fibonacchi fibonacchi = new Fibonacchi();
        //System.out.println(fibonacchi.fib(45));
        //System.out.println(fibonacchi.getNumber(100));
        //System.out.println(fibonacchi.getFibo(100));


        Faktoriális faktoriális = new Faktoriális();
        System.out.println(faktoriális.factorial(63));
    }

    //Sajat
    public int fib(int num){
        if (num < 2){
            return 1;
        }return  fib(num-1) + fib(num-2);
    }

    //Mate
    public long getNumber(int index) {
        long num1 = 0;
        long num2 = 1;
        long res = 0;
        for (int i = 0; i < index; i++) {
            res = num1 + num2;
            num1 = num2;
            num2 = res;
        }
        return res;
    }

    //Gergo
    public long getFibo(int n) {
        long[] fiboNumbers = new long[n];
        fiboNumbers[0] = 0;
        fiboNumbers[1] = 1;
        for (int i = 2; i < fiboNumbers.length; i++) {
            fiboNumbers[i] = fiboNumbers[i - 1] + fiboNumbers[i - 2];
        }
        return fiboNumbers[n - 1];
    }
}
