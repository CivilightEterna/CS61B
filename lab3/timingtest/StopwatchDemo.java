package timingtest;

import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by hug.
 */
public class StopwatchDemo {
    /** Computes the nth Fibonacci number using a slow naive recursive strategy.*/
    private static int fib(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Stopwatch sw = new Stopwatch();//创建 Stopwatch 对象 sw，此时计时开始。
        int fib41 = fib(41);//调用 fib(41) 计算第 41 个 Fibonacci 数。
        double timeInSeconds = sw.elapsedTime();//调用 sw.elapsedTime() 获取从创建计时器开始到现在的时间（秒）。
        System.out.println("The 50th fibonacci number is " + fib41);
        System.out.println("Time taken to compute 41st fibonacci number: " + timeInSeconds + " seconds.");
    }
}
